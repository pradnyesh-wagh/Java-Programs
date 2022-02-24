import java.util.*;
class Student
{
	Scanner sc = new Scanner(System.in);
	
	int rollno;
	String name;
	
	void getStud()
	{
		System.out.println("Enter the Rollno");
		rollno = sc.nextInt();
		System.out.println("Enter the Name");
		name = sc.next(); 
	}

}
class Internal extends Student 
{
	int im1;
	int im2;
	
	void getInternal()
	{
		System.out.println("Enter the 1st Internal Marks");
		im1 = sc.nextInt();
		System.out.println("Enter the 2nd Internal Marks");
		im2 = sc.nextInt();
	}
	void ShowInternal()
	{	
		System.out.println("Roll no"+rollno);
		System.out.println("Name"+name);
		System.out.println("1st Internal Marks:"+im1);
		System.out.println("2nd Internal Marks:"+im2);
	}

}
class External extends Student
{
	int em1;
	int em2;

	void getExternal()
	{
		
		System.out.println("Enter the 1st External Marks");
		em1 = sc.nextInt();
		System.out.println("Enter the 2nd External Marks");
		em2 = sc.nextInt();
	}
	void ShowExternal()
	{
		System.out.println("Rollno"+rollno);
		System.out.println("Name"+name);
		System.out.println("1st External Marks:"+em1);
		System.out.println("2nd External Marks:"+em2);
		
	}
}
class Inhdemo
{
	public static void main(String args[])
	{
		External E = new External();
		I.getStud();
		I.getInternal();
		I.showInternal();
		
		External E = new External();
		E.getStud();
		E.getExternal();
		E.showExternal();
	}
	
}