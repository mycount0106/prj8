package com.woniu.entity;

import java.util.Date;

public class Log {
    private Integer logid;

    private Date logtime;

    private String logperson;

    private String operation;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    public String getLogperson() {
        return logperson;
    }

    public void setLogperson(String logperson) {
        this.logperson = logperson;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}