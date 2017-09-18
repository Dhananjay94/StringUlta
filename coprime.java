import java.util.Scanner;
class coprime
{
	boolean isCoprime(int a,int b)
	{
		int count=0,min;
		if(a>b)
		{
			min=b;
		}
		else
		{
			min=a;
		}
		for(int i=2;i<=min;i++)
		{	
			if(a%i==0 && b%i==0)
			{
				count++;
			}
		}
		return count==0;
	}
	public static void main(String args[])
	{
		int a,b;
		coprime c=new coprime();
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(c.isCoprime(a,b))
		{
			System.out.println("Coprime");
		}	
		else
		{
			System.out.println("Not coprime");
		}
	}
}