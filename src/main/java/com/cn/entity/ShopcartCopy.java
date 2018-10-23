package com.cn.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
@TableName("shopcart_copy")
public class ShopcartCopy extends Model<ShopcartCopy> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String gid;
    private String gname;
    private String gtype;
    private Float price;
    private String uid;
    private Integer num;
    private Date createtime;


    public String getId() {
        return id;
    }

    public ShopcartCopy setId(String id) {
        this.id = id;
        return this;
    }

    public String getGid() {
        return gid;
    }

    public ShopcartCopy setGid(String gid) {
        this.gid = gid;
        return this;
    }

    public String getGname() {
        return gname;
    }

    public ShopcartCopy setGname(String gname) {
        this.gname = gname;
        return this;
    }

    public String getGtype() {
        return gtype;
    }

    public ShopcartCopy setGtype(String gtype) {
        this.gtype = gtype;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public ShopcartCopy setPrice(Float price) {
        this.price = price;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public ShopcartCopy setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public ShopcartCopy setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public ShopcartCopy setCreatetime(Date createtime) {
        this.createtime = createtime;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ShopcartCopy{" +
        "id=" + id +
        ", gid=" + gid +
        ", gname=" + gname +
        ", gtype=" + gtype +
        ", price=" + price +
        ", uid=" + uid +
        ", num=" + num +
        ", createtime=" + createtime +
        "}";
    }
}
