import java.util.Scanner;
class inbuiltMethod3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		checkNumber(n);
	}
	public static void checkNumber(int n){
		if(n>0){
			System.out.println(n+" is +ve");
		}
		else if(n<0)
			System.out.println(n+" is -ve");
		else
			System.out.println(n+" is Zero");
	}
}
