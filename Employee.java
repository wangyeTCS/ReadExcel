


public class Employee implements Comparable<Employee> 


{
	
	private String ID;
	private String FirstName;
	private String LastName;
	private String JobTitle;
	private String str;
	
	public Employee(String id, String fname, String lname, String jtitle)
	{
		this.ID=id;
		this.FirstName=fname;
		this.LastName=lname;
		this.JobTitle=jtitle;
	}
	



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		this.ID = iD;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		this.LastName = lastName;
	}



	public String getJobTitle() {
		return JobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.JobTitle = jobTitle;
	}
	
	public String toString()
	{
		
		str=this.ID+"  "+this.FirstName+"  "+this.LastName+"  "+this.JobTitle;
		return str;
	
	}




	@Override
	public int compareTo(Employee e) 
	{
		
				return this.getFirstName().compareTo(e.getFirstName());
	}

}
