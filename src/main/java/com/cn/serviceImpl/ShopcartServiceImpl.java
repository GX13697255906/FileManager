package com.cn.serviceImpl;

import com.cn.entity.Shopcart;
import com.cn.mapper.ShopcartMapper;
import com.cn.service.IShopcartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
@Service
public class ShopcartServiceImpl extends ServiceImpl<ShopcartMapper, Shopcart> implements IShopcartService {

}
