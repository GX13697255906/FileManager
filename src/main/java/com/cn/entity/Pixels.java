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
public class Pixels extends Model<Pixels> {

    private static final long serialVersionUID = 1L;

    private String id;
    private Integer pixels;


    public String getId() {
        return id;
    }

    public Pixels setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getPixels() {
        return pixels;
    }

    public Pixels setPixels(Integer pixels) {
        this.pixels = pixels;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Pixels{" +
        "id=" + id +
        ", pixels=" + pixels +
        "}";
    }
}
