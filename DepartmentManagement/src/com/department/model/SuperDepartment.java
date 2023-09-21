package com.department.model;

import com.department.interfaces.DepartmentInterface;

public class SuperDepartment implements DepartmentInterface{

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "No Work as of now";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return "Today is not a holiday";
	}

}
