package com.cn.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
@Data
@ToString
@Builder
public class UserAndRole extends Model<UserAndRole> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String username;
    private String nickname;
    private String password;
    private String sex;
    private String type;
    private Integer islock;
    private String status;
    private List<UserAndRole> name;




    @Override
    protected Serializable pkVal() {
        return null;
    }

}
