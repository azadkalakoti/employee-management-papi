package com.rbs.interview.assignment.service;
/*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rbs.interview.assignment.model.Employee;
import com.rbs.interview.assignment.model.SortCriteria;
import com.rbs.interview.assignment.model.core.EmployeeDetailsResponse;
import com.rbs.interview.assignment.model.core.EmployeeListResponse;

@Service
public class EmployeeServiceWithCollection {

	private static Map<String, Employee> empMap;
	static {
		empMap = buildEmployeeMap();
	}
	
	public EmployeeListResponse getEmployees() {
		
		EmployeeListResponse employeeListResponse = new EmployeeListResponse();
		employeeListResponse.setEmpList(empMap);
		return employeeListResponse;
	}

	private static Map<String, Employee> buildEmployeeMap() {
		
		Map<String, Employee> employeeMap = new HashMap<>();
		
		employeeMap.put("101", buildEmpoyeeObject(101, "Luka Toni", 1500000.00, "20/06/2015"));
		employeeMap.put("102", buildEmpoyeeObject(102, "Eden Hazard", 2500000.00, "01/082003"));
		employeeMap.put("103", buildEmpoyeeObject(103, "Callum Hudson Odoi", 1627192.00, "31/07/2018"));
		employeeMap.put("104", buildEmpoyeeObject(104, "Ngolo Kante", 1281288.00, "25/04/2009"));
		employeeMap.put("105", buildEmpoyeeObject(105, "Mitchi Batshyuai", 6636181929.00, "03/02/2002"));
		employeeMap.put("106", buildEmpoyeeObject(106, "Benzamin Pavard", 1821891.00, "07/07/1999"));
		employeeMap.put("107", buildEmpoyeeObject(107, "Cristiano Ronaldo", 1299190922.00, "27/12/2011"));
		employeeMap.put("108", buildEmpoyeeObject(108, "Lionel Messi", 712873187218.00, "11/12/2010"));
		employeeMap.put("109", buildEmpoyeeObject(109, "Kylin Mbappe", 32122999.00, "25/11/2006"));
		
		return employeeMap;
	}
	
	private static Employee buildEmpoyeeObject(long empId, String empName, double salary, String dateStr) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setName(empName);
		emp.setSalary(salary);
		try {
			emp.setHireDate(dateFormat.parse("20/06/2015"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public EmployeeDetailsResponse getEmployeeDetails(String empId) {
		
		EmployeeDetailsResponse employeeDetailsResponse = new EmployeeDetailsResponse();
		employeeDetailsResponse.setEmployee(empMap.get(empId));
		
		return employeeDetailsResponse;
	}
	
	public EmployeeListResponse getSortedEmployeeList(SortCriteria sortingCriteria) {
		
		EmployeeListResponse sortedEmployeeListResponse = new EmployeeListResponse();
		
		
		return sortedEmployeeListResponse;
	}
}*/
