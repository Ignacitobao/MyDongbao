package com.ignacio.mydongbao.entity;


import com.ignacio.mydongbao.common.base.constant.UserStatus;
import com.ignacio.mydongbao.entity.converter.UserStatusConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;
import java.util.Date;

/**
 * <h1>用户实体类</h1>
 * @author ：Ignacito
 * @date ：Created on 2021/5/20 at 11:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "ums_member")
public class UmsMember {

    /** 自增主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /** 用户名*/
    @Column(name = "username", nullable = false)
    private String username;

    /** 用户密码*/
    @Column(name = "password", nullable = false)
    private String password;

    /** 用户icon*/
    @Column(name = "icon", nullable = false)
    private String icon;

    /** 用户email*/
    @Column(name = "email", nullable = false)
    private String email;

    /** 用户昵称*/
    @Column(name = "nick_name", nullable = false)
    private String nickname;

    /** 备注信息*/
    @Column(name = "note", nullable = false)
    private String note;

    /** 创建时间*/
    @CreatedDate
    @Column(name = "gmt_create")
    private Date createTime;

    /** 最后登录时间*/
    @Column(name = "login_time")
    private Date loginTime;

    /** 修改时间*/
    @LastModifiedDate
    @Column(name = "gmt_modified")
    private Date modifiedTime;

    /** 账号启用状态*/
    @Column(name = "status",nullable = false)
    @Convert(converter = UserStatusConverter.class )
    private UserStatus status;


    public UmsMember(Integer id,String username, String password, String icon, String email, String nickname, String note, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.icon = icon;
        this.email = email;
        this.nickname = nickname;
        this.note = note;
        this.status = UserStatus.of(status);
    }
}
