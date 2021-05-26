package com.ning.demo.vuebackend.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Domain {
    private Long id;
    private String domain;
    private String description;
    private Integer status;
    private Long createTime;
    private Long updateTime;
}
