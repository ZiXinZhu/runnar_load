package com.zzx.provider_scan.dao;

import com.zzx.provider_scan.po.BoyPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoyDao {

    @Select("select * from boy ")
    List<BoyPO> selectAllBoy();

}
