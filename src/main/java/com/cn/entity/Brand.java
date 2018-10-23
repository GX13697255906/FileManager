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
public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 品牌
     */
    private String brand;


    public String getId() {
        return id;
    }

    public Brand setId(String id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Brand setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Brand{" +
        "id=" + id +
        ", brand=" + brand +
        "}";
    }
}
