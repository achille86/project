package it.usi.xframe.cmc.ws105.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CheckTegInput implements Serializable{

	/**
	 * CheckTegInput
	 */
	private static final long serialVersionUID = 6996598719926522942L;
	private BigInteger contractNumber;
	private String productCode;
	private String contractBranch;
	private String primaryContractNumber;
	private BigDecimal CreditLineAmount;
	
	public BigInteger getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(BigInteger contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getContractBranch() {
		return contractBranch;
	}
	public void setContractBranch(String contractBranch) {
		this.contractBranch = contractBranch;
	}
	public String getPrimaryContractNumber() {
		return primaryContractNumber;
	}
	public void setPrimaryContractNumber(String primaryContractNumber) {
		this.primaryContractNumber = primaryContractNumber;
	}
	public BigDecimal getCreditLineAmount() {
		return CreditLineAmount;
	}
	public void setCreditLineAmount(BigDecimal creditLineAmount) {
		CreditLineAmount = creditLineAmount;
	}
	
}
