import java.util.Scanner;
class  FindPower
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Base: ");
		int base=sc.nextInt();
		System.out.print("Enter The Raise: ");
		int raise=sc.nextInt();

		int pow=1;
		for (int i=1;i<=raise ;i++ )
		{
			pow*=base;
		}
		System.out.println(pow);

	}
}
