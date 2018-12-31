package org.trc.scm.product.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.scm.common.support.BaseService;
import org.trc.scm.product.core.ProductCore;
import org.trc.scm.product.model.domain.Items;
import org.trc.scm.product.biz.ProductorService;
import org.trc.scm.product.remote.PurchaseRemote;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 15:46
 * @Description:
 */
@Service
public class ProductorServiceImpl implements ProductorService {


    @Autowired
    private ProductCore productCore;

    @Autowired
    private PurchaseRemote purchaseRemote;

    /**
     * @Description: 根据spucode查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    @Override
    public Items getItemBySpuCode(String spuCode) {
//        Items items = new Items();
//        items.setSpuCode(spuCode);
//        return this.selectOne(items);

        System.out.println("开始远程调用");
        purchaseRemote.test();
        System.out.println("结束远程调用");

        //通过公共层调用
        return productCore.getItemBySpuCode(spuCode);

    }
}
