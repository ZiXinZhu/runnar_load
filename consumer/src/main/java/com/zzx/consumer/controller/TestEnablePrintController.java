package com.zzx.consumer.controller;


import com.zzx.consumer.server.TestEnablePrintServer;
import com.zzx.provider_scan.po.BoyPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestEnablePrintController {

    @Autowired
    private TestEnablePrintServer server;



    @GetMapping("/enable")
    public void enablePrintTest(){
        server.enablePrintTest();
    }

    @GetMapping("/start")
    public void printDataSource(){
        server.printDataSource();
    }

    @GetMapping("/scan")
    public List<BoyPO> getAllBoy(){
        return server.getAllBoy();
    }

}
