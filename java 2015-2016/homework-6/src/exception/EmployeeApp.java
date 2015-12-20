package exception;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
	/**
	 * EmployeeTest  class 
	 */
public class EmployeeApp {
	/**
	* the main method 
	*/
	public static void main(String[] args) {
		
		/** An arrayList named employees containing the objects of type Employee. */
		
		List<Employee> employees = new ArrayList<>();
		
		/** creating the objects of type Employee 
		 * creating try-catch blocks
		*/
			EmployeeManagement m1 = new EmployeeManagement();
			try{
			Employee e1 = new Employee("Alex", "Popa", new GregorianCalendar(2999, 9, 25));
			e1.getAge();
			e1.setGender(GenderEnum.MALE);
			}catch(IllegalArgumentException e){		
				System.out.println(e);}
			
			Employee e13 = new Employee("Dorin", "Bertean", new GregorianCalendar(1991, 9, 25));
			
			try{
				Employee e8 = new Employee("Dora", "Popa", new GregorianCalendar(1999, 11, 24));	
				e8.getAge();
				e8.setGender(GenderEnum.FEMALE);
			}catch(IllegalArgumentException e){		
				System.out.println(e);}
			try{
				Employee e9 = new Employee("Alexandra", "Popa", new GregorianCalendar(1901, 9, 25));	
				e9.getAge();
				e9.setGender(GenderEnum.FEMALE);
			}catch(IllegalArgumentException e){		
				System.out.println(e);}
			
			Employee e2 = new Employee("Ion", "Popa", new GregorianCalendar(1993, 2, 15));
			e2.getAge();			
			Employee e3 = new Employee("Crinel", "Sabou", new GregorianCalendar(1990, 8, 1));
			e3.setGender(GenderEnum.UNDECLARED);
			Employee e4 = new Employee("Cristi", "Sechel", new GregorianCalendar(1990, 10, 13));
			e4.setGender(GenderEnum.MALE);
			Employee e10 = new Employee("Dani", "Popa", new GregorianCalendar(1987, 6, 0));
			/** adding objects to the ArrayList */
			m1.addEmployee(e2, employees);
			m1.addEmployee(e3, employees);
			m1.addEmployee(e4, employees);
			m1.addEmployee(e10, employees);
			try{
			/** removing objects from the ArrayList */	
			m1.deleteEmployee(e13, employees);
			}catch(NullPointerException e){
				System.out.println(e);}
			try{
				Employee e5 = new Employee(null, "Popa", new GregorianCalendar(1980, 9, 25));
				e5.setGender(GenderEnum.FEMALE);
				}catch (NullPointerException e) {
					System.out.println(e);
				}
			
			
			/** Sorting the ArrayList by FirstName */
			m1.sortByFirstName(employees);
			System.out.println("");
			
			/** Sorting the ArrayList by LastName */
			m1.sortByLastName(employees);
			System.out.println("");
			
			/** Sorting the ArrayList by birthDate */
			m1.sortByBirthDate(employees);
			System.out.println("");
			
			m1.listSamelastNames("Popa", employees);
			m1.listSameAge(25, employees);
			e4.getGender();
			
			
			
	}
	
	
	
}