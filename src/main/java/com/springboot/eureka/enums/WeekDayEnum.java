package com.springboot.eureka.enums;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/12.
 */
public enum WeekDayEnum {
    SUN(0, "星期日"),
    MON(1, "星期一"),
    TUE(2, "星期二"),
    WED(3, "星期三"),
    THUR(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六");

    private Integer index;
    private String key;


    /**
     * 根据枚举名称得到key
     * 比如根据"WED"得到"星期三"
     * @param name
     * @return
     */
    public static String getKeyByName(String name) {
        WeekDayEnum[] values = WeekDayEnum.values();
        for (WeekDayEnum value : values) {
            if (value.name().equals(name)) {
                return value.getKey();
            }
        }
        return null;
    }

    WeekDayEnum(Integer index, String key) {
        this.index = index;
        this.key = key;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
