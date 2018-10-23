package com.cn.serviceImpl;

import com.cn.entity.Person;
import com.cn.mapper.PersonMapper;
import com.cn.service.IPersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
