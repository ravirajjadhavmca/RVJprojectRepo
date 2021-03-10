package thisk;

//1) this: to refer current class instance variable
public class Student 
{
	int rollno;
	String name;
	double weight;
	float Height;
	
	Student(int rollno,String name,double weight,float Height)
	{
		this.rollno= rollno;   //vaiable name and argument name are same
		this.name= name; //using by this keyword
		this.weight= weight;
		this.Height= Height;
		
	}
	
	void display()
	{
		System.out.println(rollno + " "+name+" "+weight+" " +Height);
	}

	public static void main(String[] args) 
	{
		Student s1=new Student(101,"Ravi",72.5,5.8f);
		Student s2=new Student(102,"Jadhav",71.6,5.9f);
		s1.display();
		s2.display();
		

	}

}
