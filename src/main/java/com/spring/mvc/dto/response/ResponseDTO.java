package com.spring.mvc.dto.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author guojunguang
 * @date 2017/10/12
 * @decription
 */
public class ResponseDTO<T>  implements Serializable{
    private static final long serialVersionUID = 5343813977161574025L;

    public String code;//响应code
    public String message;//响应信息
    public T responseData;//响应数据

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

    public T getResponseData() {
        return responseData;
    }

    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
