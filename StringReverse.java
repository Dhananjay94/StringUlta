import java.util.Scanner;
class StringReverse
{
	public static void main(String args[])
	{
		int n;
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		n=s.length();
		int c=0;
		char temp[]=new char[n];
		for(int i=n-1;i>=0;i--)
		{
			temp[c]=s.charAt(i);
			c++;
		}
		String r=new String(temp);
		System.out.println(r);
	}
}