package com.loongcheer.advertisement.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResultCommon<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 返回代码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 成功标志
     */
    private boolean success;
    /**
     * 返回数据
     */
    private T data;

    public ResultCommon(){

    }

    public ResultCommon<T> success(String message) {
        this.message = message;
        this.code = 200;
        this.success = true;
        return this;
    }

    public static ResultCommon<Object> ok() {
        ResultCommon<Object> r = new ResultCommon<>();
        r.setSuccess(true);
        r.setCode(200);
        r.setMessage("成功");
        return r;
    }

    public static ResultCommon<Object> ok(String msg) {
        ResultCommon<Object> r = new ResultCommon<>();
        r.setSuccess(true);
        r.setCode(200);
        r.setMessage(msg);
        return r;
    }

    public static ResultCommon<Object> ok(String msg, Object data) {
        ResultCommon<Object> r = new ResultCommon<>();
        r.setSuccess(true);
        r.setCode(200);
        r.setMessage(msg);
        r.setData(data);
        return r;
    }

    public static ResultCommon<Object> ok(Object data) {
        ResultCommon<Object> r = new ResultCommon<Object>();
        r.setSuccess(true);
        r.setCode(200);
        r.setData(data);
        return r;
    }

    public static ResultCommon<Object> error(String msg) {
        return error(500, msg);
    }

    public static ResultCommon<Object> error(int code, String msg) {
        ResultCommon<Object> r = new ResultCommon<Object>();
        r.setCode(code);
        r.setMessage(msg);
        r.setSuccess(false);
        return r;
    }

    public ResultCommon<T> error500(String message) {
        this.message = message;
        this.code = 500;
        this.success = false;
        return this;
    }
}

