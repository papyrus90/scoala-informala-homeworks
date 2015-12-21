package exception.test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exception.Employee;
import exception.EmployeeManagement;

public class EmployeeManagementTest {
	private Employee employee;
	private List<Employee> employees;
	private EmployeeManagement m1 = new EmployeeManagement();

	@Before
	public void setup() {
		employees = new ArrayList<>();

	}

	@Test
	public void checkAddEmployee() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 9, 25));
		m1.addEmployee(employee, employees);
		Assert.assertEquals(1, employees.size());
	}

	@Test
	public void checkDeleteEmployee() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 9, 25));
		m1.addEmployee(employee, employees);
		m1.deleteEmployee(employee, employees);
		Assert.assertEquals(0, employees.size());

	}

	@Test(expected = NullPointerException.class)
	public void checkDeleteEmployeeOfNonExistingEmployee() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 9, 25));
		Employee employee1 = new Employee("Ion", "Pop", new GregorianCalendar(1999, 9, 25));
		m1.addEmployee(employee, employees);
		m1.deleteEmployee(employee1, employees);
	}

	@Test
	public void checkSortByBirthDate() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 9, 25));
		Employee employee1 = new Employee("Ion", "Pop", new GregorianCalendar(1999, 9, 25));
		Employee employee2 = new Employee("Cristi", "Pop", new GregorianCalendar(1989, 9, 25));
		m1.addEmployee(employee, employees);
		m1.addEmployee(employee1, employees);
		m1.addEmployee(employee2, employees);
		m1.sortByBirthDate(employees);
		Assert.assertEquals(employee1, employees.get(0));
		Assert.assertEquals(employee, employees.get(1));
		Assert.assertEquals(employee2, employees.get(2));

	}

	@Test
	public void checkSortByFirstName() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 9, 25));
		Employee employee1 = new Employee("Ion", "Pop", new GregorianCalendar(1999, 9, 25));
		Employee employee2 = new Employee("Cristi", "Pop", new GregorianCalendar(1989, 9, 25));
		m1.addEmployee(employee, employees);
		m1.addEmployee(employee1, employees);
		m1.addEmployee(employee2, employees);
		m1.sortByFirstName(employees);
		Assert.assertEquals(employee, employees.get(0));
		Assert.assertEquals(employee2, employees.get(1));
		Assert.assertEquals(employee1, employees.get(2));
	}

	@Test
	public void checkListSameAge() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 2, 25));
		Employee employee1 = new Employee("Ion", "Pop", new GregorianCalendar(1990, 4, 25));
		Employee employee2 = new Employee("Cristi", "Pop", new GregorianCalendar(1988, 1, 25));
		m1.addEmployee(employee, employees);
		m1.addEmployee(employee1, employees);
		m1.addEmployee(employee2, employees);
		List<Employee> sameAge;
		sameAge = m1.listSameAge(25, employees);
		Assert.assertEquals(2, sameAge.size());
		Assert.assertEquals(employee, sameAge.get(0));
		Assert.assertEquals(employee2, sameAge.get(1));
	}
	@Test
	public void checkListSameLastName(){
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 2, 25));
		Employee employee1 = new Employee("Ion", "Pop", new GregorianCalendar(1990, 4, 25));
		Employee employee2 = new Employee("Cristi", "Pop", new GregorianCalendar(1988, 1, 25));
		m1.addEmployee(employee, employees);
		m1.addEmployee(employee1, employees);
		m1.addEmployee(employee2, employees);
		List<Employee> sameAge;
		sameAge = m1.listSamelastNames("Pop", employees);
		Assert.assertEquals(2, sameAge.size());
		Assert.assertEquals(employee1, sameAge.get(0));
		Assert.assertEquals(employee2, sameAge.get(1));
	}
}
