package com.project.passbook.constant;

/**
 * @Description 错误码枚举类
 * @date 2021/6/14-16:16
 */
public enum ErrorCode {
    SUCCESS(0,""),
    DUPLICATE_NAME(1,"商户名称重复"),
    EMPTY_LOGO(2,"商户logo为空"),
    EMPTY_BUSINESS_LICENSE(3, "商户营业执照为空"),
    ERROR_PHONE(4, "商户联系电话错误"),
    EMPTY_ADDRESS(5, "商户地址为空"),
    MERCHANTS_NOT_EXIST(6, "商户不存在");


    /** 错误码 */
    private Integer errCode;
    /** 错误信息 */
    private String errMessage;

    ErrorCode(Integer errCode, String errMessage) {
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
