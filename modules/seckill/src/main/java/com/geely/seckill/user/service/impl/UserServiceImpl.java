package com.geely.seckill.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.geely.seckill.user.mapper.UserMapper;
import com.geely.seckill.user.pojo.User;
import com.geely.seckill.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qishun
 * @since 2021-03-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
