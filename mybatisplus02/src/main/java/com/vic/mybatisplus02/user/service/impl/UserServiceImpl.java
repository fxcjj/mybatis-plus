package com.vic.mybatisplus02.user.service.impl;

import com.vic.mybatisplus02.user.entity.User;
import com.vic.mybatisplus02.user.mapper.UserMapper;
import com.vic.mybatisplus02.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author victor
 * @since 2019-05-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
