package com.hx.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*培训课程管理表*/
@Entity
@Table(name="tariningcourse")
public class Tariningcourse implements Serializable {

    private static final long serialVersionUID = 6822796671713369272L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name="Course_Id")
    private Integer courseId;  //序号
    @Column(name="Course_Name")
    private String courseName; //应用网络
    @Column(name="Course_Duration")
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date courseDurationt; //课程时长
    @Column(name="Course_Site")
    private String courseSite; //课程场地
    @Column(name="Course_Lecturer")
    private String courseLecturer;  //讲师
    @Column(name="Course_Remark")
    private String courseRemark;  //备注
    @Transient
    private String courseDuration; //课程时长

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseDurationt() {
        return courseDurationt;
    }

    public void setCourseDurationt(Date courseDurationt) {
        this.courseDurationt = courseDurationt;
    }

    public String getCourseSite() {
        return courseSite;
    }

    public void setCourseSite(String courseSite) {
        this.courseSite = courseSite;
    }

    public String getCourseLecturer() {
        return courseLecturer;
    }

    public void setCourseLecturer(String courseLecturer) {
        this.courseLecturer = courseLecturer;
    }

    public String getCourseRemark() {
        return courseRemark;
    }

    public void setCourseRemark(String courseRemark) {
        this.courseRemark = courseRemark;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Tariningcourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDurationt=" + courseDurationt +
                ", courseSite='" + courseSite + '\'' +
                ", courseLecturer='" + courseLecturer + '\'' +
                ", courseRemark='" + courseRemark + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
