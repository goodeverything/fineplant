package com.david.fineframe.entity;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 *
 * Created by sunqinwei on 2017/6/21.
 */
public class FrameDbversion {
    @NotNull(message = "软件名称不可为空")
    private String software;
    private String version;
    private String log;
    private Date createdTime;
    private String createdBy;
    private Date updatedTime;
    private String updatedBy;

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
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
        return "FrameDbversion{" +
                "software='" + software + '\'' +
                ", version='" + version + '\'' +
                ", log='" + log + '\'' +
                ", createdTime=" + createdTime +
                ", createdBy='" + createdBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }

    public FrameDbversion(String software, String version, String log, String createdBy, String updatedBy) {
        this.software = software;
        this.version = version;
        this.log = log;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public FrameDbversion() {
    }
}
