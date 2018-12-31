package org.trc.scm.product.hystrix;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.trc.scm.product.remote.PurchaseRemote;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 18:28
 * @Description:   服务降低 可以获取错误信息的功能
 */
@Component
public class PurchaseRemoteFactory  implements FallbackFactory<PurchaseRemote> {

    @Override
    public PurchaseRemote create(Throwable cause) {
         return  new PurchaseRemote(){
             @Override
             public String test() {
                 return "服务降级";
             }
         };

    }
}
