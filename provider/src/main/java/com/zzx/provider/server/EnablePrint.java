package com.zzx.provider.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EnablePrint {

    public void toPrint(){
        log.info("==============com.zzx.provider.server 被注入！=================");
    }
}
