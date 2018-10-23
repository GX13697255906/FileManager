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
@TableName("role_permission")
public class RolePermission {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private String rid;
    /**
     * 权限ID
     */
    private String pid;


    public String getRid() {
        return rid;
    }

    public RolePermission setRid(String rid) {
        this.rid = rid;
        return this;
    }

    public String getPid() {
        return pid;
    }

    public RolePermission setPid(String pid) {
        this.pid = pid;
        return this;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
        "rid=" + rid +
        ", pid=" + pid +
        "}";
    }
}
