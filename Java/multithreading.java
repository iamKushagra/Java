import java.lang.Thread;
class Thread1 extends Thread
{
	String tname;
	Thread1(String s)
	{
		tname = s;
	}
	public void run()
	{
		try{
			for (int i=1; i<=5; i++)
			{
				System.out.println("Running thread name..." +tname+" value = "+i);
				Thread.sleep(500);

			}
		}catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
class Thread2 extends Thread{
	String tname1;
	Thread2(String s)
	{
		tname1=s;
	}
	public void run()
	{
		try{
			for (int j=5;j>=1;j--)
			{
				System.out.println("Running thread name... "+tname1+" value = " +j);
				Thread.sleep(500);
			}
		}catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	}
class multithreading
{
	public static void main(String[] args)
	{
		Thread1 t1 = new Thread1("A");
		Thread2 t2 = new Thread2("B");
		t1.start();
		t2.start();

	}
}