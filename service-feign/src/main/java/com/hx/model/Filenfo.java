package com.hx.model;

import javax.persistence.*;
import java.io.Serializable;

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
    private String fileTheUnits; //发文单位
    @Column(name="File_year")
    private String fileyear;  //年度
    @Column(name="File_DateOfDispatch")
    private String fileDateOfDispatch;  //发文日期
    @Column(name="File_Securitylevel")
    private String fileSecuritylevel;  //密级
    @Column(name="File_Pages")
    private String filePages;  //页数
    @Column(name="File_Headline")
    private String fileHeadline;  //标题
    @Column(name="File_MasterCopy")
    private String fileMasterCopy;  //是否原件

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileTheUnits() {
        return fileTheUnits;
    }

    public void setFileTheUnits(String fileTheUnits) {
        this.fileTheUnits = fileTheUnits;
    }

    public String getFileyear() {
        return fileyear;
    }

    public void setFileyear(String fileyear) {
        this.fileyear = fileyear;
    }

    public String getFileDateOfDispatch() {
        return fileDateOfDispatch;
    }

    public void setFileDateOfDispatch(String fileDateOfDispatch) {
        this.fileDateOfDispatch = fileDateOfDispatch;
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

    public String getFileMasterCopy() {
        return fileMasterCopy;
    }

    public void setFileMasterCopy(String fileMasterCopy) {
        this.fileMasterCopy = fileMasterCopy;
    }

    @Override
    public String toString() {
        return "Filenfo{" +
                "fileId=" + fileId +
                ", fileTheUnits='" + fileTheUnits + '\'' +
                ", fileyear='" + fileyear + '\'' +
                ", fileDateOfDispatch='" + fileDateOfDispatch + '\'' +
                ", fileSecuritylevel='" + fileSecuritylevel + '\'' +
                ", filePages='" + filePages + '\'' +
                ", fileHeadline='" + fileHeadline + '\'' +
                ", fileMasterCopy='" + fileMasterCopy + '\'' +
                '}';
    }
}
