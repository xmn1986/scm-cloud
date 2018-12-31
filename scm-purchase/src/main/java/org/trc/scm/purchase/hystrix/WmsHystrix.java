package org.trc.scm.purchase.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.trc.scm.purchase.remote.WmsRemote;


/**
 * Created by hzcyn on 2018/12/18.
 */
@Component
public class WmsHystrix implements WmsRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "error";
    }
}
