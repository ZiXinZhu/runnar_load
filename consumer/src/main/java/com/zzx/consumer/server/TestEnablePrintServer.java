package com.zzx.consumer.server;



import com.zzx.common.server.UserServer;
import com.zzx.provider.server.EnablePrint;
import com.zzx.provider_scan.po.BoyPO;
import com.zzx.provider_scan.service.BoyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestEnablePrintServer {

    @Autowired(required = false)
    EnablePrint enablePrint;
    @Autowired(required = false)
    UserServer userServer;
    @Autowired
    BoyServer boyServer;

    public void enablePrintTest() {
        enablePrint.toPrint();
    }

    public void printDataSource(){
        userServer.printDataSource();
    }

    public List<BoyPO> getAllBoy(){
       return boyServer.getAllBoy();
    }
}
