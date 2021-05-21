package com.ignacio.mydongbao.entity.converter;

import com.ignacio.mydongbao.common.base.constant.UserStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * <h1>账号启用状态枚举属性转换器</h1>
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 11:52
 */
@Converter
public class UserStatusConverter implements AttributeConverter<UserStatus,Integer> {
    @Override
    public Integer convertToDatabaseColumn(UserStatus userStatus) {
        return userStatus.getCode();
    }

    @Override
    public UserStatus convertToEntityAttribute(Integer integer) {
        return UserStatus.of(integer);
    }
}
