import java.util.Scanner;
class Fibonacci2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		if (num==1)
		{
			System.out.println(n1);
		}
		else if (num==2)
		{
			System.out.println(n2);
		}
		else
		{
			for (int i=3;i<=num ;i++ )
			{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
	}
}
