import java.util.*;
class ArraySample
{
	public static void main(String args[])
	{
		int i;
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 Element");
		for(i=0;i<=4;i++)
		{
			a[i] = sc.nextInt();

		}
		System.out.println("The Array Element");
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);	
		}
	}
}