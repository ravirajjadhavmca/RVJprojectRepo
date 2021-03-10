package encapsulation;

public class Employee 
{
  private int emp_id;
  private String name;
  private int emp_age;
  
  
	public int getEmp_id() {
	return emp_id;
}


public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getEmp_age() {
	return emp_age;
}


public void setEmp_age(int emp_age) {
	this.emp_age = emp_age;
}


	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEmp_id(1100);
		e.setName("Raviraj");
		e.setEmp_age(29);
		
		System.out.println(e.getEmp_id());
		System.out.println(e.getName());
		System.out.println(e.getEmp_age());

	}

}
