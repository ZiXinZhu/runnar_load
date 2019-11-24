package com.zzx.common.server;

import com.zzx.common.config.Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServer {

    @Autowired
    Properties properties;
    public String printDataSource() {
        log.info("数据源IP："+properties.getUrl());
        return "获取成功："+properties.getUrl();
    }
}
