package org.trc.scm.purchase.dao.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@TableName("apply_for_supplier")
@Setter
@Getter
public class SupplierApply implements Serializable{

    @TableId("id")
    private Long id;

    @TableField("apply_code")
    private String applyCode;//申请编号

    @TableField("supplierId")
    private Long supplierId;//供应商Id

    @TableField("channel_id")
    private Long channelId;//渠道Id

    @TableField("supplier_code")
    private String supplierCode;//供应商编号

    @TableField("channel_code")
    private String channelCode;//渠道编号

    @TableField("description")
    private String description;//说明

    @TableField("status")
    private Integer status;//审核状态

    @TableField("is_deleted")
    private String isDeleted;//是否删除:0-否,1-是

    @TableField("audit_opinion")
    private String auditOpinion;//审核意见

    @TableField("create_operator")
    private String createOperator;//创建人

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;



}
