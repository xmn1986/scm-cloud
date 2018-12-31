package org.trc.scm.product.model.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.trc.scm.common.support.BaseEntity;

/**
 * @Description: 生成的有些出入问题，到时再看
 * @Author: hzluoxingcheng
 * @Date: 2018/12/19
 */ 
@Getter
@Setter
@Table(name = "items")
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品SPU编号
     */
    @TableField( "spu_code")
    @ApiModelProperty("商品SPU编号")
    private String spuCode;

    /**
     * 商品名称
     */
    @TableField("name")
    @ApiModelProperty("商品名称")
    private String name;

    /**
     * 所属类目编号
     */
    @TableField("category_id")
    @ApiModelProperty("所属类目编号")
    private Long categoryId;

    /**
     * 所属品牌编号
     */
    @TableField("brand_id")
    @ApiModelProperty("所属品牌编号")
    private Long brandId;

    /**
     * 贸易类型
     */
    @TableField("trade_type")
    @ApiModelProperty("贸易类型")
    private String tradeType;

    /**
     * 商品货号
     */
    @TableField("item_no")
    @ApiModelProperty("商品货号")
    private String itemNo;

    /**
     * 商品重量,单位/g
     */
    @TableField("weight")
    @ApiModelProperty("商品重量,单位/g")
    private Long weight;

    /**
     * 生产商
     */
    @TableField("producer")
    @ApiModelProperty("生产商")
    private String producer;

    /**
     * 参考市场价
     */
    @TableField( "market_price")
    @ApiModelProperty("参考市场价")
    private Long marketPrice;

    /**
     * 商品图片路径,多个路径用逗号隔开
     */
    @TableField("pictrue")
    @ApiModelProperty("商品图片路径,多个路径用逗号隔开")
    private String pictrue;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 属性量id；格式为123;223;212;
     */
    @TableField("properties")
    @ApiModelProperty("属性量id；格式为123;223;212;")
    private String properties;

    /**
     * 是否有效:0-无效,1-有效
     */
    @TableField("is_valid")
    @ApiModelProperty("是否有效:0-无效,1-有效")
    private String isValid;

    /**
     * 是否删除:0-否,1-是
     */
    @TableField("is_deleted")
    @ApiModelProperty("是否删除:0-否,1-是")
    private String isDeleted;

    /**
     * 创建人
     */
    @TableField( "create_operator")
    @ApiModelProperty("创建人")
    private String createOperator;

    /**
     * 创建时间,格式yyyy-mm-dd hh:mi:ss
     */
    @TableField( "create_time")
    @ApiModelProperty("创建时间,格式yyyy-mm-dd hh:mi:ss")
    private Date createTime;

    /**
     * 最后更新时间,格式yyyy-mm-dd hh:mi:ss
     */
    @TableField("update_time")
    @ApiModelProperty("最后更新时间,格式yyyy-mm-dd hh:mi:ss")
    private Date updateTime;

    /**
     * 是否有保质期管理 0-没有，1-有
     */
    @TableField( "is_quality")
    @ApiModelProperty("是否有保质期管理 0-没有，1-有")
    private String isQuality;

    @TableField("quality_day")
    @ApiModelProperty("")
    private Long qualityDay;

    /**
     * V3.3-商品类别：0-小泰良品，1-非小泰良品
     */
    @TableField("item_type")
    @ApiModelProperty("V3.3-商品类别：0-小泰良品，1-非小泰良品")
    private String itemType;

    /**
     * spu主图路径，多张以逗号分隔
     */
    @TableField("main_picture")
    @ApiModelProperty("spu主图路径，多张以逗号分隔")
    private String mainPicture;


}