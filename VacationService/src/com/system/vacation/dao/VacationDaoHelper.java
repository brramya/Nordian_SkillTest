package com.system.vacation.dao;

import com.system.vacation.domain.VacationRequests;
import com.system.vacation.to.VacationSystemTO;

public class VacationDaoHelper {
	
	public VacationSystemTO populateDomainToTO(VacationRequests vacationRequests){
		// convert domain object to VacationSystemTO
		return new VacationSystemTO() ;
	}
	
	public VacationRequests populateTOtoDomain(VacationSystemTO vacationSystemTO){
		// convert VacationSystemTO to domain object 
		return new VacationRequests();
	}

}
