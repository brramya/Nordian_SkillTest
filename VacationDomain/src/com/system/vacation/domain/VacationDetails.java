package com.system.vacation.domain;

import java.sql.Date;

public class VacationDetails {
	
	private VacationRequests vacationRequest;
	
	private Long vacationDetailId;
	
	private Date vacationStartDate;

	private Date vacationEndDate;
	
	private boolean isSick;
	
	private RefVacationStatus refVacationStatus;

	public VacationRequests getVacationRequest() {
		return vacationRequest;
	}

	public void setVacationRequest(VacationRequests vacationRequest) {
		this.vacationRequest = vacationRequest;
	}

	public Long getVacationDetailId() {
		return vacationDetailId;
	}

	public void setVacationDetailId(Long vacationDetailId) {
		this.vacationDetailId = vacationDetailId;
	}
	
	public Date getVacationStartDate() {
		return vacationStartDate;
	}

	public void setVacationStartDate(Date vacationStartDate) {
		this.vacationStartDate = vacationStartDate;
	}

	public Date getVacationEndDate() {
		return vacationEndDate;
	}

	public void setVacationEndDate(Date vacationEndDate) {
		this.vacationEndDate = vacationEndDate;
	}

	public boolean isSick() {
		return isSick;
	}

	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}

	public RefVacationStatus getRefVacationStatus() {
		return refVacationStatus;
	}

	public void setRefVacationStatus(RefVacationStatus refVacationStatus) {
		this.refVacationStatus = refVacationStatus;
	}
}
