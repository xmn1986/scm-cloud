package org.trc.scm.purchase.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.trc.scm.purchase.hystrix.WmsHystrix;

/**
 * Created by hzcyn on 2018/12/18.
 */
@FeignClient(name= "wms", fallback = WmsHystrix.class)
public interface WmsRemote {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
