package com.database.ELP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
	@Id
	private int loanid;
	private String loantype;
	private String applicantName;
	private String applicantAddress;
	private String applicantMobile;
	private String applicantEmail;
	private String applicantAdhaar;
	private String applicantPan;
	private String applicantSalery;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAdhaar() {
		return applicantAdhaar;
	}
	public void setApplicantAdhaar(String applicantAdhaar) {
		this.applicantAdhaar = applicantAdhaar;
	}
	public String getApplicantPan() {
		return applicantPan;
	}
	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}
	public String getApplicantSalery() {
		return applicantSalery;
	}
	public void setApplicantSalery(String applicantSalery) {
		this.applicantSalery = applicantSalery;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}

}
