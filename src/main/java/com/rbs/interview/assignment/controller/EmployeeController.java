package com.rbs.interview.assignment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.interview.assignment.model.Employee;
import com.rbs.interview.assignment.model.SortCriteria;
import com.rbs.interview.assignment.model.core.EmployeeDetailsResponse;
import com.rbs.interview.assignment.model.core.RetreiveEmployeeListResponse;
import com.rbs.interview.assignment.model.core.SaveEmployeeListRequest;
import com.rbs.interview.assignment.service.EmployeeService;

@RestController
@RequestMapping(value = "/rbs")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	/**
	 * Saves a single employees
	 * @param employee
	 */
	@PostMapping("/employee")
    public void saveEmployee(@Valid @RequestBody Employee employee) {
		this.employeeService.saveEmployee(employee);
    }
	
	
	/**
	 * Saves a list of employees
	 * @param saveEmployeeListRequest
	 */
	@PostMapping("/employees")
    public void saveEmployees(
    		@Valid @RequestBody SaveEmployeeListRequest saveEmployeeListRequest) {
		this.employeeService.saveEmployees(saveEmployeeListRequest);
    }
	
	/**
	 * Retrieves Employee list of the organization 
	 * @return
	 * 			- Employee list response object
	 */
	@GetMapping("/employees")
    public RetreiveEmployeeListResponse getAllEmployees() {
        return employeeService.getEmployees();
    }
	
	/**
	 * Retrieve Employee's detail using provided employee id 
	 * @param empId
	 * 			- Provided employee id
	 * @return
	 * 			- Employee details' response object
	 */
	@GetMapping(value = "/employees/{id}")
	public EmployeeDetailsResponse getEmployeeDetails(@PathVariable("id") long empId) {
		
		return this.employeeService.getEmployeeDetails(empId);
	}
	
	/**
	 * Retrieves sorted Employee list of the organization 
	 * @param type
	 * 			- type for sorting criteria(ex. name, doj, salary)
	 * @return
	 * 			- Employee list response object
	 */
	@GetMapping(value = "/sorted-employee-list")
	public RetreiveEmployeeListResponse getSortedEmployeeList(@RequestParam("type") SortCriteria sortingCriteria) {
		
		return this.employeeService.getSortedEmployeeList(sortingCriteria);
	}

}
