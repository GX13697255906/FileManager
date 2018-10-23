package com.cn.entity;

import com.baomidou.mybatisplus.annotations.TableField;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
public class File extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;
    @TableField("user_id")
    private String userId;
    @TableField("create_time")
    private Date createTime;
    private Integer orderby;
    private String type;
    private String path;

    public String getPath() {
        return path;
    }

    public File setPath(String path) {
        this.path = path;
        return this;
    }

    public String getId() {
        return id;
    }

    public File setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public File setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public File setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public File setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getOrderby() {
        return orderby;
    }

    public File setOrderby(Integer orderby) {
        this.orderby = orderby;
        return this;
    }

    public String getType() {
        return type;
    }

    public File setType(String type) {
        this.type = type;
        return this;
    }


    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime=" + createTime +
                ", orderby=" + orderby +
                ", type='" + type + '\'' +
                ", path='" + path + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
