package com.zzx.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "zzx")
public class Properties {
    private String url;
    private String password;
    private String username;
}
