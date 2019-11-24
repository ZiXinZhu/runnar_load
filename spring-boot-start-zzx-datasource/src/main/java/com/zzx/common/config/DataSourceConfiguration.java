package com.zzx.common.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(Properties.class)
@ComponentScan("com.zzx.common")
@Slf4j
public class DataSourceConfiguration {

    @Autowired
    Properties properties;

    @Autowired
    DataSourceProperties dataSourceProperties;

    @Bean
    public void assembleBean() {
        log.info("密码："+properties.getPassword());
        dataSourceProperties.setUrl(properties.getUrl());
        dataSourceProperties.setPassword(properties.getPassword());
        dataSourceProperties.setUsername(properties.getUsername());
        log.info("数据库配置完毕！");
    }

}
