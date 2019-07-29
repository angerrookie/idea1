package com.muyu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Project
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
@Entity
@Table (name = "project")
public class Project {
    private int pno;
    @Id
    @Column(name = "pno")

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }
    private String pname;

    @Column(name = "pname")

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
