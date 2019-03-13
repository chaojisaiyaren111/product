package com.springboot.eureka.controller;

import com.springboot.eureka.entity.Teacher;
import com.springboot.eureka.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/11.
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("/getTeacher")
    public Teacher getTeacher(Integer id) {
        return teacherService.getTeacher(id);
    }
}

