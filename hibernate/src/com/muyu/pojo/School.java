package com.muyu.pojo;

import java.util.HashSet;
import java.util.Set;

public class School {
    private int scid;
    private String scname;
    private String address;
    private Set<Student> set = new HashSet<>();

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Student> getSet() {
        return set;
    }

    public void setSet(Set<Student> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "School{" +
                "scid=" + scid +
                ", scname='" + scname + '\'' +
                ", address='" + address + '\'' +
                ", set=" + set +
                '}';
    }
}
