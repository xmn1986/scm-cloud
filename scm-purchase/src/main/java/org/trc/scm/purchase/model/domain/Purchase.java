package org.trc.scm.purchase.model.domain;

import lombok.Getter;
import lombok.Setter;
import org.trc.scm.common.support.BaseEntity;

import javax.persistence.Table;

@Getter
@Setter
@Table(name = "`purchase`")
public class Purchase extends BaseEntity {
    public static final String ID = "id";

    public static final String CREATED_BY = "createdBy";

    public static final String CREATED_TIME = "createdTime";

    public static final String UPDATED_BY = "updatedBy";

    public static final String UPDATED_TIME = "updatedTime";

    public static final String IS_DELETED = "isDeleted";

    private static final long serialVersionUID = 1L;
}