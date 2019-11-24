package com.zzx.provider_scan.service;

import com.zzx.provider_scan.dao.BoyDao;
import com.zzx.provider_scan.po.BoyPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoyServer {

    @Autowired
    BoyDao boyDao;

    public List<BoyPO> getAllBoy(){
        return boyDao.selectAllBoy();
    }


}
