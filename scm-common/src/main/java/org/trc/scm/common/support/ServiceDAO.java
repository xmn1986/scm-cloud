package org.trc.scm.common.support;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ecfront.dew.common.Page;
import org.apache.commons.lang3.StringUtils;
import org.trc.scm.common.utils.AssertUtil;

public class ServiceDAO<M extends BaseMapper<T>, T> extends ServiceImpl<M, T>{

    public Page<T> selectPage(PageBase pageBase, EntityWrapper<T> wrapper){
        checkPageParams(pageBase);
        Page<T> page = new Page<>();
        com.baomidou.mybatisplus.plugins.Page<T> _page =
                new com.baomidou.mybatisplus.plugins.Page(pageBase.getPageNumber(), pageBase.getPageSize());
        _page = selectPage(_page, wrapper);
        setPageResult(pageBase, page, _page);
        return page;
    }

    /**
     * 带排序的分页查询
     * @param queryModel
     * @param queryModel
     * @param wrapper
     * @return
     */
    public Page<T> selectPage(QueryModel queryModel, EntityWrapper<T> wrapper){
        checkPageParams(queryModel);
        Page<T> page = new Page<>();
        com.baomidou.mybatisplus.plugins.Page<T> _page =
                new com.baomidou.mybatisplus.plugins.Page(queryModel.getPageNumber(), queryModel.getPageSize());
        setOrderBy(queryModel, wrapper);
        _page = selectPage(_page, wrapper);
        setPageResult(queryModel, page, _page);
        return page;
    }

    protected void setPageResult(PageBase pageBase, Page<T> page, com.baomidou.mybatisplus.plugins.Page<T> _page){
        page.setRecordTotal(_page.getTotal());
        page.setPageNumber(pageBase.getPageNumber());
        page.setPageSize(pageBase.getPageSize());
        page.setPageTotal(_page.getTotal());
        page.setObjects(_page.getRecords());
    }

    /**
     * 检查分页参数
     * @param pageBase
     */
    protected void checkPageParams(PageBase pageBase){
        AssertUtil.notNull(pageBase.getPageNumber(), "分页查询参数pageNumber不能为空");
        AssertUtil.notNull(pageBase.getPageSize(), "分页查询参数pageSize不能为空");
    }

    /**
     * 设置排序
     * @param queryModel
     * @param wrapper
     */
    private void setOrderBy(QueryModel queryModel, EntityWrapper<T> wrapper){
        if(StringUtils.isNotEmpty(queryModel.getOrderBy())) {
            for(int i=0; i<queryModel.getOrderBys().length; i++){
                boolean isAsc = true;
                if(StringUtils.equals("DESC", queryModel.getOrders()[i].toUpperCase())){
                    isAsc = false;
                }
                wrapper.orderBy(queryModel.getOrderBys()[i], isAsc);
            }
        }
    }


}
