/*
 * Program for  Employee which contains the details about the employee

 * and define various member functions to display 
 *  Employee details, fetch employee details, or perform some other operations.
 */
package demo2;

class Employee {
	
	private int emp_id,JoiningYear, salary; 
	private String name, email;  
	private  String department;
	private static String CompanyName = "Tech Mahindra";

	

	//Getter and setters for getting and setting properties  
	 int getJoiningYear() {  
	    return JoiningYear;  
	}  
	void setJoiningYear(int JoiningYear) {  
	    this.JoiningYear = JoiningYear;  
	}  
	 int getEmp_id() {  
	    return emp_id;  
	}  
	 void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	 int getSalary() {  
	    return salary;  
	}  
	 void setSalary(int salary) {  
	    this.salary = salary;  
	}  
	 String getName() {  
	    return name;  
	}  
	 void setName(String name) {  
	    this.name = name;  
	    }
	 String getEmail() {  
	    return email;  
	}  
	 void setEmail(String email) {  
	    this.email = email;  
	}  

	 String getDepartment() {  
	    return department;  
	}  
	 void setDepartment(String department) {  
	    this.department = department;  
	}  
  
	 static void display(Employee emp)
	{
		
	System.out.println( "Company Name: " + CompanyName+ ""
			+ " [emp_id = " + emp.emp_id + 
			", salary = " + emp.salary + ", name = " + emp.name 
 + ", department = " + emp.department + ", email = " + emp.email + 
 ", JoiningYear = " + emp.JoiningYear + "]"  + '\n');  
	}
	
	 

} 


class Department 
{
	Department (Employee emp)
	{
		if (emp.getDepartment() == "IT")
		{
			emp.setSalary(25000);
		}
		
		else if (emp.getDepartment() == "Marketing")
		{
			emp.setSalary(20000);
		}
		
		else if (emp.getDepartment() == "Finance")
		{
			emp.setSalary(30000);

		}
	}
	
	 static void Increment(Employee emp)
	{
		int increment = 0;
		int sal = emp.getSalary();
		int JoiningY = emp.getJoiningYear();
		
		/*
		 * if employee joiniing year less than 2019 year 
		 * than 20% increament in saalary
		 */
		
		if (JoiningY < 2019)
		{
			increment = sal * 20 /100;
			sal +=increment;
			emp.setSalary(sal);
		}
		
		/*
		 * if employee joiniing year less than 2021 year 
		 * than 10% increament in saalary
		 */
		else if (JoiningY < 2021)
		{
			increment = sal * 10 /100;
			sal +=increment;
			emp.setSalary(sal);
		}
		
		else
			emp.setSalary(sal);
	}
}

class MyMain
{
	public static void main(String[] args) 
	{
		System.out.println("Employee Details:");
		
		Employee emp1 = new Employee ();
		emp1.setEmp_id(1);  
		emp1.setName("Neha Pawar");
		emp1.setJoiningYear(2020);
		emp1.setEmail("nehapw07@gmail.com");
		emp1.setDepartment("IT");
		Employee.display(emp1);
		
		Employee emp2 = new Employee ();
		emp2.setEmp_id(2);
		emp2.setName("Sunil kamble");
		emp2.setJoiningYear(2021);
		emp2.setEmail("KambSun56@gmail.com");
		emp2.setDepartment("Finance");
		Employee.display(emp2);

		
		Employee emp3 = new Employee ();
		emp3.setEmp_id(3);
		emp3.setName("Pallvi Shinde");
		emp3.setJoiningYear(2018);
		emp3.setEmail("PShinlli@gmail.com");
		emp3.setDepartment("Marketing");
		Employee.display(emp3);
		
		System.out.println("Setting Salary for each Employee: ");
		Department obj1 = new Department(emp1);
        Employee.display(emp1);
        
        Department obj2 = new Department(emp2);
		Employee.display(emp2);
        
        Department obj3 = new Department(emp3);
		Employee.display(emp3);
		
		System.out.println("Incrementing Salary for each Employee: ");
		Department.Increment(emp1);
		Department.Increment(emp2);
		Department.Increment(emp3);
        Employee.display(emp1);
		Employee.display(emp2);
		Employee.display(emp3);
		
		







		
	}
}

 


