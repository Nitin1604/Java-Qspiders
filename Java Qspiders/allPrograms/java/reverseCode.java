import java.util.Scanner;
class reverseCode
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		do{
			System.out.println("Enter the Number: ");
			int n=sc.nextInt();
			System.out.println("Reverse of "+n+" is: "+reverseNumber(n));
			System.out.println("ENter Y/y to Continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("=====Program Ends!!=====");	
	}
	public static int reverseNumber(int n){
		int rev=0;
		while(n>0){
			int rem=n%10;
			rev=10*rev+rem;
		n=n/10;	
		}
	return rev;
	}
}





