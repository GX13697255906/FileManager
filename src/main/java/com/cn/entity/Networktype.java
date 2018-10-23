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
public class Networktype extends Model<Networktype> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String networktype;


    public String getId() {
        return id;
    }

    public Networktype setId(String id) {
        this.id = id;
        return this;
    }

    public String getNetworktype() {
        return networktype;
    }

    public Networktype setNetworktype(String networktype) {
        this.networktype = networktype;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Networktype{" +
        "id=" + id +
        ", networktype=" + networktype +
        "}";
    }
}
