package com.example.templatessm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User {
    private Long id;
    private String userName; // 用户登录账号
    private String password; // 用户登录密码
    private String phone; // 用户电话
    private String email;  // 用户邮箱
    // admin(管理员)  user(用户)
    private String role;  // 用户权限
    private String address; //  用户地址
    private String nickName;  // 用户名
    private String avatar; // 用户头像
}