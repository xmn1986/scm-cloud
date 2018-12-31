package org.trc.scm.purchase.controller.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trc.scm.common.utils.SupplyConstants;
import org.trc.scm.purchase.biz.supplier.ISupplierApplyBiz;
import org.trc.scm.purchase.dao.domain.SupplierApply;

import javax.annotation.Resource;

@RestController
@RequestMapping("supplier")
public class SupplierApplyController {

    @Resource
    private ISupplierApplyBiz supplierApplyBiz;

    /**
     * 供应商申请
     */
    @PostMapping("/supplierApply")
    public void saveSupplierApply(SupplierApply supplierApply) throws Exception{

        supplierApplyBiz.saveSupplierApply(supplierApply);
    }
}
