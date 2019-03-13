package com.springboot.eureka.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 'jdbctest.NewView' is not BASE TABLE
 * </p>
 *
 * @author xiejiayi
 * @since 2019-03-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String gender;
    private String major;
    private String grade;
    private Integer supervisorId;


}
