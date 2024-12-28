class variables_localVariable3
{
	public static void main(String[] args)
	{			
		int x=90;
		System.out.println("Outside scope "+" and value of x is: "+x);
		{
			int y=50;
			System.out.println("Inside scope "+" and value of x is: "+x);
			System.out.println("Inside scope "+" and value of y is: "+y);
		}
		System.out.println("Outside scope "+" and value of x is: "+x);
		//System.out.println(y); // compilation error
	}
}

