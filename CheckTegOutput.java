package it.usi.xframe.cmc.ws105.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

public class CheckTegOutput {

	private BigInteger progr;                  
	private String stateOper;            
	private String tsIns;                 
	private String dipContr;              
	private String identif;               
	private String fTec;                  
	private BigInteger contrFido;             
	private BigDecimal impFidoGeca;          
	private BigDecimal impFidoCin;           
	private BigInteger nCardAuth;             
	private BigInteger nCardTot;              
	private Calendar dateContrFido;         
	private BigDecimal wearRate;              
	private BigDecimal estimatedLiabilities;  
	private BigDecimal applicationTeg;        
	private BigDecimal retrievedTeg;          
	private BigDecimal tan;                   
	private String ftCondiz;              
	private BigDecimal taeg;                  
	private BigInteger numRateCompl;          
	private BigDecimal difTeg;                
	private BigDecimal ecTeg;                 
	private BigDecimal totRateCin;            
	private BigDecimal totOneri;              
	private BigDecimal totRate;
	
	public BigInteger getProgr() {
		return progr;
	}
	public void setProgr(BigInteger progr) {
		this.progr = progr;
	}
	public String getStateOper() {
		return stateOper;
	}
	public void setStateOper(String stateOper) {
		this.stateOper = stateOper;
	}
	public String getTsIns() {
		return tsIns;
	}
	public void setTsIns(String tsIns) {
		this.tsIns = tsIns;
	}
	public String getDipContr() {
		return dipContr;
	}
	public void setDipContr(String dipContr) {
		this.dipContr = dipContr;
	}
	public String getIdentif() {
		return identif;
	}
	public void setIdentif(String identif) {
		this.identif = identif;
	}
	public String getfTec() {
		return fTec;
	}
	public void setfTec(String fTec) {
		this.fTec = fTec;
	}
	public BigInteger getContrFido() {
		return contrFido;
	}
	public void setContrFido(BigInteger contrFido) {
		this.contrFido = contrFido;
	}
	public BigDecimal getImpFidoGeca() {
		return impFidoGeca;
	}
	public void setImpFidoGeca(BigDecimal impFidoGeca) {
		this.impFidoGeca = impFidoGeca;
	}
	public BigDecimal getImpFidoCin() {
		return impFidoCin;
	}
	public void setImpFidoCin(BigDecimal impFidoCin) {
		this.impFidoCin = impFidoCin;
	}
	public BigInteger getnCardAuth() {
		return nCardAuth;
	}
	public void setnCardAuth(BigInteger nCardAuth) {
		this.nCardAuth = nCardAuth;
	}
	public BigInteger getnCardTot() {
		return nCardTot;
	}
	public void setnCardTot(BigInteger nCardTot) {
		this.nCardTot = nCardTot;
	}
	public BigDecimal getWearRate() {
		return wearRate;
	}
	public void setWearRate(BigDecimal wearRate) {
		this.wearRate = wearRate;
	}
	public BigDecimal getEstimatedLiabilities() {
		return estimatedLiabilities;
	}
	public void setEstimatedLiabilities(BigDecimal estimatedLiabilities) {
		this.estimatedLiabilities = estimatedLiabilities;
	}
	public BigDecimal getApplicationTeg() {
		return applicationTeg;
	}
	public void setApplicationTeg(BigDecimal applicationTeg) {
		this.applicationTeg = applicationTeg;
	}
	public BigDecimal getRetrievedTeg() {
		return retrievedTeg;
	}
	public void setRetrievedTeg(BigDecimal retrievedTeg) {
		this.retrievedTeg = retrievedTeg;
	}
	public BigDecimal getTan() {
		return tan;
	}
	public void setTan(BigDecimal tan) {
		this.tan = tan;
	}
	public String getFtCondiz() {
		return ftCondiz;
	}
	public void setFtCondiz(String ftCondiz) {
		this.ftCondiz = ftCondiz;
	}
	public BigDecimal getTaeg() {
		return taeg;
	}
	public void setTaeg(BigDecimal taeg) {
		this.taeg = taeg;
	}
	public BigInteger getNumRateCompl() {
		return numRateCompl;
	}
	public void setNumRateCompl(BigInteger numRateCompl) {
		this.numRateCompl = numRateCompl;
	}
	public BigDecimal getDifTeg() {
		return difTeg;
	}
	public void setDifTeg(BigDecimal difTeg) {
		this.difTeg = difTeg;
	}
	public BigDecimal getEcTeg() {
		return ecTeg;
	}
	public void setEcTeg(BigDecimal ecTeg) {
		this.ecTeg = ecTeg;
	}
	public BigDecimal getTotRateCin() {
		return totRateCin;
	}
	public void setTotRateCin(BigDecimal totRateCin) {
		this.totRateCin = totRateCin;
	}
	public BigDecimal getTotOneri() {
		return totOneri;
	}
	public void setTotOneri(BigDecimal totOneri) {
		this.totOneri = totOneri;
	}
	public BigDecimal getTotRate() {
		return totRate;
	}
	public void setTotRate(BigDecimal totRate) {
		this.totRate = totRate;
	}
	public void setDateContrFido(Calendar dateContrFido) {
		this.dateContrFido = dateContrFido;
	}
	public Calendar getDateContrFido() {
		return dateContrFido;
	}    
}
