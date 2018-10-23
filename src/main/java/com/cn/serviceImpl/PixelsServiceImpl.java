package com.cn.serviceImpl;

import com.cn.entity.Pixels;
import com.cn.mapper.PixelsMapper;
import com.cn.service.IPixelsService;
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
public class PixelsServiceImpl extends ServiceImpl<PixelsMapper, Pixels> implements IPixelsService {

}
