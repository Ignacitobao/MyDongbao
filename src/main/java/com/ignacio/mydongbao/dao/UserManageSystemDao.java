package com.ignacio.mydongbao.dao;

import com.ignacio.mydongbao.entity.UmsMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *<h1>UserManageSystemDao 接口定义</h1>
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 13:45
 */
public interface UserManageSystemDao extends JpaRepository<UmsMember,Integer> {

    /**
     * <h2>判断当前id的用户是否存在</h2>
     * @param id
     * @return
     */
    boolean existsById(Integer id);


}
