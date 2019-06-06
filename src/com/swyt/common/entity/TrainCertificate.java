package com.swyt.common.entity;

import java.util.Date;

public class TrainCertificate {
    private String id;

    private String companyCollieryId;

    private String certificateName;

    private String certificateNumber;

    private String certificateAuthority;

    private Date certificateBeginDate;

    private Date certificateEndDate;

    private String certificateHolderId;

    private String remark;

    private Boolean delFlg;

    private String insertUserId;

    private Date insertDatetime;

    private String updateUserId;

    private Date updateDatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompanyCollieryId() {
        return companyCollieryId;
    }

    public void setCompanyCollieryId(String companyCollieryId) {
        this.companyCollieryId = companyCollieryId == null ? null : companyCollieryId.trim();
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public String getCertificateAuthority() {
        return certificateAuthority;
    }

    public void setCertificateAuthority(String certificateAuthority) {
        this.certificateAuthority = certificateAuthority == null ? null : certificateAuthority.trim();
    }

    public Date getCertificateBeginDate() {
        return certificateBeginDate;
    }

    public void setCertificateBeginDate(Date certificateBeginDate) {
        this.certificateBeginDate = certificateBeginDate;
    }

    public Date getCertificateEndDate() {
        return certificateEndDate;
    }

    public void setCertificateEndDate(Date certificateEndDate) {
        this.certificateEndDate = certificateEndDate;
    }

    public String getCertificateHolderId() {
        return certificateHolderId;
    }

    public void setCertificateHolderId(String certificateHolderId) {
        this.certificateHolderId = certificateHolderId == null ? null : certificateHolderId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    public String getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    public Date getInsertDatetime() {
        return insertDatetime;
    }

    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}