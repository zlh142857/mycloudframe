package com.hx.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*文件信息表*/
@Entity
@Table(name="filenfo")
public class Filenfo implements Serializable {

    private static final long serialVersionUID = 3905027799326108192L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name="File_Id")
    private Integer fileId;  //序号
    @Column(name="File_TheUnits")
    private String fileTheunits; //发文单位
    @Column(name="File_year")
    private String fileyear;  //年度
    @Column(name="File_DateOfDispatch")
    @DateTimeFormat(style = "yyyy/MM/dd")
    private Date fileDateofdispatcht;  //发文日期
    @Column(name="File_Securitylevel")
    private String fileSecuritylevel;  //密级
    @Column(name="File_Pages")
    private String filePages;  //页数
    @Column(name="File_Headline")
    private String fileHeadline;  //标题
    @Column(name="File_MasterCopy")
    private String fileMastercopy;  //是否原件
    @Transient
    private String fileDateofdispatch;  //发文日期

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileTheunits() {
        return fileTheunits;
    }

    public void setFileTheunits(String fileTheunits) {
        this.fileTheunits = fileTheunits;
    }

    public String getFileyear() {
        return fileyear;
    }

    public void setFileyear(String fileyear) {
        this.fileyear = fileyear;
    }

    public Date getFileDateofdispatcht() {
        return fileDateofdispatcht;
    }

    public void setFileDateofdispatcht(Date fileDateofdispatcht) {
        this.fileDateofdispatcht = fileDateofdispatcht;
    }

    public String getFileSecuritylevel() {
        return fileSecuritylevel;
    }

    public void setFileSecuritylevel(String fileSecuritylevel) {
        this.fileSecuritylevel = fileSecuritylevel;
    }

    public String getFilePages() {
        return filePages;
    }

    public void setFilePages(String filePages) {
        this.filePages = filePages;
    }

    public String getFileHeadline() {
        return fileHeadline;
    }

    public void setFileHeadline(String fileHeadline) {
        this.fileHeadline = fileHeadline;
    }

    public String getFileMastercopy() {
        return fileMastercopy;
    }

    public void setFileMastercopy(String fileMastercopy) {
        this.fileMastercopy = fileMastercopy;
    }

    public String getFileDateofdispatch() {
        return fileDateofdispatch;
    }

    public void setFileDateofdispatch(String fileDateofdispatch) {
        this.fileDateofdispatch = fileDateofdispatch;
    }

    @Override
    public String toString() {
        return "Filenfo{" +
                "fileId=" + fileId +
                ", fileTheunits='" + fileTheunits + '\'' +
                ", fileyear='" + fileyear + '\'' +
                ", fileDateofdispatcht=" + fileDateofdispatcht +
                ", fileSecuritylevel='" + fileSecuritylevel + '\'' +
                ", filePages='" + filePages + '\'' +
                ", fileHeadline='" + fileHeadline + '\'' +
                ", fileMastercopy='" + fileMastercopy + '\'' +
                ", fileDateofdispatch='" + fileDateofdispatch + '\'' +
                '}';
    }
}
