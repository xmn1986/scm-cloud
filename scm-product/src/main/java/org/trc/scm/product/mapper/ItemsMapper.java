package org.trc.scm.product.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tairanchina.csp.dew.jdbc.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.trc.scm.product.model.domain.Items;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/20 16:13
 * @Description:
 */
@Mapper
public interface ItemsMapper extends BaseMapper<Items> {

    /**
     * @Description: 根据spucode 查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */
    public Items getItemBySpuCode(@Param("spuCode")  String spuCode);

}
