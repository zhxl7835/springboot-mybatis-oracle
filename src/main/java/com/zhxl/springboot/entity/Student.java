package com.zhxl.springboot.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer xh;
    private String xm;
    private String sfzh;
    private String zy;
    private String xxdm;

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getXxdm() {
        return xxdm;
    }

    public void setXxdm(String xxdm) {
        this.xxdm = xxdm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "xh=" + xh +
                ", xm='" + xm + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", zy='" + zy + '\'' +
                ", xxdm='" + xxdm + '\'' +
                '}';
    }

    public Student(Integer xh, String xm, String sfzh, String zy, String xxdm) {
        this.xh = xh;
        this.xm = xm;
        this.sfzh = sfzh;
        this.zy = zy;
        this.xxdm = xxdm;
    }
}
