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
 * JobMaster.java
 * Sep 10, 2019
 */
@Entity
@Table(name="JOB_MASTER")
public class JobMaster {

	@Id
	@NotNull
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(name="JOB_NAME",unique = true)
	private String jobName;
	
	@NotNull
	@Column(name="JOB_TYPE")
	private String jobType;
	
	@NotNull
	@Column(name="FILE_TYPE")
	private String fileType;
	
	@NotNull
	@Column(name="FILE_INP_PATH")
	private String fileInpPath;
	
	@NotNull
	@Column(name="FILE_OUT_PATH")
	private String fileOutPath;
	
	@Column(name="SCHEDULE")
	private String schedule;
	
	@NotNull
	@Column(name="STATUS")
	private String status;
	
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
	
	public JobMaster() {
	
	}
	
	public JobMaster(Long id, String jobName, String jobType, String fileType, String fileInpPath, String fileOutPath,
			String schedule, String status, String buId, String createdBy, LocalDateTime createdDate, String modifiedBy,
			LocalDateTime modifiedDate) {
		
		this.id = id;
		this.jobName = jobName;
		this.jobType = jobType;
		this.fileType = fileType;
		this.fileInpPath = fileInpPath;
		this.fileOutPath = fileOutPath;
		this.schedule = schedule;
		this.status = status;
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

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileInpPath() {
		return fileInpPath;
	}

	public void setFileInpPath(String fileInpPath) {
		this.fileInpPath = fileInpPath;
	}

	public String getFileOutPath() {
		return fileOutPath;
	}

	public void setFileOutPath(String fileOutPath) {
		this.fileOutPath = fileOutPath;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
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

	@Override
	public String toString() {
		return "JobMaster [id=" + id + ", jobName=" + jobName + ", jobType=" + jobType + ", fileType=" + fileType
				+ ", fileInpPath=" + fileInpPath + ", fileOutPath=" + fileOutPath + ", schedule=" + schedule
				+ ", status=" + status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
}
