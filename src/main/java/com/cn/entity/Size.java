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
public class Size extends Model<Size> {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 尺寸
     */
    private Float size;


    public String getId() {
        return id;
    }

    public Size setId(String id) {
        this.id = id;
        return this;
    }

    public Float getSize() {
        return size;
    }

    public Size setSize(Float size) {
        this.size = size;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Size{" +
        "id=" + id +
        ", size=" + size +
        "}";
    }
}
