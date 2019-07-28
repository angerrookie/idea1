package com.muyu.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Detail
 *
 * @author Administrator
 * @Date 2019/7/27
 */

public class Detail {
    private int accid;
    private String username;
    private Date birthday;
    private String email;
    private Account accountByAccid;

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
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

    public Account getAccountByAccid() {
        return accountByAccid;
    }

    public void setAccountByAccid(Account accountByAccid) {
        this.accountByAccid = accountByAccid;
    }
}
