package com.springboot.eureka.service;

import com.springboot.eureka.entity.ProductInfo;

import java.util.List;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/10.
 */
public interface ProductService {
    List<ProductInfo> getProducts();
}
