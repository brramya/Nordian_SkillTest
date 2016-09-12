package com.system.vacation.service;

import com.system.vacation.to.VacationSystemTO;

public interface IVacationService {
	
	public VacationSystemTO retrieveVacationDetails(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO createOrUpdateVacation(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO cancelVacation(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO retrievePendingVacationRequests(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO approveVacation(VacationSystemTO vacationSystemTO);
	
	public VacationSystemTO rejectVacation(VacationSystemTO vacationSystemTO);
}
