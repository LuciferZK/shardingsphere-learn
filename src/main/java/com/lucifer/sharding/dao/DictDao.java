package com.lucifer.sharding.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lucifer.sharding.pojo.Dict;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DictDao extends BaseMapper<Dict> {

    @Select("SELECT * FROM `t_dict` where ")
    List<Dict> findByPage();
}
