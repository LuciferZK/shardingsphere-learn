package com.lucifer.sharding.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * t_dict
 * @author 
 */
@Data
@TableName(value = "t_dict")
public class Dict implements Serializable {
    /**
     * 字典id
     */
    @TableId
    private Long dictId;

    /**
     * 字典类型
     */
    private String type;

    /**
     * 字典编码
     */
    private String code;

    /**
     * 字典值
     */
    private String value;

    private static final long serialVersionUID = 1L;
}