
package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Narendra Gangwar
 * FileTypeRuleMaster.java
 * Sep 10, 2019
 */
@Entity
@Table(name = "FILE_TYPE_RULE_MASTER" )
public class FileTypeRuleMaster {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="FILE_TYPE_RULE_MASTER_SEQ")
	//@SequenceGenerator(name = "FILE_TYPE_RULE_MASTER_SEQ", sequenceName = "hibernate_sequence", allocationSize = 1)
	private Long id;

	@NotNull
	@Column(name = "FILE_TYPE", unique = true)
	private String fileType;

	@Column(name = "FILE_SRC_APP")
	private String fileSrcApp;

	@Column(name = "FILE_SRC_PATH")
	private String fileSrcPath;

	@NotNull
	@Column(name = "TYPE")
	private String type;

	@Column(name = "FTP_IP")
	private String ftpIp;

	@Column(name = "FTP_USER")
	private String ftpUser;

	@Column(name = "FTP_PASSWORD")
	private String ftpPassword;
	@NotNull

	@Column(name = "STATUS")
	private String status;

	@NotNull
	@Column(name = "BU_ID")
	private String buId;

	@NotNull
	@Column(name = "CREATED_BY")
	private String createdBy;

	@NotNull
	@CreationTimestamp
	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@UpdateTimestamp
	@Column(name = "MODIFIED_DATE")
	private LocalDateTime modifiedDate;

	public FileTypeRuleMaster() {

	}

	public FileTypeRuleMaster(Long id, String fileType, String fileSrcApp, String fileSrcPath, String type,
			String ftpIp, String ftpUser, String ftpPassword, String status, String buId, String createdBy,
			LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate) {
		super();
		this.id = id;
		this.fileType = fileType;
		this.fileSrcApp = fileSrcApp;
		this.fileSrcPath = fileSrcPath;
		this.type = type;
		this.ftpIp = ftpIp;
		this.ftpUser = ftpUser;
		this.ftpPassword = ftpPassword;
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

	public String getFileType() {
		return fileType;
	}

	public String getFileSrcApp() {
		return fileSrcApp;
	}

	public void setFileSrcApp(String fileSrcApp) {
		this.fileSrcApp = fileSrcApp;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileSrcPath() {
		return fileSrcPath;
	}

	public void setFileSrcPath(String fileSrcPath) {
		this.fileSrcPath = fileSrcPath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFtpIp() {
		return ftpIp;
	}

	public void setFtpIp(String ftpIp) {
		this.ftpIp = ftpIp;
	}

	public String getFtpUser() {
		return ftpUser;
	}

	public void setFtpUser(String ftpUser) {
		this.ftpUser = ftpUser;
	}

	public String getFtpPassword() {
		return ftpPassword;
	}

	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
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
		return "FileTypeRuleMaster [id=" + id + ", fileType=" + fileType + ", fileSrcPath=" + fileSrcPath + ", type="
				+ type + ", ftpIp=" + ftpIp + ", ftpUser=" + ftpUser + ", ftpPassword=" + ftpPassword + ", status="
				+ status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}
