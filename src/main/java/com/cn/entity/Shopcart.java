package com.cn.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
public class Shopcart extends Model<Shopcart> {

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

    public Shopcart setId(String id) {
        this.id = id;
        return this;
    }

    public String getGid() {
        return gid;
    }

    public Shopcart setGid(String gid) {
        this.gid = gid;
        return this;
    }

    public String getGname() {
        return gname;
    }

    public Shopcart setGname(String gname) {
        this.gname = gname;
        return this;
    }

    public String getGtype() {
        return gtype;
    }

    public Shopcart setGtype(String gtype) {
        this.gtype = gtype;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public Shopcart setPrice(Float price) {
        this.price = price;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public Shopcart setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public Shopcart setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public Shopcart setCreatetime(Date createtime) {
        this.createtime = createtime;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Shopcart{" +
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
