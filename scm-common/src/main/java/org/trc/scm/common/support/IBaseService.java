package org.trc.scm.common.support;

import org.springframework.stereotype.Service;
import org.trc.scm.common.enums.ConditionEnum;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by george on 2017/3/23.
 */
@Service
public interface IBaseService<T,PK> {

    int insert(T record);

    int insertList(List<T> records);

    int insertSelective(T record);

    int deleteByPrimaryKey(PK key);

    int deleteByExample(Example example);

    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);

    int updateByExample(T t, Example example);

    int updateByExampleSelective(T t, Example example);

    T selectOne(T record);

    T selectByPrimaryKey(PK key);

    List<T> select(T record);

    List<T> selectByExample(Object example);

    int selectCountByExample(Object example);

    T selectByOnlyCode(String filed, String code);

    List<T> selectMany(String[] filed, Object[] values, ConditionEnum[] conditions);

}
