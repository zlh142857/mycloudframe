package com.hx.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*出入境人员管理表*/
@Entity
@Table(name="outbound")
public class Outbound implements Serializable {

    private static final long serialVersionUID = 3758799300295444273L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name="Exit_Id")
    private Integer exitId;  //id
    @Column(name="Exit_Name")
    private String exitName; //姓名
    @Column(name="Exit_Section")  //部门
    private String exitSection;
    @Column(name="Exit_Tothecountry")
    private String exitTothecountry;//去往国家
    @Column(name="Exit_Reasons")
    private String exitReasons;  //事由
    @Column(name="Exit_Whetherclassified")
    private String exitWhetherclassified;  //是否涉密
    @Column(name="Exit_Approvalflow")
    private String exitApprovalflow;  //审核
    @Column(name="Exit_Togoabroadtodate")
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date exitTogoabroadtodatet;  //出国日期
    @Column(name="Exit_Returndate")
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date exitReturndatet;  //回国日期
    @Transient
    private String exitReturndate;  //回国日期
    @Transient
    private String exitTogoabroadtodate;  //出国日期

    public Integer getExitId() {
        return exitId;
    }

    public void setExitId(Integer exitId) {
        this.exitId = exitId;
    }

    public String getExitName() {
        return exitName;
    }

    public void setExitName(String exitName) {
        this.exitName = exitName;
    }

    public String getExitSection() {
        return exitSection;
    }

    public void setExitSection(String exitSection) {
        this.exitSection = exitSection;
    }

    public String getExitTothecountry() {
        return exitTothecountry;
    }

    public void setExitTothecountry(String exitTothecountry) {
        this.exitTothecountry = exitTothecountry;
    }

    public String getExitReasons() {
        return exitReasons;
    }

    public void setExitReasons(String exitReasons) {
        this.exitReasons = exitReasons;
    }

    public String getExitWhetherclassified() {
        return exitWhetherclassified;
    }

    public void setExitWhetherclassified(String exitWhetherclassified) {
        this.exitWhetherclassified = exitWhetherclassified;
    }

    public String getExitApprovalflow() {
        return exitApprovalflow;
    }

    public void setExitApprovalflow(String exitApprovalflow) {
        this.exitApprovalflow = exitApprovalflow;
    }

    public Date getExitTogoabroadtodatet() {
        return exitTogoabroadtodatet;
    }

    public void setExitTogoabroadtodatet(Date exitTogoabroadtodatet) {
        this.exitTogoabroadtodatet = exitTogoabroadtodatet;
    }

    public Date getExitReturndatet() {
        return exitReturndatet;
    }

    public void setExitReturndatet(Date exitReturndatet) {
        this.exitReturndatet = exitReturndatet;
    }

    public String getExitReturndate() {
        return exitReturndate;
    }

    public void setExitReturndate(String exitReturndate) {
        this.exitReturndate = exitReturndate;
    }

    public String getExitTogoabroadtodate() {
        return exitTogoabroadtodate;
    }

    public void setExitTogoabroadtodate(String exitTogoabroadtodate) {
        this.exitTogoabroadtodate = exitTogoabroadtodate;
    }

    @Override
    public String toString() {
        return "Outbound{" +
                "exitId=" + exitId +
                ", exitName='" + exitName + '\'' +
                ", exitSection='" + exitSection + '\'' +
                ", exitTothecountry='" + exitTothecountry + '\'' +
                ", exitReasons='" + exitReasons + '\'' +
                ", exitWhetherclassified='" + exitWhetherclassified + '\'' +
                ", exitApprovalflow='" + exitApprovalflow + '\'' +
                ", exitTogoabroadtodatet=" + exitTogoabroadtodatet +
                ", exitReturndatet=" + exitReturndatet +
                ", exitReturndate='" + exitReturndate + '\'' +
                ", exitTogoabroadtodate='" + exitTogoabroadtodate + '\'' +
                '}';
    }
}
