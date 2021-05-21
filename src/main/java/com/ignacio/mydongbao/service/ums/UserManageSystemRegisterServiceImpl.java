package com.ignacio.mydongbao.service.ums;


import com.ignacio.mydongbao.api.ums.IUserManageSystemRegisterService;
import com.ignacio.mydongbao.dao.UserManageSystemDao;
import com.ignacio.mydongbao.entity.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 19:58
 */

@Service
public class UserManageSystemRegisterServiceImpl implements IUserManageSystemRegisterService {

    @Autowired
    UserManageSystemDao userManageSystemDao;
    /**
     * <h2>用户注册服务</h2>
     *
     * @return
     */
    @Override
    public String register() {
        UmsMember umsMember = new UmsMember
                (2,"John","123456","icon","jane@123.com","jane","test",0);

        userManageSystemDao.save(umsMember);
        return "success!";

    }
}
