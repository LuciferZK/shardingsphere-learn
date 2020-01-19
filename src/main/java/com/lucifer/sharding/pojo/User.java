package com.lucifer.sharding.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * t_user
 * @author 
 */
@TableName(value = "t_user")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId(type= IdType.ID_WORKER)
    private Long userId;

    /**
     * 用户姓名
     */
    private String fullname;

    /**
     * 用户类型
     */
    private String userType;

    private static final long serialVersionUID = 1L;
}