package org.trc.scm.product.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.product.biz.ProductorService;
import org.trc.scm.product.model.domain.Items;


/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 14:35
 * @Description: 商品管理（服务之间调用接口管理）
 */

@RestController
public class ProductApi {

    @Autowired
    private ProductorService productorService;


    /**
     * @Description: 根据spucode查询商品记录
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */ 
    @GetMapping("/getItemBySpuCode")
    public Items getItemBySpuCode(String spuCode){
       return  productorService.getItemBySpuCode(spuCode);
    }


}
