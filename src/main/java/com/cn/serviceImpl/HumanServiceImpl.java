package com.cn.serviceImpl;

import com.cn.entity.Human;
import com.cn.mapper.HumanMapper;
import com.cn.service.IHumanService;
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
public class HumanServiceImpl extends ServiceImpl<HumanMapper, Human> implements IHumanService {

}
