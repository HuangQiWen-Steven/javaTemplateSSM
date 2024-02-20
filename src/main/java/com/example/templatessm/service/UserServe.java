package com.example.templatessm.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.templatessm.entity.User;
import com.example.templatessm.mapper.UserMapper;

import java.util.List;

public class UserServe extends ServiceImpl<UserMapper, User> {
    public List<User> queryAllUser(){
       return list();
    }
}
