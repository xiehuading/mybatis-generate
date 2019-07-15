package com.xhd.xhr.domain;

import java.util.Date;
import lombok.Data;

/**
 * 民族表
 * t_nation
 * @author xiehuading
 * @date 2019-07-15 10:02:21
 */
@Data
public class Nation {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifyTime;
}