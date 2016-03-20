package com.rong.boss.moduleA.domain;

import java.util.Date;

/**
 * Created by amoszhou on 16/3/20.
 */
public class User {

    private Integer id;

    private String username;


    private Date  createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
