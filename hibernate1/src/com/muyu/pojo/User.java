package com.muyu.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * User
 *
 * @author Administrator
 * @Date 2019/7/28
 * 文件说明:
 */
@Entity
public class User {
    private int userId;
    private String stuNumber;
    private String userName;
    private String userPass;
    private String userEmail;
    private String userSchool;
    private String userProfession;
    private String userPhone;
    private String societyPosition;
    private String societyDept;
    private String gender;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "stu_number")
    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_pass")
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_school")
    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    @Basic
    @Column(name = "user_profession")
    public String getUserProfession() {
        return userProfession;
    }

    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession;
    }

    @Basic
    @Column(name = "user_phone")
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "society_position")
    public String getSocietyPosition() {
        return societyPosition;
    }

    public void setSocietyPosition(String societyPosition) {
        this.societyPosition = societyPosition;
    }

    @Basic
    @Column(name = "society_dept")
    public String getSocietyDept() {
        return societyDept;
    }

    public void setSocietyDept(String societyDept) {
        this.societyDept = societyDept;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                Objects.equals(stuNumber, user.stuNumber) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userPass, user.userPass) &&
                Objects.equals(userEmail, user.userEmail) &&
                Objects.equals(userSchool, user.userSchool) &&
                Objects.equals(userProfession, user.userProfession) &&
                Objects.equals(userPhone, user.userPhone) &&
                Objects.equals(societyPosition, user.societyPosition) &&
                Objects.equals(societyDept, user.societyDept) &&
                Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, stuNumber, userName, userPass, userEmail, userSchool, userProfession, userPhone, societyPosition, societyDept, gender);
    }
}
