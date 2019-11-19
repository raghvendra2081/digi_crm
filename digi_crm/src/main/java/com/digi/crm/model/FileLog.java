package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "FILE_LOG")
public class FileLog {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;

	@NotNull
	@Column(name = "JOB_NAME")
	private String jobName;

	@NotNull
	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "PROCESS_DATE")
	private LocalDateTime processDate;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "TOTAL_COUNT", columnDefinition = "int default 0")
	private Integer totalCount;

	@Column(name = "PROCESSED_COUNT", columnDefinition = "int default 0")
	private Integer processedCount;

	@Column(name = "SUCCESS_COUNT", columnDefinition = "int default 0")
	private Integer successCount;

	@Column(name = "FAILURE_COUNT", columnDefinition = "int default 0")
	private Integer failureCount;

	@NotNull
	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	/*@OneToOne(cascade = CascadeType.ALL, mappedBy = "fileLog")
	private PaymentBatchDetails paymentBatchDetails;

	public PaymentBatchDetails getPaymentBatchDetails() {
		return paymentBatchDetails;
	}

	public void setPaymentBatchDetails(PaymentBatchDetails paymentBatchDetails) {
		this.paymentBatchDetails = paymentBatchDetails;
	}*/

	public String getJobName() {
		return jobName;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public LocalDateTime getProcessDate() {
		return processDate;
	}

	public void setProcessDate(LocalDateTime processDate) {
		this.processDate = processDate;
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

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getProcessedCount() {
		return processedCount;
	}

	public void setProcessedCount(Integer processedCount) {
		this.processedCount = processedCount;
	}

	public Integer getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFailureCount() {
		return failureCount;
	}

	public void setFailureCount(Integer failureCount) {
		this.failureCount = failureCount;
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

	@Override
	public String toString() {
		return "FileLog [ID=" + ID + ", jobName=" + jobName + ", fileName=" + fileName + ", processDate=" + processDate
				+ ", status=" + status + ", remarks=" + remarks + ", totalCount=" + totalCount + ", processedCount="
				+ processedCount + ", successCount=" + successCount + ", failureCount=" + failureCount + ", buId="
				+ buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

}
