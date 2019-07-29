package com.muyu.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * Student
 *
 * @author Administrator
 * @Date 2019/7/29
 * 文件说明:
 */
@Entity
public class Student {
    private int sid;
    private String sname;
    private Date birthday;
    private String gendar;
    private String phone;
    private School schoolByScid;

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "gendar")
    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(gendar, student.gendar) &&
                Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, birthday, gendar, phone);
    }

    @ManyToOne
    @JoinColumn(name = "scid", referencedColumnName = "scid")
    public School getSchoolByScid() {
        return schoolByScid;
    }

    public void setSchoolByScid(School schoolByScid) {
        this.schoolByScid = schoolByScid;
    }
}
