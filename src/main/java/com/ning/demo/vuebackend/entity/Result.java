package com.ning.demo.vuebackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result(T data) {
        this.code = 1;
        this.message = "SUCCESS";
        this.data = data;
    }
}
