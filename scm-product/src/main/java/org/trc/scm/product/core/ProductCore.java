package org.trc.scm.product.core;

import org.trc.scm.product.model.domain.Items;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 16:20
 * @Description: 核心层，用于抽离service层公共的功能
 */
public interface ProductCore {
    
    /**
     * @Description: 根据spucode编号查询记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    public Items getItemBySpuCode(String spuCode);


}
