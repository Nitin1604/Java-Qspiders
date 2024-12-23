import java.util.Scanner;
class inbuiltMethod2
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
		getBiggestSmallest(n1,n2,n3);
	}
	public static void getBiggestSmallest(int a, int b, int c){
		int big=0;	int small=0;
		if(a>b && a>c)
			big=a;
		else if(b>c)
			big=b;
		else
			big=c;
		if(a<b && a<c)
			small=a;
		else if(b<c)
			small=b;
		else
			small=c;
		System.out.println("Biggest is: "+big);
		System.out.println("Smallest is: "+small);
	}
}