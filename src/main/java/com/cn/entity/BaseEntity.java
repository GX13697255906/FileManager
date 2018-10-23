package com.cn.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

public class BaseEntity {
    @TableId(type = IdType.UUID)
    public String id;
}
