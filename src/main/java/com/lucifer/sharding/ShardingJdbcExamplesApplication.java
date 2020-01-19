package com.lucifer.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

/**
 * @author Lucifer
 */
@MapperScan("com.lucifer.sharding.dao")
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class ShardingJdbcExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcExamplesApplication.class, args);
    }


}
