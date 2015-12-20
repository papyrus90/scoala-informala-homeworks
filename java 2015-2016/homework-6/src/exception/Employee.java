package exception;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
* Employee class with 5 variables firstName,lastName,birthDate,age,gender
*/
public class Employee {
	
	private String  firstName ;
	private String lastName;
	private Calendar birthDate;
	protected int age;
	private GenderEnum gender;
	
	
	/**
	* Employee constructor
	* @param firstName,lastName,birthDate
	* @throws NullPointerException
	*/
	  public Employee(String firstName,String lastName,GregorianCalendar birthDate){
		if (firstName==null || (lastName==null)){
			throw new NullPointerException("no name");
		}
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthDate=birthDate;
		
	  }
	
	
	  /** Method which gets the gender. 
	   */
	public  GenderEnum getGender() {
		
		System.out.println("Employee's gender is " + gender);
		return gender;
	}
	/** Method which sets the gender. 
	 */
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	/** Method which gets the firstName. 
	*/
	public String getFirstName() {
		return firstName;
	}
	/** Method which gets the lastName. 
	*/
	public String getLastName() {
		return lastName;
	}
	/** Method which gets the birthDate. 
	*/
	public Calendar getBirthDate() {
		return birthDate;
	}
	
	/** Method which gets the age. 
	 * @throws IllegalArgumentException
	*/
	public int getAge(){
		Calendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR)-17;
		
		if (birthDate.get(Calendar.YEAR)>today.get(Calendar.YEAR)) {
			  throw new IllegalArgumentException("you are a robot from the future");
			}
		if(birthDate.get(Calendar.YEAR)>year){
			throw new IllegalArgumentException ("you are a minor");
		}else if (birthDate.get(Calendar.YEAR)==year||birthDate.get(Calendar.MONTH)>today.get(Calendar.MONTH)){
			throw new IllegalArgumentException ("you are a minor");
		}
		if(birthDate.get(Calendar.YEAR)<1910){
			throw new IllegalArgumentException ("you are too old");
		}
		
		int age = today.get(Calendar.YEAR)-birthDate.get(Calendar.YEAR)	;
		if(today.get(Calendar.MONTH)<birthDate.get(Calendar.MONTH)){
			age--;
		}
		if(today.get(Calendar.MONTH)==birthDate.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH)<birthDate.get(Calendar.DAY_OF_MONTH)){
			age--;
		}
		System.out.println("Employee's age is" +" " + age );
		return age;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	
	

	
}
