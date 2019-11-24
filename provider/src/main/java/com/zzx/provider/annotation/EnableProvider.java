package com.zzx.provider.annotation;


import com.zzx.provider.config.EnableConfig;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableConfig.class)
public @interface EnableProvider {
}
