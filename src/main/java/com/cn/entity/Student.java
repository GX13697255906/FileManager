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
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    private String sc;
    private Integer id;


    public String getSc() {
        return sc;
    }

    public Student setSc(String sc) {
        this.sc = sc;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student{" +
        "sc=" + sc +
        ", id=" + id +
        "}";
    }
}
