package org.trc.scm.product.core.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trc.scm.product.core.ProductCore;
import org.trc.scm.product.dao.ItemsDao;
import org.trc.scm.product.model.domain.Items;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/19 16:21
 * @Description: 核心层（服务功能的公共层）
 */
@Service
public class ProductCoreImpl  implements ProductCore {

    @Autowired
    private ItemsDao itemsDao;


    @Override
    public Items getItemBySpuCode(String spuCode) {
        EntityWrapper<Items> wrapper=new EntityWrapper<>();
        wrapper.eq("spu_code",spuCode);
        return itemsDao.selectOne(wrapper);

       // return itemsMapper.getItemBySpuCode(spuCode);

    }


}
