package org.trc.scm.common.support;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.trc.scm.common.enums.ConditionEnum;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by george on 2017/3/23.
 */
public class BaseService<T,PK> implements IBaseService<T,PK> {

    @Autowired
    private Mapper<T> mapper;
    @Autowired
    private MySqlMapper<T> mySqlMapper;

    @Override
    public int insert(T record) {
        return mapper.insert(record);
    }

    @Override
    public int insertList(List<T> records) {
        return mySqlMapper.insertList(records);
    }

    @Override
    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(PK key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int deleteByExample(Example example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByExample(T t, Example example) {
        return mapper.updateByExample(t, example);
    }

    @Override
    public int updateByExampleSelective(T t, Example example) {
        return mapper.updateByExampleSelective(t, example);
    }

    @Override
    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public T selectByPrimaryKey(PK key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> select(T record) {
        return mapper.select(record);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample (Object example){return mapper.selectCountByExample(example);}

    @Override
    public T selectByOnlyCode(String filed, String code) {
        Example example = new Example(getTClass(), true, true);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo(filed, code);

        List<T> list = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }else if(list.size() > 1){
            throw new RuntimeException("该code匹配多条数据!");
        }else{
            return list.get(0);
        }
    }

    @Override
    public List<T> selectMany(String[] filed, Object[] values, ConditionEnum[] conditions) {
        if(ArrayUtils.isEmpty(filed) || ArrayUtils.isEmpty(values) || ArrayUtils.isEmpty(conditions)){
            throw new RuntimeException("传参不能为空");
        }
        if(filed.length != values.length?true:filed.length != conditions.length){
            throw new RuntimeException("值和字段数不相等");
        }

        Example example = new Example(getTClass(), true, true);
        Example.Criteria criteria = example.createCriteria();
        for(int i=0; i<filed.length; i++){
            setCriteria(criteria, filed[i], values[i], conditions[i]);
        }

        List<T> list = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }else {
            return list;
        }
    }

    private void setCriteria(Example.Criteria criteria, String filed, Object value, ConditionEnum condition){
        switch(condition){
            case EQUAL:
                criteria.andEqualTo(filed, value);
                break;
            case IN:
                criteria.andIn(filed, (Iterable)value);
                break;
            case LIKE:
                criteria.andLike(filed, value + "%");
                break;
            default:
                throw new RuntimeException("匹配不到条件");
        }
    }

    private Class<T> getTClass() {
        Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }
}
