package com.rbs.interview.assignment.tests;

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import com.rbs.interview.assignment.EmployeeApplication;
import com.rbs.interview.assignment.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeApplication.class, 
				webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
public class EmployeeControllerIntegrationTest {
	/*@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllEmployees() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/employees",
				HttpMethod.GET, entity, String.class);
		
		assertNotNull(response.getBody());
	}

	@Test
	public void testGetEmployeeById() {
		Employee employee = restTemplate.getForObject(getRootUrl() + "/employees/1", Employee.class);
		assertNotNull(employee);
	}

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setName("Azad");
		employee.setSalary(1289128.99);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Employee emp = new Employee();
		try {
			emp.setHireDate(dateFormat.parse("20/06/2015"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		ResponseEntity<Employee> postResponse = restTemplate.postForEntity(getRootUrl() + "/employees", employee, Employee.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	@Test
	public void testUpdateEmployee() {
		int id = 1;
		Employee employee = restTemplate.getForObject(getRootUrl() + "/employees/" + id, Employee.class);

		restTemplate.put(getRootUrl() + "/employees/" + id, employee);

		Employee updatedEmployee = restTemplate.getForObject(getRootUrl() + "/employees/" + id, Employee.class);
		assertNotNull(updatedEmployee);
	}

	@Test
	public void testDeleteEmployee() {
		int id = 2;
		Employee employee = restTemplate.getForObject(getRootUrl() + "/employees/" + id, Employee.class);
		assertNotNull(employee);

		restTemplate.delete(getRootUrl() + "/employees/" + id);

		try {
			employee = restTemplate.getForObject(getRootUrl() + "/employees/" + id, Employee.class);
		} catch (final HttpClientErrorException e) {
			assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
		}
	}*/
}