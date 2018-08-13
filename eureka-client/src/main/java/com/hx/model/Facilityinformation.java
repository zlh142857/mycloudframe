package com.hx.model;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

/*设备管理表*/
@Entity
@Table(name="facilityinformation")
public class Facilityinformation implements Serializable {

    private static final long serialVersionUID = -238963813420909154L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name="Facility_Id")
    private Integer facilityId;  //序号
    @Column(name="Facility_ApplicationNetwork")
    private String facilityApplicationnetwork; //应用网络
    @Column(name="Exit_Name")
    private String facilityName;  //设备名
    @Column(name="Facility_Amount")
    private Integer facilityAmount;  //数量
    @Column(name="Facility_DeviceLocation")
    private String facilityDevicelocation;  //设备位置
    @Column(name="Facility_Accessory")
    private String facilityAccessory;  //附件
    @Column(name="Facility_Remark")
    private String facilityRemark;  //备注

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityApplicationnetwork() {
        return facilityApplicationnetwork;
    }

    public void setFacilityApplicationnetwork(String facilityApplicationnetwork) {
        this.facilityApplicationnetwork = facilityApplicationnetwork;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public Integer getFacilityAmount() {
        return facilityAmount;
    }

    public void setFacilityAmount(Integer facilityAmount) {
        this.facilityAmount = facilityAmount;
    }

    public String getFacilityDevicelocation() {
        return facilityDevicelocation;
    }

    public void setFacilityDevicelocation(String facilityDevicelocation) {
        this.facilityDevicelocation = facilityDevicelocation;
    }

    public String getFacilityAccessory() {
        return facilityAccessory;
    }

    public void setFacilityAccessory(String facilityAccessory) {
        this.facilityAccessory = facilityAccessory;
    }

    public String getFacilityRemark() {
        return facilityRemark;
    }

    public void setFacilityRemark(String facilityRemark) {
        this.facilityRemark = facilityRemark;
    }

    @Override
    public String toString() {
        return "Facilityinformation{" +
                "facilityId=" + facilityId +
                ", facilityApplicationnetwork='" + facilityApplicationnetwork + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", facilityAmount=" + facilityAmount +
                ", facilityDevicelocation='" + facilityDevicelocation + '\'' +
                ", facilityAccessory='" + facilityAccessory + '\'' +
                ", facilityRemark='" + facilityRemark + '\'' +
                '}';
    }
}
