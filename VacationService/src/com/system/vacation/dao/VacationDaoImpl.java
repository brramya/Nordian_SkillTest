package com.system.vacation.dao;

import com.system.vacation.domain.VacationRequests;
import com.system.vacation.to.VacationSystemTO;

public class VacationDaoImpl implements IVacationDao {
	
	private VacationDaoHelper daoHelper;

	@Override
	public VacationSystemTO retrieveVacationDetails(VacationSystemTO vacationSystemTO) {
		// Retrieve Vacation Details Employee - Get the VacationRequests Domain object
		return daoHelper.populateDomainToTO(new VacationRequests());
	}

	@Override
	public VacationSystemTO createOrUpdateVacation(VacationSystemTO vacationSystemTO) {
		VacationRequests requests = daoHelper.populateTOtoDomain(vacationSystemTO);
		// Create Vacation Request - Insert or update the VacationRequests domain object
		return daoHelper.populateDomainToTO(requests);
	}

	@Override
	public VacationSystemTO cancelVacation(VacationSystemTO vacationSystemTO) {
		VacationRequests requests = daoHelper.populateTOtoDomain(vacationSystemTO);
		// cancel the request - Update the VacationRequests domain object
		return daoHelper.populateDomainToTO(requests);
	}
	
	@Override
	public VacationSystemTO retrievePendingVacationRequests(VacationSystemTO vacationSystemTO) {
		// Retrieve Pending Vacation Request Manager - Get the VacationRequests Domain object
		return daoHelper.populateDomainToTO(new VacationRequests());
	}

	@Override
	public VacationSystemTO approveVacation(VacationSystemTO vacationSystemTO) {
		VacationRequests requests = daoHelper.populateTOtoDomain(vacationSystemTO);
		// Approve the Request - Update the VacationRequests Domain
		return daoHelper.populateDomainToTO(requests);
	}

	@Override
	public VacationSystemTO rejectVacation(VacationSystemTO vacationSystemTO) {
		VacationRequests requests = daoHelper.populateTOtoDomain(vacationSystemTO);
		// Reject the Vacation Request - Update the VacationRequests Domain
		return daoHelper.populateDomainToTO(requests);
	}

	public VacationDaoHelper getDaoHelper() {
		return daoHelper;
	}

	public void setDaoHelper(VacationDaoHelper daoHelper) {
		this.daoHelper = daoHelper;
	}

}
