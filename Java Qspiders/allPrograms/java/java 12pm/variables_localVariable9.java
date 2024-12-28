class variables_localVariable9
{
	public static void main(String[] args)
	{			
		int x;
		{
			int y=50;
			//int x=93;//compilation error
			System.out.println("Values of y which is inside the scope: " +y);// 34
			//System.out.println("Values of x which is inside the scope: " +x);// Produces error here
			x=123;
		}
		System.out.println("Value of x which is outside the scope: "+x);// 
	}
}

