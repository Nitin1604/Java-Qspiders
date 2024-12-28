class variables_localVariable5
{
	public static void main(String[] args)
	{			
		int x;
		{
			int y=50;
			//System.out.println(x);compilation error
			x=93;
			System.out.println("Inside of the scope "+ " value of y is: "+y);
		}
		System.out.println("Outside of the scope "+ " value of x is: "+x);
	}
}

