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
public class Permission extends Model<Permission> {

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

    public Permission setId(String id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Permission setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPermission() {
        return permission;
    }

    public Permission setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Permission setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Permission{" +
        "id=" + id +
        ", url=" + url +
        ", permission=" + permission +
        ", name=" + name +
        ", description=" + description +
        "}";
    }
}
