package org.trc.scm.product.dao;

import org.springframework.stereotype.Repository;
import org.trc.scm.common.support.ServiceDAO;
import org.trc.scm.product.mapper.ItemsMapper;
import org.trc.scm.product.model.domain.Items;

/**
 * @Auther: hzluoxingcheng
 * @Date: 2018/12/20 15:33
 * @Description:
 */
@Repository
public class ItemsDao extends ServiceDAO<ItemsMapper,Items> {
}
