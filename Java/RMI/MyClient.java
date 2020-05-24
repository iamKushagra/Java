import java.rmi.*;
import java.util.Scanner;
public class MyClient
{
	public static void main(String[] args) throws RemoteException
	{
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any two number: ");
		a=in.nextInt();
		b=in.nextInt();
		Arith z=new ArithmeticRemote();
        try
        {
        Naming.lookup("rmi://localhost:5000/soo");
		System.out.println("Sum =" +z.add(a,b));
		System.out.println("Sub =" +z.sub(a,b));
		System.out.println("Multiply =" +z.mul(a,b));
		System.out.println("Div =" +z.div(a,b));
        }
         catch(Exception e){}  
	}
}