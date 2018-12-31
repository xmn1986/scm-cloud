package org.trc.scm.purchase.biz.impl.supplier;

import org.springframework.stereotype.Service;
import org.trc.scm.purchase.biz.supplier.ISupplierApplyBiz;
import org.trc.scm.purchase.dao.domain.SupplierApply;

@Service
public class SupplierApplyBiz implements ISupplierApplyBiz{

    @Override
    public void saveSupplierApply(SupplierApply supplierApply) {
        System.out.println("供应商申请成功");
    }
}
