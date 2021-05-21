package com.ignacio.mydongbao.service.ums;


import com.ignacio.mydongbao.api.ums.IUserManageSystemBaseService;
import com.ignacio.mydongbao.common.base.exception.DongbaoException;
import com.ignacio.mydongbao.dao.UserManageSystemDao;
import com.ignacio.mydongbao.entity.UmsMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 13:57
 */

@Service
@Slf4j
public class UserManageSystemBaseServiceImpl implements IUserManageSystemBaseService {

    @Autowired
    UserManageSystemDao userManageSystemDao;


    /**
     * <h2>单个新增用户</h2>
     *
     * @param umsMember
     * @throws DongbaoException
     */
    @Override
    public void add(UmsMember umsMember) throws DongbaoException {
        userManageSystemDao.save(umsMember);
    }

    /**
     * <h2>更新已有用户信息</h2>
     * @param umsMember
     * @throws DongbaoException
     */
    @Override
    public void update(UmsMember umsMember) throws DongbaoException {
        userManageSystemDao.save(umsMember);
    }


}
