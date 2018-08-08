package com.hx.model;

import javax.persistence.*;
import java.io.Serializable;

/*人员登记表*/
@Entity
@Table(name="personner")
public class Personner implements Serializable {

    private static final long serialVersionUID = 1479930720432309715L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name="User_Id")
    private Integer userId;  //id
    @Column(name="User_Name")
    private String userName; //姓名
    @Column(name="User_Sex")
    private String userSex;  //性别
    @Column(name="User_Kiev")
    private String userKiev; //出生地点
    @Column(name="User_Nation")
    private String userNation;  //民族
    @Column(name="User_Native")
    private String userNative;  //籍贯
    @Column(name="User_Health")
    private String userHealth;  //健康状况
    @Column(name="User_Birthday")
    private String userBirthday;  //出生日期
    @Column(name="User_PartyTime")
    private String userPartyTime;  //入党时间
    @Column(name="User_TimeToWork")
    private String userTimeToWork;  //参加工作时间
    @Column(name="User_Education")
    private String userEducation;  //学历
    @Column(name="User_SchoolTag")
    private String userSchoolTag;  //毕业学校
    @Column(name="User_Biye")
    private String userBiye;  //毕业专业
    @Column(name="User_FamilyName")
    private String userFamilyName;  //亲属姓名
    @Column(name="User_TypeOfKinship")
    private String userTypeOfKinship;  //亲属关系
    @Column(name="User_Contact")
    private String userContact;  //联系方式
    @Column(name="User_Professional")
    private String userProfessional;  //亲属职业
    @Column(name="User_TheNation")
    private String userTheNation;  //亲属民族

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserKiev() {
        return userKiev;
    }

    public void setUserKiev(String userKiev) {
        this.userKiev = userKiev;
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    public String getUserNative() {
        return userNative;
    }

    public void setUserNative(String userNative) {
        this.userNative = userNative;
    }

    public String getUserHealth() {
        return userHealth;
    }

    public void setUserHealth(String userHealth) {
        this.userHealth = userHealth;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPartyTime() {
        return userPartyTime;
    }

    public void setUserPartyTime(String userPartyTime) {
        this.userPartyTime = userPartyTime;
    }

    public String getUserTimeToWork() {
        return userTimeToWork;
    }

    public void setUserTimeToWork(String userTimeToWork) {
        this.userTimeToWork = userTimeToWork;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }

    public String getUserSchoolTag() {
        return userSchoolTag;
    }

    public void setUserSchoolTag(String userSchoolTag) {
        this.userSchoolTag = userSchoolTag;
    }

    public String getUserBiye() {
        return userBiye;
    }

    public void setUserBiye(String userBiye) {
        this.userBiye = userBiye;
    }

    public String getUserFamilyName() {
        return userFamilyName;
    }

    public void setUserFamilyName(String userFamilyName) {
        this.userFamilyName = userFamilyName;
    }

    public String getUserTypeOfKinship() {
        return userTypeOfKinship;
    }

    public void setUserTypeOfKinship(String userTypeOfKinship) {
        this.userTypeOfKinship = userTypeOfKinship;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserProfessional() {
        return userProfessional;
    }

    public void setUserProfessional(String userProfessional) {
        this.userProfessional = userProfessional;
    }

    public String getUserTheNation() {
        return userTheNation;
    }

    public void setUserTheNation(String userTheNation) {
        this.userTheNation = userTheNation;
    }

    @Override
    public String toString() {
        return "Personner{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userKiev='" + userKiev + '\'' +
                ", userNation='" + userNation + '\'' +
                ", userNative='" + userNative + '\'' +
                ", userHealth='" + userHealth + '\'' +
                ", userBirthday='" + userBirthday + '\'' +
                ", userPartyTime='" + userPartyTime + '\'' +
                ", userTimeToWork='" + userTimeToWork + '\'' +
                ", userEducation='" + userEducation + '\'' +
                ", userSchoolTag='" + userSchoolTag + '\'' +
                ", userBiye='" + userBiye + '\'' +
                ", userFamilyName='" + userFamilyName + '\'' +
                ", userTypeOfKinship='" + userTypeOfKinship + '\'' +
                ", userContact='" + userContact + '\'' +
                ", userProfessional='" + userProfessional + '\'' +
                ", userTheNation='" + userTheNation + '\'' +
                '}';
    }
}
