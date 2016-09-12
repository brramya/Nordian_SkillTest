package com.system.vacation.dao;

import com.system.vacation.to.VacationSystemTO;

public interface IVacationDao {
	
	public VacationSystemTO retrieveVacationDetails(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO createOrUpdateVacation(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO cancelVacation(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO approveVacation(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO rejectVacation(VacationSystemTO vacationSystemTO);

	public VacationSystemTO retrievePendingVacationRequests(VacationSystemTO vacationSystemTO);
	
}
