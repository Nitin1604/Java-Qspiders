class variables_localVariable4
{
	public static void main(String[] args)
	{			
		int x;
		//System.out.println(x); compilation error
		{
			int y=50;
			x=93;
			System.out.println("Inside scope "+" and value of x is: "+x);
			System.out.println("Inside scope "+" and value of y is: "+y);
		}
		System.out.println("Outside scope "+" and value of x is: "+x);
	}
}

