package com.system.vacation;

import com.system.vacation.service.IVacationService;
import com.system.vacation.to.VacationSystemTO;

public class VacationCommonAction {
	
	private IVacationService vacationService;
	private VacationSystemTO vacationSystemTO;
	
	public IVacationService getVacationService() {
		return vacationService;
	}

	public void setVacationService(IVacationService vacationService) {
		this.vacationService = vacationService;
	}

	public VacationSystemTO getVacationSystemTO() {
		return vacationSystemTO;
	}

	public void setVacationSystemTO(VacationSystemTO vacationSystemTO) {
		this.vacationSystemTO = vacationSystemTO;
	}
}
