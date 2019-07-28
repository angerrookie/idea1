package com.muyu.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Account2
 *
 * @author Administrator
 * @Date 2019/7/27
 */

public class Account2 {
    private int accid;
    private String accname;
    private String accpass;
    private Detail2 detail2;

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

    public Detail2 getDetail2() {
        return detail2;
    }

    public void setDetail2(Detail2 detail2) {
        this.detail2 = detail2;
    }
}
