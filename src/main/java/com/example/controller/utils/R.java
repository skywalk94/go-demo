package com.example.controller.utils;

import lombok.Data;

@Data
public class R {
    private Integer code;
    private Object data;

    public R() {
    }

    public R(Boolean flag) {
        this.code = flag ? 1 : 0;
    }

    public R(Boolean flag, Object data) {
        this.code = flag ? 1 : 0;
        this.data = data;
    }
}
