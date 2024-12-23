class incrementDecrement3
{
	public static void main(String[] args)
	{
		int p=20;
		p--;
		int q=p++ + p++;
		int r=p++ + q++ - --q;
		System.out.println("p is: "+p);
		System.out.println("q is: "+q);
		System.out.println("r is: "+r);
	}
}