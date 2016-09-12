package com.system.vacation;

import com.system.vacation.to.VacationSystemTO;

public class ManagerVacationAction extends VacationCommonAction {
	
	@SuppressWarnings("unused")
	public void retrievePendingRequests(){
		validateManagerData();
		try {
			VacationSystemTO updatedVacationTo = getVacationService().retrievePendingVacationRequests(getVacationSystemTO());
		} catch (Exception e) {
			System.out.println("System service error");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public void approveVacation(){
		try {
			VacationSystemTO updatedVacationTo = getVacationService().approveVacation(getVacationSystemTO());
			System.out.println("Vacation Reqests Approved");
		} catch (Exception e) {
			System.out.println("System service error");
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	public void rejectVacation(){
		try {
			VacationSystemTO updatedVacationTo = getVacationService().rejectVacation(getVacationSystemTO());
			System.out.println("Vacation Reqests Rejected");
		} catch (Exception e) {
			System.out.println("System service error");
			e.printStackTrace();
		}
	}
	
	private void validateManagerData() {
		// TODO Auto-generated method stub
	}
}
