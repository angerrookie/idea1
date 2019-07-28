package com.muyu.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

/**
 * Detail2
 *
 * @author Administrator
 * @Date 2019/7/27
 */

public class Detail2 {
    private int detid;
    private String username;
    private Date birthday;
    private String email;
    private Account2 account2;

    public int getDetid() {
        return detid;
    }

    public void setDetid(int detid) {
        this.detid = detid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account2 getAccount2() {
        return account2;
    }

    public void setAccount2(Account2 account2) {
        this.account2 = account2;
    }
}
