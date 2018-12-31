package org.trc.scm.purchase.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.purchase.model.domain.Purchase;
import org.trc.scm.purchase.service.PurchaseService;

import java.util.Date;

/**
 * Created by hzcyn on 2018/12/14.
 */
@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping("/hello/hello")
    public String from() {
        Purchase purchase = new Purchase();
        purchase.setCreatedTime(new Date());
        purchase.setCreatedBy("a");
        purchaseService.insert(purchase);
        return "hello";
    }
}
