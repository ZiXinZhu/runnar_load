package com.zzx.consumer;

import com.zzx.provider.annotation.EnableProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableProvider
@ComponentScan({"com.zzx.provider_scan","com.zzx.consumer"})
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
