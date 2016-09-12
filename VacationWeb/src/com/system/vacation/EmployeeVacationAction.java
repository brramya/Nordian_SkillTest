package com.system.vacation;

import com.system.vacation.to.VacationSystemTO;

public class EmployeeVacationAction extends VacationCommonAction {
	
	/**
	 * Retrieves detailed vacation info for the employee 
	 */
	@SuppressWarnings("unused")
	public void getMyVacationDetails(){
		validateEmployeeData();
		VacationSystemTO updatedVacationTo = getVacationService().retrieveVacationDetails(getVacationSystemTO());
	}
	
	/**
	 * creates a new leave request or updates an existing request
	 */
	@SuppressWarnings("unused")
	public void createOrUpdateVacation(){
		try {
			VacationSystemTO updatedVacationTo = getVacationService().createOrUpdateVacation(getVacationSystemTO());
			System.out.println("Leave Request Submitted for Manager Approval");
		} catch (Exception e) {
			System.out.println("Leave Request Submission Failed");
			e.printStackTrace();
		}
	}
	
	/**
	 * cancels and existing leave request
	 */
	@SuppressWarnings("unused")
	public void cancelVacation(){
		try {
			VacationSystemTO updatedVacationTo = getVacationService().cancelVacation(getVacationSystemTO());
			System.out.println("Leave Request Cancelled");
		} catch (Exception e) {
			System.out.println("Cannot cancel leave Request");
			e.printStackTrace();
		}
	}
	
	/**
	 * Perform any UI Validations on employee leave request screen
	 */
	private void validateEmployeeData() {
		// perform any UI Validations
	}

	
	
	
}
