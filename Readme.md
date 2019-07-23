# Employee Portal Service API repository
Process API for Employee details in a company.

# Introduction
This API Manages a typical Employee in a company.
It can add a Single Employee or can create all employee records.
It can retireve list of Employees and can get the list sorted by a key.
You may retrieve details of Eployee as well.

# Overview
This API is built on Spring boot 2.0.5. You must have Java 8 and other dependent libraries resolved using maven, to run this

# Error Codes
It returns a basic 404 HttpStatus with details if employee detail is not found.

##### Services and Description
* Get Employee list

	- Method: GET
	- endpoint: /api/employees
	- description: Retrieves list of employees from the backend.
	
* Get Sorted Employee list

	- Method: GET
	- endpoint: /api/employees/sorted
		-- request-parameter: "type"
	- description: Retrieves sorted Employee list - Sorted by any attribute(type) of Employee(ex. Name, Salary, Hiring date)
	
* Get Employee Details
	
	- Method: GET
	- endpoint: /api/employees/{id}
	- description: Retrieve Employee's detail using provided employee id. It throws 404 error if employee id record is not present in BE.
	
* Saves an employee

	- Method: POST
	- endpoint: /api/employee
	- description: Saves an employee in the backend.
	
* Save list of employees

	- Method: POST
	- endpoint: /api/employees
	- description: Saves a list of employees in the backend.
