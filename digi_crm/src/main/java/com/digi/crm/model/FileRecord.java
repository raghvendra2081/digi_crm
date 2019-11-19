package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Narendra Gangwar
 * FileRecord.java
 * Sep 10, 2019
 */
@Entity
@Table(name="FILE_RECORD")
public class FileRecord {
	
	@Id
	@NotNull
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(name="JOB_ID")
	private Long jobId;
	
	@NotNull
	@Column(name="JOB_NAME")
	private String jobName;
	
	@NotNull
	@Column(name="FILE_TYPE")
	private String fileType;
	
	@NotNull
	@Column(name="FILE_NAME")
	private String fileName;
	
	@Column(name="PRIORITY")
	private String priority;
	
	@Column(name="BUCKET_ID")
	private String bucketId;
	
	@NotNull
	@Column(name="BATCH_RECORD")
	private String batchRecord;
	
	@NotNull
	@Column(name="STATUS")
	private String status;
	
	@Column(name="ERROR_CODE")
	private String errorCode;
	
	@Column(name="ERROR_DESC")
	private String errorDesc;
	
	@NotNull
	@Column(name="BU_ID")
	private String buId;
	
	@NotNull
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@NotNull
	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	@UpdateTimestamp
	private LocalDateTime modifiedDate;
	
	public FileRecord() {
		
	}
	
	public FileRecord(Long id, Long jobId, String jobName, String fileType, String fileName, String priority,
			String bucketId, String batchRecord, String status, String errorCode, String errorDesc, String buId,
			String createdBy, LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate) {
		
		this.id = id;
		this.jobId = jobId;
		this.jobName = jobName;
		this.fileType = fileType;
		this.fileName = fileName;
		this.priority = priority;
		this.bucketId = bucketId;
		this.batchRecord = batchRecord;
		this.status = status;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.buId = buId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getBucketId() {
		return bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}

	public String getBatchRecord() {
		return batchRecord;
	}

	public void setBatchRecord(String batchRecord) {
		this.batchRecord = batchRecord;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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
		return "FileRecord [id=" + id + ", jobId=" + jobId + ", jobName=" + jobName + ", fileType=" + fileType
				+ ", fileName=" + fileName + ", priority=" + priority + ", bucketId=" + bucketId + ", batchRecord="
				+ batchRecord + ", status=" + status + ", errorCode=" + errorCode + ", errorDesc=" + errorDesc
				+ ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	
	

}
