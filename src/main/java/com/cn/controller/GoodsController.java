package com.cn.controller;


import com.cn.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
@Controller
@RequestMapping("/cn/goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

}

