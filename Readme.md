# Employee Portal Service API repository
Process API for Employee details in a company

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
