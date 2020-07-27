package com.baidu.fsg.uid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author yichu
 * @date 2020/7/21
 */
@SpringBootApplication
@MapperScan({ "com.baidu.fsg.uid.worker.dao" })
public class UidGeneratorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UidGeneratorApiApplication.class, args);
	}
}