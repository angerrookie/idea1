package com.muyu.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * Account
 *
 * @author Administrator
 * @Date 2019/7/27
 */

public class Account {
    private int accid;
    private String accname;
    private String accpass;
    private Detail detailByAccid;

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getAccpass() {
        return accpass;
    }

    public void setAccpass(String accpass) {
        this.accpass = accpass;
    }

    public Detail getDetailByAccid() {
        return detailByAccid;
    }

    public void setDetailByAccid(Detail detailByAccid) {
        this.detailByAccid = detailByAccid;
    }
}
