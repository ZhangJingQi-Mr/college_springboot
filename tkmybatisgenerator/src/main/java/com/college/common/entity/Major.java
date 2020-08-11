package com.college.common.entity;

import javax.persistence.*;

public class Major {
    /**
     * 专业编号
     */
    @Id
    private Integer mid;

    /**
     * 专业名称
     */
    private String mname;

    /**
     * 学分
     */
    private Integer credit;

    /**
     * 学制
     */
    @Column(name = "lifeYear")
    private Integer lifeyear;

    /**
     * 专业介绍
     */
    private String introduction;

    /**
     * 学院编号
     */
    private Integer cid;

    /**
     * 获取专业编号
     *
     * @return mid - 专业编号
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置专业编号
     *
     * @param mid 专业编号
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 获取专业名称
     *
     * @return mname - 专业名称
     */
    public String getMname() {
        return mname;
    }

    /**
     * 设置专业名称
     *
     * @param mname 专业名称
     */
    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    /**
     * 获取学分
     *
     * @return credit - 学分
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * 设置学分
     *
     * @param credit 学分
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * 获取学制
     *
     * @return lifeYear - 学制
     */
    public Integer getLifeyear() {
        return lifeyear;
    }

    /**
     * 设置学制
     *
     * @param lifeyear 学制
     */
    public void setLifeyear(Integer lifeyear) {
        this.lifeyear = lifeyear;
    }

    /**
     * 获取专业介绍
     *
     * @return introduction - 专业介绍
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置专业介绍
     *
     * @param introduction 专业介绍
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * 获取学院编号
     *
     * @return cid - 学院编号
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置学院编号
     *
     * @param cid 学院编号
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }
}