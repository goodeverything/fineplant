package com.david.fineframe.dto;

/**
 *
 * Created by sunqinwei on 2017/6/26.
 */
public class JsonResult<T> {
    private boolean success;
    private T data;
    private String error;
    public JsonResult(boolean success, T data) {
        super();
        this.success = success;
        this.data = data;
    }
    public JsonResult(boolean success, String error) {
        super();
        this.success = success;
        this.error = error;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }

}
