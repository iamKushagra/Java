class fibonacci
{
	public static void main (String ar[])
	{
		int n, a=0, b=0, c=1;
		System.out.println("Fibonacci Series: ");
		for (int i = 0; i<10; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}
}