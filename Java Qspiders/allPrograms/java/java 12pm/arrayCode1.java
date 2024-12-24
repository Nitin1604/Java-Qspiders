class arrayCode1
{
	public static void main(String[] args)
	{
		int[] a={12, 23, 34, 45, 16, 34, 34, 45, 46};
	// Index are: 0   1   2   3   4   5   6   7   8  
		System.out.println("Value a is: ");
		System.out.println(a);
		System.out.println("The length of a is: ");
		System.out.println(a.length);
		System.out.println("Items present at index 0 is: ");
		System.out.println(a[0]);
		System.out.println("Items present at index 5 is: ");
		System.out.println(a[5]);
//		System.out.println(a[9]);  // Thows error i.e IndexIsOutOfBoundException
		System.out.println("Items present at index 2 is: ");
		System.out.println(a[2]);
	}
}

