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
public class Numcores extends Model<Numcores> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String numcores;


    public String getId() {
        return id;
    }

    public Numcores setId(String id) {
        this.id = id;
        return this;
    }

    public String getNumcores() {
        return numcores;
    }

    public Numcores setNumcores(String numcores) {
        this.numcores = numcores;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Numcores{" +
        "id=" + id +
        ", numcores=" + numcores +
        "}";
    }
}
