import java.util.Scanner;
class inbuiltMethod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int n3=sc.nextInt();
		int big=getBiggest(n1,n2,n3);
		System.out.println("Biggest is: "+big);
	}
	public static int getBiggest(int a, int b, int c){
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
}