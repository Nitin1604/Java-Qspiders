class incrementDecrement4
{
	public static void main(String[] args)
	{
		int p=10; 
		++p;
		int q=p++;
		q--;
		p++;
		int r=p++ + ++p - --q;
		System.out.println("p is: "+p);
		System.out.println("q is: "+q);
		System.out.println("r is: "+r);
	}
}