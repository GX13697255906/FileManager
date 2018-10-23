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
public class Sendcompany extends Model<Sendcompany> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String company;


    public String getId() {
        return id;
    }

    public Sendcompany setId(String id) {
        this.id = id;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Sendcompany setCompany(String company) {
        this.company = company;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Sendcompany{" +
        "id=" + id +
        ", company=" + company +
        "}";
    }
}
