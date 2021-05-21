package com.ignacio.mydongbao.common.base.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum UserStatus {


    PROHIBITED("账户禁用",0),
    NORMAL("账户启用",1);

    /** 账号启用状态状态描述*/
    private String description;

    /** 账号启用状态编码*/
    private Integer code;

    public static UserStatus of(Integer code){
        Objects.requireNonNull(code);
        return Stream.of(values())
                .filter(thing -> thing.code.equals(code))
                .findAny()
                .orElseThrow(() ->new IllegalArgumentException("code " + code + "not found"));
    }
}
