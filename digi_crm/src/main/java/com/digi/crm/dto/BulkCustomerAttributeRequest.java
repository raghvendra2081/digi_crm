
package com.digi.crm.dto;

public class BulkCustomerAttributeRequest extends BaseRequest{
	
	private String buId;
	private String userId;
	private String fileName;
	private String fileType;
	private String jobName;
	private String source;
	private String sourceTxnId;
	
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getJobName() {
		return jobName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceTxnId() {
		return sourceTxnId;
	}
	public void setSourceTxnId(String sourceTxnId) {
		this.sourceTxnId = sourceTxnId;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	@Override
	public String toString() {
		return "BulkCustomerAttributeRequest [buId=" + buId + ", userId=" + userId + ", fileName=" + fileName
				+ ", fileType=" + fileType + ", jobName=" + jobName + ", source=" + source + ", sourceTxnId="
				+ sourceTxnId + "]";
	}

	/*a.	BU_ID
	b.	USER_ID
	c.	Source
	d.	SourceTxnId
	e.	FileName
	f.	FileType
	g.	JobName*/

	
}
