package com.hx.model;

import javax.persistence.*;
import java.io.Serializable;

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
    @Column(name="Exit_ToTheCountry")
    private String exitToTheCountry;//去往国家
    @Column(name="Exit_Reasons")
    private String exitReasons;  //事由
    @Column(name="Exit_WhetherClassified")
    private String exitWhetherClassified;  //是否涉密
    @Column(name="Exit_ApprovalFlow")
    private String exitApprovalFlow;  //审核
    @Column(name="Exit_TogoabroadToDate")
    private String exitTogoabroadToDate;  //出国日期
    @Column(name="Exit_ReturnDate")
    private String exitReturnDate;  //回国日期

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

    public String getExitToTheCountry() {
        return exitToTheCountry;
    }

    public void setExitToTheCountry(String exitToTheCountry) {
        this.exitToTheCountry = exitToTheCountry;
    }

    public String getExitReasons() {
        return exitReasons;
    }

    public void setExitReasons(String exitReasons) {
        this.exitReasons = exitReasons;
    }

    public String getExitWhetherClassified() {
        return exitWhetherClassified;
    }

    public void setExitWhetherClassified(String exitWhetherClassified) {
        this.exitWhetherClassified = exitWhetherClassified;
    }

    public String getExitApprovalFlow() {
        return exitApprovalFlow;
    }

    public void setExitApprovalFlow(String exitApprovalFlow) {
        this.exitApprovalFlow = exitApprovalFlow;
    }

    public String getExitTogoabroadToDate() {
        return exitTogoabroadToDate;
    }

    public void setExitTogoabroadToDate(String exitTogoabroadToDate) {
        this.exitTogoabroadToDate = exitTogoabroadToDate;
    }

    public String getExitReturnDate() {
        return exitReturnDate;
    }

    public void setExitReturnDate(String exitReturnDate) {
        this.exitReturnDate = exitReturnDate;
    }

    @Override
    public String toString() {
        return "Outbound{" +
                "exitId=" + exitId +
                ", exitName='" + exitName + '\'' +
                ", exitSection='" + exitSection + '\'' +
                ", exitToTheCountry='" + exitToTheCountry + '\'' +
                ", exitReasons='" + exitReasons + '\'' +
                ", exitWhetherClassified='" + exitWhetherClassified + '\'' +
                ", exitApprovalFlow='" + exitApprovalFlow + '\'' +
                ", exitTogoabroadToDate='" + exitTogoabroadToDate + '\'' +
                ", exitReturnDate='" + exitReturnDate + '\'' +
                '}';
    }
}
