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
public class Chaindefinition extends Model<Chaindefinition> {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * url地址
     */
    private String url;
    private String permission;
    /**
     * url描述
     */
    private String name;
    private String description;


    public String getId() {
        return id;
    }

    public Chaindefinition setId(String id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Chaindefinition setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPermission() {
        return permission;
    }

    public Chaindefinition setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public String getName() {
        return name;
    }

    public Chaindefinition setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Chaindefinition setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Chaindefinition{" +
        "id=" + id +
        ", url=" + url +
        ", permission=" + permission +
        ", name=" + name +
        ", description=" + description +
        "}";
    }
}
