class mk
{
	int a, b;
	mk(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
static class rk extends class mk
{
	int c, d;
	int a, int b, int c;
	{
		super(a,b);
		this.c=c;
	}void sum()
	{
		d=a+b+c;
		System.out.println("sum is" +d);
	}

}
class sk
{
	public static void main(String ar[])
	{
		rk r = new rk (5,10,15);
		r.sum();
	}
}