package com.cn.entity;

import java.io.Serializable;

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
public class Sendtype extends Model<Sendtype> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String sendtype;


    public String getId() {
        return id;
    }

    public Sendtype setId(String id) {
        this.id = id;
        return this;
    }

    public String getSendtype() {
        return sendtype;
    }

    public Sendtype setSendtype(String sendtype) {
        this.sendtype = sendtype;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Sendtype{" +
        "id=" + id +
        ", sendtype=" + sendtype +
        "}";
    }
}
