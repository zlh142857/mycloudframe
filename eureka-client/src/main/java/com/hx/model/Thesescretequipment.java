package com.hx.model;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

/*非密设备移交表*/
@Entity
@Table(name="thesescretequipment")
public class Thesescretequipment implements Serializable {

    private static final long serialVersionUID = -4443750562578065954L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name="Course_Id")
    private Integer courseId;  //序号
    @Column(name="Course_ApplicationNetwork")
    private String courseApplicationnetwork; //应用网络
    @Column(name="Course_Name")
    private String courseName; //设备名
    @Column(name="Course_Amount")
    private Integer courseAmount;  //数量
    @Column(name="Course_Devicelocation")
    private String courseDevicelocation;  //设备位置
    @Column(name="Course_Accessory")
    private String courseAccessory;  //附件
    @Column(name="Course_Remark")
    private String courseRemark;  //备注

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseApplicationnetwork() {
        return courseApplicationnetwork;
    }

    public void setCourseApplicationnetwork(String courseApplicationnetwork) {
        this.courseApplicationnetwork = courseApplicationnetwork;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseAmount() {
        return courseAmount;
    }

    public void setCourseAmount(Integer courseAmount) {
        this.courseAmount = courseAmount;
    }

    public String getCourseDevicelocation() {
        return courseDevicelocation;
    }

    public void setCourseDevicelocation(String courseDevicelocation) {
        this.courseDevicelocation = courseDevicelocation;
    }

    public String getCourseAccessory() {
        return courseAccessory;
    }

    public void setCourseAccessory(String courseAccessory) {
        this.courseAccessory = courseAccessory;
    }

    public String getCourseRemark() {
        return courseRemark;
    }

    public void setCourseRemark(String courseRemark) {
        this.courseRemark = courseRemark;
    }

    @Override
    public String toString() {
        return "Thesescretequipment{" +
                "courseId=" + courseId +
                ", courseApplicationnetwork='" + courseApplicationnetwork + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseAmount=" + courseAmount +
                ", courseDevicelocation='" + courseDevicelocation + '\'' +
                ", courseAccessory='" + courseAccessory + '\'' +
                ", courseRemark='" + courseRemark + '\'' +
                '}';
    }
}
