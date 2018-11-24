package com.demo.springdatajdbcdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableJdbcRepositories
class SpringDataJdbcDemoApplication {

	static void main(String[] args) {
		SpringApplication.run SpringDataJdbcDemoApplication, args
	}
}
