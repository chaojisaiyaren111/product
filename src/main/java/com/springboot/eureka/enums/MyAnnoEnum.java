package com.springboot.eureka.enums;

import lombok.Data;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/12.
 */

public enum MyAnnoEnum {

    SELECT("select","查询"),
    INSERT("insert","添加"),
    UPDATE("update","修改"),
    DELECT("delect","删除");

    public static String getNameByCode(String code) {
        for (MyAnnoEnum enm : MyAnnoEnum.values()) {
            System.out.println(enm);
            if (enm.getCode() == code) {
                return enm.getName();
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    MyAnnoEnum(String code, String name) {

        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;
}
