/**
 * 
 */
package com.digi.crm.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author Narendra Gangwar Customer.java Oct 11, 2019
 */

@Entity
@Table(name = "CUSTOMER_ATTRIBUTES")
public class CustomerAttributes {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "ACCT_ID")
    private String acctId;

    @Column(name = "MSISDN")
    private String msiSdn;

    @NotNull
    @Column(name = "CUST_CODE")
    private String custCode;

    @NotNull
    @Column(name = "ATTRIBUTE_NAME")
    private String attrName;

    @NotNull
    @Column(name = "ATTRIBUTE_VALUE")
    private String attrValue;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REMARKS")
    private String remarks;

    @NotNull
    @Column(name = "BU_ID")
    private String buId;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private LocalDateTime modifiedDate;

    public Long getID() {
        return ID;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getMsiSdn() {
        return msiSdn;
    }

    public void setMsiSdn(String msiSdn) {
        this.msiSdn = msiSdn;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBuId() {
        return buId;
    }

    public void setBuId(String buId) {
        this.buId = buId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
