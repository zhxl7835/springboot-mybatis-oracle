package com.zhxl.springboot.entity;

import java.io.Serializable;

public class School implements Serializable {
    private Integer xxdm;
    private String xxmc;
    private String dz;

    public Integer getXxdm() {
        return xxdm;
    }

    public void setXxdm(Integer xxdm) {
        this.xxdm = xxdm;
    }

    public String getXxmc() {
        return xxmc;
    }

    public void setXxmc(String xxmc) {
        this.xxmc = xxmc;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    @Override
    public String toString() {
        return "School{" +
                "xxdm=" + xxdm +
                ", xxmc='" + xxmc + '\'' +
                ", dz='" + dz + '\'' +
                '}';
    }

    public School(Integer xxdm, String xxmc, String dz) {
        this.xxdm = xxdm;
        this.xxmc = xxmc;
        this.dz = dz;
    }
}
