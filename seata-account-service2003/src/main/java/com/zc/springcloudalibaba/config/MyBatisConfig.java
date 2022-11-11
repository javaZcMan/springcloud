package com.zc.springcloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author zheng.javagodfather
 * @create 2022-11-12 2:12
 */
@Configuration
@MapperScan({"com.zc.springcloudalibaba.dao"})
public class MyBatisConfig {
}
