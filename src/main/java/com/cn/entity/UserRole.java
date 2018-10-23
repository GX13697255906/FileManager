package com.cn.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
@TableName("user_role")
public class UserRole {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String uid;
    /**
     * 角色ID
     */
    private String rid;


    public String getUid() {
        return uid;
    }

    public UserRole setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getRid() {
        return rid;
    }

    public UserRole setRid(String rid) {
        this.rid = rid;
        return this;
    }


    @Override
    public String toString() {
        return "UserRole{" +
        "uid=" + uid +
        ", rid=" + rid +
        "}";
    }
}
