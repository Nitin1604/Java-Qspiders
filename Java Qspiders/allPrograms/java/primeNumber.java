import java.util.Scanner;
class primeNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number=sc.nextInt();
		if(isPrime(number)){
	    	System.out.println(number+" is  a Prime Number");
		}
		else {
			System.out.println(number+" is  NOT a Prime Number");
	   }
	}
	public static boolean isPrime(int number){
		if(number<2) {
			return false;
		}	
		for(int i=2;i*i<=number;i++){
			if(number%i==0){
				return false;
		    }
		}
	return true;
	}
}