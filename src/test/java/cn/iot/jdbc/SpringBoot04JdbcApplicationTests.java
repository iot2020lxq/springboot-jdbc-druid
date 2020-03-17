package cn.iot.jdbc;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot04JdbcApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Test
	void contextLoads() {
		System.out.println(dataSource.getClass());
	}

}
