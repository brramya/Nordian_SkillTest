package com.system.vacation.domain;

import java.io.Serializable;

/**
 * Entity implementation class for Entity: Employee
 *
 */

public class Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Long empid;
	private String empName;
	private Department department;
	private boolean isManager;

	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	
   
}
