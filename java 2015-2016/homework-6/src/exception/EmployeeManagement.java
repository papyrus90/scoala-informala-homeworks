package exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * EmployeeManagement class
 */
public class EmployeeManagement {

	/**
	 * Creating a Comparator to compare the firstNames
	 */
	public Comparator<Employee> orderByFirstName() {
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {

				return e1.getFirstName().compareTo(e2.getFirstName());
			}
		};
		return comp;
	}

	/**
	 * Method that sorts the collection by firstName
	 */
	public void sortByFirstName(List<Employee> list) {
		Collections.sort(list, orderByFirstName());
		for (Employee employee : list) {
			System.out.print(employee.getFirstName() + ",");
		}
	}

	/**
	 * Creating a Comparator to compare the lastNames
	 */
	public Comparator<Employee> orderByLastName() {
		Comparator<Employee> comp1 = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {

				return e1.getLastName().compareTo(e2.getLastName());
			}
		};
		return comp1;
	}

	/**
	 * Method that orders the collection by lastName
	 */
	public void sortByLastName(List<Employee> list) {
		Collections.sort(list, orderByLastName());
		for (Employee employee : list) {
			System.out.print(employee.getLastName() + ",");
		}
	}

	/**
	 * Method that orders the collection by birthDate
	 */
	public Comparator<Employee> orderByBirthDate() {
		Comparator<Employee> comp2 = new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {

				return -e1.getBirthDate().compareTo(e2.getBirthDate());
			}
		};
		return comp2;
	}

	public void sortByBirthDate(List<Employee> list) {
		Collections.sort(list, orderByBirthDate());
		for (Employee employee : list) {
			System.out.print(employee.getFirstName() + ",");
		}
	}

	/**
	 * method that lists employees that share lastName.
	 * 
	 * @param age
	 * @param List<Employee>
	 *            employees
	 */
	public List<Employee> listSameAge(int age, List<Employee> employees) {
		List<Employee> age1 = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getAge() == age) {
				age1.add(employee);
			}
		}
		for (Employee e : age1) {
			System.out.println("First Name :" + e.getFirstName() + ",Last Name : " + e.getLastName() + ",Age:" + age);
		}
		return age1;
	}

	/**
	 * method that lists employees that share lastName.
	 * 
	 * @param lastName
	 * @param List<Employee>
	 *            employees
	 */
	public List<Employee> listSamelastNames(String lastName, List<Employee> employees) {
		List<Employee> lastNames = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getLastName().equals(lastName)) {
				lastNames.add(employee);
			}
		}
		for (Employee e : lastNames) {
			System.out.println("First Name :" + e.getFirstName() + ",Last Name : " + e.getLastName());
		}
		return lastNames;
	}

	/**
	 * method that adds objects of type Employee in a list
	 */
	public void addEmployee(Employee employee, List<Employee> list) {
		list.add(employee);
	}

	public void deleteEmployee(Employee employee, List<Employee> list) {
		if (list.contains(employee) == false) {
			throw new NullPointerException("employee does not exist!");
		} else {
			list.remove(employee);
		}
	}

}
