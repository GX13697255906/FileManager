package com.cn.service;

import com.cn.entity.Goods;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
public interface IGoodsService extends IService<Goods> {

    Goods findGoodsById(String Gid);

}
