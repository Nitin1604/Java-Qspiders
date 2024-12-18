import java.util.Scanner;
class checkCharacter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c=sc.next().charAt(0);
		String res=checkCharacter(c);
		System.out.println(res);
	}
	public static String checkCharacter(char c)
	{
		if(c>='A' && c<='Z' || c>='a' && c<='z')
			return "This is a Alphabet Character";
		else if(c>='0' && c<='9')
			return "This is a Numeric Character";
		else
			return "This is Special Character";
	}

}
