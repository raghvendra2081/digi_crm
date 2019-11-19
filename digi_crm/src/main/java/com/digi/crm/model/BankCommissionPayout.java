package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BANK_COMMISSION_PAYOUT")
public class BankCommissionPayout {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "COMM_ID")
	private Long commId;

	@Column(name = "BANK_NAME")
	private String bankName;
	
	@Column(name = "PAYMENT_TYPE")
	private String paymentType;

	@Column(name = "COMM_TYPE")
	private String commType;
	
	@Column(name = "COMM_LOGIC")
	private String commLogic;
	
	@Column(name = "COMM_AMOUNT")
	private Double commAmount;
	
	@Column(name = "TOTAL_COUNT")
	private int totalCount;
	
	@Column(name = "TOTAL_AMOUNT")
	private Double totalAmount;

	@Column(name = "GEN_DATE")
	private String genDate;
	
	@Column(name = "STATUS")
	private String status;
	
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

	@Override
	public String toString() {
		return "BankCommissionPayout [commId=" + commId + ", bankName=" + bankName + ", paymentType=" + paymentType
				+ ", commType=" + commType + ", commLogic=" + commLogic + ", commAmount=" + commAmount + ", totalCount="
				+ totalCount + ", totalAmount=" + totalAmount + ", genDate=" + genDate + ", status=" + status
				+ ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

	public Long getCommId() {
		return commId;
	}

	public void setCommId(Long commId) {
		this.commId = commId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCommType() {
		return commType;
	}

	public void setCommType(String commType) {
		this.commType = commType;
	}

	public String getCommLogic() {
		return commLogic;
	}

	public void setCommLogic(String commLogic) {
		this.commLogic = commLogic;
	}

	public Double getCommAmount() {
		return commAmount;
	}

	public void setCommAmount(Double commAmount) {
		this.commAmount = commAmount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getGenDate() {
		return genDate;
	}

	public void setGenDate(String genDate) {
		this.genDate = genDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
