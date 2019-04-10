import java.util.Objects;
import java.util.Comparator;


public class Employee implements Comparable<Employee>


{
	
	private String ID;
	private String FirstName;
	private String LastName;
	private String JobTitle;
	
	
	public Employee(String id, String fname, String lname, String jtitle)
	{
		ID=id;
		FirstName=fname;
		LastName=lname;
		JobTitle=jtitle;
	}
	



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getJobTitle() {
		return JobTitle;
	}



	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	
	public String toString(String id, String fname, String lname, String jtitle)
	{
		String str="";
		str=id+"  "+fname+"  "+lname+"  "+jtitle;
		return str;
	
	}




	@Override
	public int compareTo(Employee e) 
	{
		
				return this.FirstName.compareTo(e.getFirstName());
	}

}
