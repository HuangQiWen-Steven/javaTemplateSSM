package com.example.templatessm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.templatessm.common.Result;
import com.example.templatessm.entity.User;
import com.example.templatessm.mapper.UserMapper;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TemplateSsmApplicationTests {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private Result result;

    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = new QueryWrapper();
        Result result = new Result();
        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println(result.success(list));
    }

}
