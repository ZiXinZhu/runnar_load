package com.zzx.provider_scan.controller;

import com.zzx.provider_scan.po.BoyPO;
import com.zzx.provider_scan.service.BoyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BoyController {

    @Autowired
    BoyServer server;

    @GetMapping("/scan")
    public List<BoyPO> getAllBoy(){
        return server.getAllBoy();
    }
}
