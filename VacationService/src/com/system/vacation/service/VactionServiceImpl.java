package com.system.vacation.service;

import com.system.vacation.dao.IVacationDao;
import com.system.vacation.to.VacationSystemTO;

public class VactionServiceImpl implements IVacationService {
	
	private IVacationDao vacationDao;
	
	// Retrieve Vacation Info - Employee
	@Override
	public VacationSystemTO retrieveVacationDetails(VacationSystemTO vacationSystemTO) {
		return vacationDao.retrieveVacationDetails(vacationSystemTO);
	}
	
	// Create or Update Vacation Request - Employee
	@Override
	public VacationSystemTO createOrUpdateVacation(VacationSystemTO vacationSystemTO) {
		return vacationDao.createOrUpdateVacation(vacationSystemTO);
	}
	
	// Cancel Vacation Request - Employee
	@Override
	public VacationSystemTO cancelVacation(VacationSystemTO vacationSystemTO) {
		return vacationDao.cancelVacation(vacationSystemTO);
	}
	
	// Retrieve Pending Vacation Requests - Manager
	@Override
	public VacationSystemTO retrievePendingVacationRequests(VacationSystemTO vacationSystemTO) {
		return vacationDao.retrievePendingVacationRequests(vacationSystemTO);
	}
	
	// Approve Vacation Requests - Manager
	@Override
	public VacationSystemTO approveVacation(VacationSystemTO vacationSystemTO) {
		return vacationDao.approveVacation(vacationSystemTO);
	}
	
	// Reject Vacation Requests - Manager
	@Override
	public VacationSystemTO rejectVacation(VacationSystemTO vacationSystemTO) {
		return vacationDao.rejectVacation(vacationSystemTO);
	}

	public IVacationDao getVacationDao() {
		return vacationDao;
	}

	public void setVacationDao(IVacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}

}
