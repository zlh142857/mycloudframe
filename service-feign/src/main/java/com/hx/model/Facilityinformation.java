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
    private String facilityApplicationNetwork; //应用网络
    @Column(name="Exit_Name")
    private String facilityName;  //设备名
    @Column(name="Facility_Amount")
    private Integer facilityAmount;  //数量
    @Column(name="Facility_DeviceLocation")
    private String facilityDeviceLocation;  //设备位置
    @Column(name="Facility_Accessory")
    private File facilityAccessory;  //附件
    @Column(name="Facility_Remark")
    private String facilityRemark;  //备注

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityApplicationNetwork() {
        return facilityApplicationNetwork;
    }

    public void setFacilityApplicationNetwork(String facilityApplicationNetwork) {
        this.facilityApplicationNetwork = facilityApplicationNetwork;
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

    public String getFacilityDeviceLocation() {
        return facilityDeviceLocation;
    }

    public void setFacilityDeviceLocation(String facilityDeviceLocation) {
        this.facilityDeviceLocation = facilityDeviceLocation;
    }

    public File getFacilityAccessory() {
        return facilityAccessory;
    }

    public void setFacilityAccessory(File facilityAccessory) {
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
                ", facilityApplicationNetwork='" + facilityApplicationNetwork + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", facilityAmount=" + facilityAmount +
                ", facilityDeviceLocation='" + facilityDeviceLocation + '\'' +
                ", facilityAccessory=" + facilityAccessory +
                ", facilityRemark='" + facilityRemark + '\'' +
                '}';
    }
}
