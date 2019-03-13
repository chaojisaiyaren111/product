package com.springboot.eureka.controller;

import com.springboot.eureka.entity.ProductInfo;
import com.springboot.eureka.enums.WeekDayEnum;
import com.springboot.eureka.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/10.
 */
@RestController
@RequestMapping("product")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public List<ProductInfo> getProducts() {
        List<ProductInfo> list = productService.getProducts();
        String wed = WeekDayEnum.getKeyByName("WED");
        log.info("111111111111111111");
        return list;
    }

    @RequestMapping("/testBeforeService.do")
    public String testBeforeService(String key, String value) {
        return "key : " + key + ", value : " + value;
                 /*
18         url:  http://localhost:8080/aop/testBeforeService.do?key=zdj&value=123
19         我是前置通知
20         代理的方法是 ： testBeforeService
21         AOP 代理的名字 ： com.zdj.springboot_aop.Controller.AopTestController
22         请求 ： org.apache.catalina.connector.RequestFacade@4f8cf74e ,  HttpSession : org.apache.catalina.session.StandardSessionFacade@7b37a638
23         请求参数信息为 ： {"value":"123","key":"zdj"}
24          */
    }

    @RequestMapping("/testAfterReturning1.do")
    public String testAfterReturning1(String key) {
        return "key = " + key;
               /*
31             url :  http://localhost:8080/aop/testAfterReturning1.do?key=zdj&value=123
32             后置通知执行了！！
33             第一个后置返回通知的返回值是 ：key = zdj
34             第二个后置返回通知的返回值是 ：key = zdj
35          */
    }

    @RequestMapping("/testAfterReturning2.do")
    public Integer testAfterReturning2(Integer key) {
        return key;
                /*
42             url :  http://localhost:8080/aop/testAfterReturning2.do?key=111222&value=123
43
44             后置通知执行了！！
45             第一个后置返回通知的返回值是 ：111222
46
47             注 ： 因第二个后置通知首参不是JoinPoint,并且相应参数类型是String，而该目标方法的返回值类型是Integer，所以第二个后置通知方法不执行
48          */
    }

    @RequestMapping("/testAfterThrowing.do")
    public String testAfterThrowing(String key) {
        throw new NullPointerException();
                /*
55         url ： http://localhost:8080/aop/testAfterThrowing.do?key=zdk&value=123
56         我是前置通知
57         代理的方法是 ： testAfterThrowing
58         AOP 代理的名字 ： com.zdj.springboot_aop.Controller.AopTestController
59         请求 ： org.apache.catalina.connector.RequestFacade@41b8dcce ,  HttpSession : org.apache.catalina.session.StandardSessionFacade@33c33c37
60         请求参数信息为 ： {"value":"123","key":"zdk"}
61         testAfterThrowing
62         发生了空指针异常
63         */
    }

    @RequestMapping("/testAfter1.do")
    public String testAfter1(String key) {
        throw new NullPointerException();
                 /*
70         url: http://localhost:8080/aop/testAfter1.do?key=zdj&value=123
71         后置最终通知执行了！
72          */
    }

    @RequestMapping("/testAfter2.do")
    public String testAfter2(String key) {
        return key;
                /*
79         url: http://localhost:8080/aop/testAfter2.do?key=zdj&value=123
80         后置最终通知执行了！
81          */
    }

    @RequestMapping("/testAroundService.do")
    public String testAroundService(String key) {
        return "环绕通知 ： " + key;
               /*
88         url : http://localhost:8080/aop/testAroundService.do?key=1122
89         环绕通知的目标方法名为 ： testAroundService
90
91         当访问 http://localhost:8080/aop/testAfter2.do?key=1122&value=sjshhjdh，不符合环绕通知的切入规则，所以环绕通知不会执行；
92          */
    }
}
