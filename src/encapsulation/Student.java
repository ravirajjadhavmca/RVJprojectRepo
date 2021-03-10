package encapsulation;

public class Student 
{
	private int rollno;
	private String name;
	private String city;
	
	

	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setRollno(10);
		s.setName("Raviraj");
		s.setCity("Kolhapur");
		
		Student s1=new Student();
		s1.setRollno(11);
		s1.setName("Priyanka");
		s1.setCity("Sangli");
		System.out.println(s.getRollno()+" "+s1.getRollno());
		System.out.println(s.getName()+" "+s1.getName());
		System.out.println(s.getCity()+" "+s1.getCity());
		
		//Student s1=new Student();
//		s1.setRollno(11);
//		s1.setName("Priyanka");
//		s1.setCity("Sangli");
//		System.out.println(s1.getRollno());
//		System.out.println(s1.getName());
//		System.out.println(s1.getCity());
//		
		
	}

}

