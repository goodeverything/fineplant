package com.david.fineframe.dto;

/**
 * 用于封装返回数据
 * Created by sunqinwei on 2017/6/26.
 */
public class JsonResult<T> {
    private JsonMeta meta;
    private T data;

    public JsonResult(boolean success,String code,String message){
        this.meta = new JsonMeta(success, code, message);
    }
    public JsonResult(boolean success,T data){
        this.meta = new JsonMeta(success);
        this.data = data;
    }

    public JsonResult(JsonMeta meta, T data) {
        this.meta = meta;
        this.data = data;
    }

    public JsonMeta getMeta() {
        return meta;
    }

    public void setMeta(JsonMeta meta) {
        this.meta = meta;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
