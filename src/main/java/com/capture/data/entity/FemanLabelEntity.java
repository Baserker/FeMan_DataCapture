package com.capture.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 番剧标签实体类
 * 模块名称：demo com.capture.data.entity
 * 功能说明：<br>
 * 开发人员：Luzx
 * 创建时间： 2019-04-09 16:43
 * 系统版本：1.0.0
 **/

@Entity
@Table(name = "feman_label")
public class FemanLabelEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "C_NAME")
    private String cName;

    @Column(name = "E_NAME")
    private String eName;

    @Column(name = "LOCAL_KEY")
    private String localKey;

    @Column(name = "DL_KEY")
    private String dlKey;

    @Column(name = "BL_KEY")
    private String blKey;

    @Column(name = "ANTHOR_KEY")
    private String anthorKey;

    @Column(name = "PARENT_ID")
    private int parentId;

    @Column(name = "DEMO")
    private String demo;

    @Column(name = "IS_SHOW")
    private int isShow;

    public FemanLabelEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getLocalKey() {
        return localKey;
    }

    public void setLocalKey(String localKey) {
        this.localKey = localKey;
    }

    public String getDlKey() {
        return dlKey;
    }

    public void setDlKey(String dlKey) {
        this.dlKey = dlKey;
    }

    public String getBlKey() {
        return blKey;
    }

    public void setBlKey(String blKey) {
        this.blKey = blKey;
    }

    public String getAnthorKey() {
        return anthorKey;
    }

    public void setAnthorKey(String anthorKey) {
        this.anthorKey = anthorKey;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }
}