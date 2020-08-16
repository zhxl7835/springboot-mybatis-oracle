package com.zhxl.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ServletComponentScan
//@MapperScan("com.zhxl.springboot.mapper")
public class SpringbootMybatisOracleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisOracleApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootMybatisOracleApplication.class);
    }
}
