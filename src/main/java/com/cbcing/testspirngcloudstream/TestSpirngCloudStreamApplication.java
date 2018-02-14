package com.cbcing.testspirngcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Cloud Stream
 * 此应用将通过使用消息中间件RabbitMQ来接收消息并将消息打印到日志中去
 */
@SpringBootApplication
public class TestSpirngCloudStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpirngCloudStreamApplication.class, args);
	}
}
