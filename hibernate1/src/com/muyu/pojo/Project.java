package com.muyu.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Project
 *
 * @author Administrator
 * @Date 2019/7/28
 * 文件说明:
 */
@Entity
public class Project {
    private int pno;
    private String pname;

    @Id
    @Column(name = "pno")
    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    @Basic
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return pno == project.pno &&
                Objects.equals(pname, project.pname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pno, pname);
    }
}
