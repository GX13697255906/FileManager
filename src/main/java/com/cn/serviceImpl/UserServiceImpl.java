package com.cn.serviceImpl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cn.entity.User;
import com.cn.mapper.UserMapper;
import com.cn.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh123
 * @since 2018-08-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> findAllUsers() {
       return baseMapper.selectAll();
//        return baseMapper.findAllUsers();
    }

    @Override
    public User findById(String id){
        return baseMapper.selectById(id);
    }

    @Override
    public void delById(String id) {
        baseMapper.deleteById(id);
    }

    public List<User> getUserByCredict(Integer currentPage, Integer pageSize){
        List<User> result = new ArrayList<User>();
        Page page = new Page(currentPage,pageSize);
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.like("username","z").like("nickname","a");
        result = baseMapper.selectPage(page,entityWrapper);
        return result;
    }

    public List<User> getUseOrderById(){
        List<User> result = new ArrayList<>();
        EntityWrapper<User> entityWrapper = new EntityWrapper<>();
        entityWrapper.orderBy("id",false);
        result = baseMapper.selectList(entityWrapper);
        return  result;
    }


}
