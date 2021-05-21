package com.ignacio.mydongbao.api.ums;


import com.ignacio.mydongbao.common.base.exception.DongbaoException;
import com.ignacio.mydongbao.entity.UmsMember;

/**
 *<h1>User 管理基础(crud)服务定义</h1>
 */
public interface IUserManageSystemBaseService {

    /**
     * <h2>单个新增用户</h2>
     * @param umsMember
     * @throws DongbaoException
     */
    void add(UmsMember umsMember) throws DongbaoException;

    /**
     * <h2>更新已有用户信息</h2>
     * @param umsMember
     * @throws DongbaoException
     */

    void update(UmsMember umsMember) throws DongbaoException;
}
