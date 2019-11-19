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

@Entity
@Table(name = "BANK_MASTER")
public class BankMaster {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long BANK_ID;

	@Column(name = "BANK_NAME")
	private String bankName;

	@Column(name = "BANK_TYPE")
	private String bankType;

	@NotNull
	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "IR_CURRENCY")
	private String irCurrency;

	@Column(name = "BANK_CODE")
	private String bankCode;

	@Column(name = "BANK_SHORT_NAME")
	private String bankShortName;

	@Column(name = "EXT_ATR_1")
	private String extAtr1;

	@Column(name = "EXT_ATR_2")
	private String extAtr2;

	@Column(name = "EXT_ATR_3")
	private String extAtr3;

	@Column(name = "EXT_ATR_4")
	private String extAtr4;

	@Column(name = "EXT_ATR_5")
	private String extAtr5;

	@Column(name = "STATUS")
	private String status;


	@Column(name = "BU_ID")
	private String buId;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	//@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	//@UpdateTimestamp
	private LocalDateTime modifiedDate;
	
	@Override
	public String toString() {
		return "BankMaster [BANK_ID=" + BANK_ID + ", bankName=" + bankName + ", bankType=" + bankType + ", currency="
				+ currency + ", irCurrency=" + irCurrency + ", bankCode=" + bankCode + ", bankShortName="
				+ bankShortName + ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3
				+ ", extAtr4=" + extAtr4 + ", extAtr5=" + extAtr5 + ", status=" + status + ", buId=" + buId
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

	public Long getBANK_ID() {
		return BANK_ID;
	}

	public void setBANK_ID(Long bANK_ID) {
		BANK_ID = bANK_ID;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIrCurrency() {
		return irCurrency;
	}

	public void setIrCurrency(String irCurrency) {
		this.irCurrency = irCurrency;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankShortName() {
		return bankShortName;
	}

	public void setBankShortName(String bankShortName) {
		this.bankShortName = bankShortName;
	}

	public String getExtAtr1() {
		return extAtr1;
	}

	public void setExtAtr1(String extAtr1) {
		this.extAtr1 = extAtr1;
	}

	public String getExtAtr2() {
		return extAtr2;
	}

	public void setExtAtr2(String extAtr2) {
		this.extAtr2 = extAtr2;
	}

	public String getExtAtr3() {
		return extAtr3;
	}

	public void setExtAtr3(String extAtr3) {
		this.extAtr3 = extAtr3;
	}

	public String getExtAtr4() {
		return extAtr4;
	}

	public void setExtAtr4(String extAtr4) {
		this.extAtr4 = extAtr4;
	}

	public String getExtAtr5() {
		return extAtr5;
	}

	public void setExtAtr5(String extAtr5) {
		this.extAtr5 = extAtr5;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BANK_ID == null) ? 0 : BANK_ID.hashCode());
		result = prime * result + ((bankCode == null) ? 0 : bankCode.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((bankShortName == null) ? 0 : bankShortName.hashCode());
		result = prime * result + ((bankType == null) ? 0 : bankType.hashCode());
		result = prime * result + ((buId == null) ? 0 : buId.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((extAtr1 == null) ? 0 : extAtr1.hashCode());
		result = prime * result + ((extAtr2 == null) ? 0 : extAtr2.hashCode());
		result = prime * result + ((extAtr3 == null) ? 0 : extAtr3.hashCode());
		result = prime * result + ((extAtr4 == null) ? 0 : extAtr4.hashCode());
		result = prime * result + ((extAtr5 == null) ? 0 : extAtr5.hashCode());
		result = prime * result + ((irCurrency == null) ? 0 : irCurrency.hashCode());
		result = prime * result + ((modifiedBy == null) ? 0 : modifiedBy.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankMaster other = (BankMaster) obj;
		if (BANK_ID == null) {
			if (other.BANK_ID != null)
				return false;
		} else if (!BANK_ID.equals(other.BANK_ID))
			return false;
		if (bankCode == null) {
			if (other.bankCode != null)
				return false;
		} else if (!bankCode.equals(other.bankCode))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (bankShortName == null) {
			if (other.bankShortName != null)
				return false;
		} else if (!bankShortName.equals(other.bankShortName))
			return false;
		if (bankType == null) {
			if (other.bankType != null)
				return false;
		} else if (!bankType.equals(other.bankType))
			return false;
		if (buId == null) {
			if (other.buId != null)
				return false;
		} else if (!buId.equals(other.buId))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (extAtr1 == null) {
			if (other.extAtr1 != null)
				return false;
		} else if (!extAtr1.equals(other.extAtr1))
			return false;
		if (extAtr2 == null) {
			if (other.extAtr2 != null)
				return false;
		} else if (!extAtr2.equals(other.extAtr2))
			return false;
		if (extAtr3 == null) {
			if (other.extAtr3 != null)
				return false;
		} else if (!extAtr3.equals(other.extAtr3))
			return false;
		if (extAtr4 == null) {
			if (other.extAtr4 != null)
				return false;
		} else if (!extAtr4.equals(other.extAtr4))
			return false;
		if (extAtr5 == null) {
			if (other.extAtr5 != null)
				return false;
		} else if (!extAtr5.equals(other.extAtr5))
			return false;
		if (irCurrency == null) {
			if (other.irCurrency != null)
				return false;
		} else if (!irCurrency.equals(other.irCurrency))
			return false;
		if (modifiedBy == null) {
			if (other.modifiedBy != null)
				return false;
		} else if (!modifiedBy.equals(other.modifiedBy))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	

}
