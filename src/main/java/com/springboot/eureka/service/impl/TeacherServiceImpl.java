package com.springboot.eureka.service.impl;

import com.netflix.discovery.converters.Auto;
import com.springboot.eureka.entity.Teacher;
import com.springboot.eureka.mapper.TeacherMapper;
import com.springboot.eureka.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/11.
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    TeacherMapper teacherMapper;


    @Override
    public Teacher getTeacher(Integer id) {
        return teacherMapper.getTeacher(id);
    }
}
