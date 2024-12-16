import java.util.Scanner;
class primeInRange
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range:");
		int start=sc.nextInt();
	    System.out.println("Enter end range:");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Prime Numbers are: "+count);
	}
	public static boolean isPrime(int n){
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++){
			if(n%i==0)
				return false;
		}
	return true;
	}
}





