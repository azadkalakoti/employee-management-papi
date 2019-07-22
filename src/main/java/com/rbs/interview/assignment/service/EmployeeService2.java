package com.rbs.interview.assignment.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbs.interview.assignment.model.Employee;
import com.rbs.interview.assignment.model.SortCriteria;
import com.rbs.interview.assignment.model.core.EmployeeDetailsResponse;
import com.rbs.interview.assignment.model.core.RetreiveEmployeeListResponse;
import com.rbs.interview.assignment.model.core.SaveEmployeeListRequest;

/**
 * Employee Service Class which encapsulate the core logic for all 
 * CRUD operations for Employee data
 * @author Azad Singh
 *
 */
@Service
public class EmployeeService2 {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	/**
	 * Service method to save a single employee
	 * @param employee
	 */
	public void saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}
	
	/**
	 * Service method which returns list of employees
	 * @return RetreiveEmployeeListResponse object
	 */
	public void saveEmployees(SaveEmployeeListRequest saveEmployeeListRequest) {
		
		List<Employee> employees = saveEmployeeListRequest.getEmpList();
		employees.forEach(employee -> {
			employeeRepository.save(employee);
		});
	}
	
	/**
	 * Service method which returns list of employees
	 * @return RetreiveEmployeeListResponse object
	 */
	public RetreiveEmployeeListResponse getEmployees() {
		
		RetreiveEmployeeListResponse retreiveEmployeeListResponse 
									= new RetreiveEmployeeListResponse();
		retreiveEmployeeListResponse.setEmpList(employeeRepository.findAll());
		
		return retreiveEmployeeListResponse;
	}

	/**
	 * Service method which returns employee details using  emloyee ID
	 * @param empId - Employee ID parameter
	 * @return EmployeeDetailsResponse object
	 */
	public EmployeeDetailsResponse getEmployeeDetails(long empId) {
		
		EmployeeDetailsResponse employeeDetailsResponse = new EmployeeDetailsResponse();
		List<Employee> empList = employeeRepository.findAll();
		
		Employee employee = new Employee();
		employee = empList.stream()
			.filter(emp -> empId == emp.getEmpId()).findAny()	
			.orElse(null);
		
		employeeDetailsResponse.setEmployee(employee);
		
		return employeeDetailsResponse;
	}
	
	/**
	 * Service method which returns Sorted employee list
	 * Sorting Criteria is passed as a request parameter
	 * @param sortingCriteria - sorting criteria(ex. NAME, SALARY)
	 * @return sorted RetreiveEmployeeListResponse object
	 */
	public RetreiveEmployeeListResponse getSortedEmployeeList(SortCriteria sortingCriteria) {
		
		RetreiveEmployeeListResponse sortedEmployeeListResponse = new RetreiveEmployeeListResponse();
		List<Employee> sortedEmpList = employeeRepository.findAll();
		
		if (Optional.ofNullable(sortedEmpList).isPresent()) {
			switch (sortingCriteria) {
			case NAME:
				sortedEmpList = sortedEmpList.stream().sorted(Comparator.comparing(Employee::getName))
						.collect(Collectors.toList());
				break;

			case HIRE_DATE:
				sortedEmpList = sortedEmpList.stream().sorted(Comparator.comparing(Employee::getHireDate))
						.collect(Collectors.toList());
				break;

			case SALARY:
				sortedEmpList = sortedEmpList.stream().sorted(Comparator.comparing(Employee::getSalary))
						.collect(Collectors.toList());
				break;
			}
		}
		
		sortedEmployeeListResponse.setEmpList(sortedEmpList);
		return sortedEmployeeListResponse;
	}
	
}
