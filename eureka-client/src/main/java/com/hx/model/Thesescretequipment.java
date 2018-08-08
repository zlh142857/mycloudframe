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
    private String courseApplicationNetwork; //应用网络
    @Column(name="Course_Name")
    private String courseName; //设备名
    @Column(name="Course_Amount")
    private Integer courseAmount;  //数量
    @Column(name="Course_DeviceLocation")
    private String courseDeviceLocation;  //设备位置
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

    public String getCourseApplicationNetwork() {
        return courseApplicationNetwork;
    }

    public void setCourseApplicationNetwork(String courseApplicationNetwork) {
        this.courseApplicationNetwork = courseApplicationNetwork;
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

    public String getCourseDeviceLocation() {
        return courseDeviceLocation;
    }

    public void setCourseDeviceLocation(String courseDeviceLocation) {
        this.courseDeviceLocation = courseDeviceLocation;
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
                ", courseApplicationNetwork='" + courseApplicationNetwork + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseAmount=" + courseAmount +
                ", courseDeviceLocation='" + courseDeviceLocation + '\'' +
                ", courseAccessory=" + courseAccessory +
                ", courseRemark='" + courseRemark + '\'' +
                '}';
    }
}
