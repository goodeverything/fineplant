package com.david.fineframe.entity;

import java.util.Date;

/**
 * Created by sunqinwei on 2017/6/21.
 */
public class FrameDictdata {
    private String dictcode;
    private String datacode;
    private String dataname;
    private Date createdTime;
    private String createdBy;
    private Date updatedTime;
    private String updatedBy;

    public String getDictcode() {
        return dictcode;
    }

    public void setDictcode(String dictcode) {
        this.dictcode = dictcode;
    }

    public String getDatacode() {
        return datacode;
    }

    public void setDatacode(String datacode) {
        this.datacode = datacode;
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "FrameDictdata{" +
                "dictcode='" + dictcode + '\'' +
                ", datacode='" + datacode + '\'' +
                ", dataname='" + dataname + '\'' +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }

    public FrameDictdata(String dictcode, String datacode, String dataname) {
        this.dictcode = dictcode;
        this.datacode = datacode;
        this.dataname = dataname;
    }

    public FrameDictdata() {
    }
}
