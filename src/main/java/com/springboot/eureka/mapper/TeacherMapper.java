package com.springboot.eureka.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.eureka.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 'jdbctest.NewView' is not BASE TABLE Mapper 接口
 * </p>
 *
 * @author xiejiayi
 * @since 2019-03-11
 */
@Repository
public interface TeacherMapper extends BaseMapper<Teacher> {

    Teacher getTeacher(@Param("id") Integer id);
}
