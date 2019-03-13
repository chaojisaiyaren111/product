package com.springboot.eureka.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springboot.eureka.entity.ProductInfo;
import com.springboot.eureka.mapper.ProductInfoMapper;
import com.springboot.eureka.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/10.
 */
@Service()
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> getProducts() {
        QueryWrapper<ProductInfo> wrapper = new QueryWrapper<>();
        wrapper.eq(true, "product_id", "157875196366160022");
        return productInfoMapper.selectList(wrapper);
    }
}
