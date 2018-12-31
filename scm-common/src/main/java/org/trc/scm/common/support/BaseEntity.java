package org.trc.scm.common.support;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.trc.scm.common.utils.DateUtils;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hzcyn on 2018/12/15.
 */
@Setter
@Getter
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 2393269568666085258L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("主键")
    private Long id;

    @Column(name = "created_by")
    @ApiModelProperty("记录创建人编码")
    private String createdBy;

    @Column(name = "created_time")
    @ApiModelProperty("记录创建时间")
    @DateTimeFormat(pattern = DateUtils.DATETIME_FORMAT)
    @JsonFormat(pattern= DateUtils.DATETIME_FORMAT, timezone="GMT+8")
    private Date createdTime;

    @Column(name = "updated_by")
    @ApiModelProperty("记录更新人编码")
    private String updatedBy;

    @Column(name = "updated_time")
    @ApiModelProperty("记录更新时间")
    @DateTimeFormat(pattern = DateUtils.DATETIME_FORMAT)
    @JsonFormat(pattern= DateUtils.DATETIME_FORMAT, timezone="GMT+8")
    private Date updatedTime;

    @Column(name = "is_deleted")
    @ApiModelProperty("记录是否删除")
    private Byte isDeleted;
}
