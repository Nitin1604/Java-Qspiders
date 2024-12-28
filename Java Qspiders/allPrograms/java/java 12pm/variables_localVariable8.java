class variables_localVariable8
{
	public static void main(String[] args)
	{			
		int x;
		{
			int y=50;
			x=93;
			x=63;
			y=34;
			System.out.println("Value of y which is inside the scope: " +y);//34
			System.out.println("Value of x which is inside the scope: " +x);//63
			x=123;	x=55;
		}
		System.out.println("Value of x which is outside the scope: " +x);//55
	}
}

