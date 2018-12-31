package org.trc.scm.product.biz;

import org.trc.scm.product.model.domain.Items;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 15:43
 * @Description:
 */
public interface ProductorService  {
    
    /**
     * @Description: 根据spuCode查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    public Items getItemBySpuCode(String spuCode);
}
