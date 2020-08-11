package com.college.common.entity;

import java.util.Date;
import javax.persistence.*;

public class College {
    /**
     * 学院编号
     */
    @Id
    private Integer cid;

    /**
     * 学院名称
     */
    private String cname;

    /**
     * 学院地址
     */
    private String caddress;

    /**
     * 创办时间
     */
    private Date createtime;

    /**
     * 学院院徽
     */
    private String cpic;

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

    /**
     * 获取学院名称
     *
     * @return cname - 学院名称
     */
    public String getCname() {
        return cname;
    }

    /**
     * 设置学院名称
     *
     * @param cname 学院名称
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * 获取学院地址
     *
     * @return caddress - 学院地址
     */
    public String getCaddress() {
        return caddress;
    }

    /**
     * 设置学院地址
     *
     * @param caddress 学院地址
     */
    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    /**
     * 获取创办时间
     *
     * @return createtime - 创办时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创办时间
     *
     * @param createtime 创办时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取学院院徽
     *
     * @return cpic - 学院院徽
     */
    public String getCpic() {
        return cpic;
    }

    /**
     * 设置学院院徽
     *
     * @param cpic 学院院徽
     */
    public void setCpic(String cpic) {
        this.cpic = cpic == null ? null : cpic.trim();
    }
}