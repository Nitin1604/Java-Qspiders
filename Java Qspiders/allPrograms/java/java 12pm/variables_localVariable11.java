class variables_localVariable11
{
	public static void main(String[] args)
	{			
		int x;
		{
			int y=50;
			x=93;
			System.out.println("Values of y which is inside the scope: " +y);//50
			System.out.println("Values of x which  is inside the scope: " +x);//93
			x=123;
		}
		int y=44;
		System.out.println("Values of x which is outside the scope: " +x);//123
		System.out.println("Values of y which is outside the scope: " +y);//44
	}
}

