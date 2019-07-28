package com.muyu.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee
 *
 * @author Administrator
 * @Date 2019/7/27
 */
public class Employee {
    private int eno;
    private String ename;
    private Set<Project> projects = new HashSet<Project>();

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
