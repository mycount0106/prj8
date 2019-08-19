package com.woniu.entity;

public class Rate {
    private Integer rateid;

    private Integer deadline;

    private Double depostitrate;

    private Double loanrate;

    public Integer getRateid() {
        return rateid;
    }

    public void setRateid(Integer rateid) {
        this.rateid = rateid;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Double getDepostitrate() {
        return depostitrate;
    }

    public void setDepostitrate(Double depostitrate) {
        this.depostitrate = depostitrate;
    }

    public Double getLoanrate() {
        return loanrate;
    }

    public void setLoanrate(Double loanrate) {
        this.loanrate = loanrate;
    }
}