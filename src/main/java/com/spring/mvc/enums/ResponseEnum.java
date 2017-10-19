package com.spring.mvc.enums;

/**
 * @author guojunguang
 * @date 2017/10/12
 * @decription 响应枚举类
 */
public enum ResponseEnum {
    SUCCESS("0000","成功"),
    ERROR9999("9999","系统异常");


    private String code;
    private String message;

    private ResponseEnum(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
