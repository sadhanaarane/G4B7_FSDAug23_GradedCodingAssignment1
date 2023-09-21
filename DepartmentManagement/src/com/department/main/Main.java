package com.department.main;

import com.department.model.AdminDepartment;
import com.department.model.HRDepartment;
import com.department.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Admin Department
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		//HR Department
		HRDepartment hr = new HRDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		//Tech Department
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}

}
