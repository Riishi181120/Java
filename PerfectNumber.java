import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		int temp=num;
		int fact=1;
		int sum=0;
		while (num>fact)
		{
			if (num%fact==0)
			{
              sum+=fact;
			}
			fact++;
		}
		if (sum==temp)
		{
			System.out.println("It is Perfect Number");

		}
		else
		{
			System.out.println("It is not perfect number");
		}
	}
}
