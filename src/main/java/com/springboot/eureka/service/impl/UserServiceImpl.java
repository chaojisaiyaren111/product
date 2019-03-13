package com.springboot.eureka.service.impl;

import com.springboot.eureka.aop2.OperationLogDetail;
import com.springboot.eureka.aop2.OperationType;
import com.springboot.eureka.aop2.OperationUnit;
import com.springboot.eureka.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String tel) {
        System.out.println("tel:" + tel);
        return "zhangsan";
    }
}
