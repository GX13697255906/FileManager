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
public class Human extends Model<Human> {

    private static final long serialVersionUID = 1L;

    private String sta;
    private Integer id;


    public String getSta() {
        return sta;
    }

    public Human setSta(String sta) {
        this.sta = sta;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Human setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Human{" +
        "sta=" + sta +
        ", id=" + id +
        "}";
    }
}
