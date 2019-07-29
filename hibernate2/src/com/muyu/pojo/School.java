package com.muyu.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * School
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
@Entity
public class School {
    private int scid;
    private String scname;
    private String address;

    @Id
    @Column(name = "scid")
    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    @Basic
    @Column(name = "scname")
    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return scid == school.scid &&
                Objects.equals(scname, school.scname) &&
                Objects.equals(address, school.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scid, scname, address);
    }
}
