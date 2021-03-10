package check;

public class Student 
{
	int rollno;
	String name;
	
	static String college ="BV";
	
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	
	void display()
	{
		System.out.println(rollno + " "+name+" " + college);
//		System.out.println(+name);
//		System.out.println(+ college);
	}


	public static void main(String[] args) 
	{
       Student s1=new Student(101 , "Ravi");
       Student s2=new Student(102 , "Piyu");
    
       s1.display();
       s2.display();
	}

}
