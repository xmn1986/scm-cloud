package org.trc.scm.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by hzwdx on 2017/4/22.
 */
public enum CommonExceptionEnum {
    /**
     * 通用功能:2000开头
     */
    PARAM_CHECK_EXCEPTION("2000100","参数校验错误"),
    DATA_EXCEPTION("2000101","数据错误"),
    JAVA_BEAN_TO_MAP_EXCEPTION("2000102","JavaBean转Map数据转换异常"),
    MAPJ_TO_AVA_BEAN_EXCEPTION("2000103","Map转JavaBean数据转换异常"),
    NULL_EXCEPTION("2000104","系统繁忙"),
    REMOTE_TIMEOUT("2000105","远程服务超时"),
    REMOTE_ERROR("2000106","远程服务错误"),
    SAVE_DATE_ERROR("2000107","数据保存异常"),
    UPDATE_FAIL("2000108","数据更新异常"),
    SVAE_OR_UPDATE_FAIL("2000109","数据新增或更新异常"),



    NOVALID("0","停用");

    private String code;
    private String message;

    CommonExceptionEnum(String code, String message){
        this.code = code;
        this.message = message;
    }


    /**
     *
     * @Title: getExceptionEnumByCode
     * @Description: 根据枚举编码获取枚举
     * @param @param name
     * @param @return
     * @return CommonExceptionEnum
     * @throws
     */
    public static CommonExceptionEnum getExceptionEnumByCode(String code){
        for(CommonExceptionEnum exceptionEnum : CommonExceptionEnum.values()){
            if(StringUtils.equals(exceptionEnum.getCode(), code)){
                return exceptionEnum;
            }
        }
        return null;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }


}
