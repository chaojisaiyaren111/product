package com.springboot.eureka;

import com.springboot.eureka.enums.WeekDayEnum;
import com.springboot.eureka.plugin.GenerateSQLService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {


	@Autowired
	private GenerateSQLService generateSQLService;



	@Test
	public void contextLoads() {
		generateSQLService.generate("teacher","student");
	}

	public void test1(){

	}
}
