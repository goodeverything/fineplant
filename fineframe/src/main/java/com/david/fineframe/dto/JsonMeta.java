package com.david.fineframe.dto;

/**
 * 用于封装操作成功和失败的消息
 * Created by sunqinwei on 2017/6/27.
 */
public class JsonMeta {
    private boolean success;
    private String code;
    private String message;

    public JsonMeta() {
    }

    public JsonMeta(boolean success) {
        this.success = success;
    }

    public JsonMeta(boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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
