package com.springboot.eureka.service;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/12.
 */
public interface UserService {
    /**
     * 获取用户信息
     * @return
     * @param tel
     */
    String findUserName(String tel);
}
