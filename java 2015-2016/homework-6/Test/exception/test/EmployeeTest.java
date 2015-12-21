package exception.test;

import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import exception.Employee;

public class EmployeeTest {
	private Employee employee;

	@Test
	public void checkCalculationOfAgeForProperBirthDate() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1990, 2, 25));
		Assert.assertEquals(25, employee.getAge());
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkEmployeeIfHeIsAMinor() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1999, 2, 25));
		employee.getAge();
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkEmployeeIfHeHasAWrongBirthDateFromFuture() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(2999, 2, 25));
		employee.getAge();
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkEmployeeIfHeIsTooOld() {
		employee = new Employee("Alex", "Popa", new GregorianCalendar(1909, 2, 25));
		employee.getAge();
	}
}
