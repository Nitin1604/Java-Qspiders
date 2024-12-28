class variableShadowing1
{
	static int x=12;
	public static void main(String[] args)
	{
		int x=23;
		System.out.println("Local x is: "+x);
		System.out.println("static x is: "+variableShadowing1.x);
	}
}

