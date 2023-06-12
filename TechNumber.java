import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num=sc.nextInt();
		int temp=num;
        int ct=0;
		int sum=0;
		int pow=1;
		while (num>0)
		{
			 ct++;
			 num/=10;
		}
		int base=10;
		int raise=ct/2;
		for (int i=1;i<=raise ;i++ )
		{
          pow*=base;
		}
         int a=temp;
 			 int b=0;

		 while (a>0)
		 {
		    b=a%pow;
			a/=pow;
			break;
		 }
		 sum=a+b;
		 int sq=sum*sum;
		 if (sq==temp)
		 {
			 System.out.println("It is Tech Number");
		 }
		 else
		{
		  System.out.println("It is not an Tech Number");
		}
			 
    }
}
