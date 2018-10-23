package com.cn.serviceImpl;

import com.cn.entity.Goods;
import com.cn.mapper.GoodsMapper;
import com.cn.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Override
    public Goods findGoodsById(String  Gid){
        Goods goods = new Goods();
        goods = baseMapper.selectById(Gid);

        return null;
    }

}
