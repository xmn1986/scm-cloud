package org.trc.scm.product.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.trc.scm.product.hystrix.PurchaseRemoteFactory;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 18:25
 * @Description:
 */
@FeignClient(name="purchase" ,fallbackFactory = PurchaseRemoteFactory.class)
public interface PurchaseRemote {
    
    /**
     * @Description:Feign 调用采购
     * @Author: hzluoxingcheng
     * @Date: 2018/12/19
     */
    @RequestMapping(value = "/test")
    public String test();




}
