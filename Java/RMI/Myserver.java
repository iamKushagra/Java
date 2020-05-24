import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.net.MalformedURLException;
public class Myserver
{
 public static void main(String[] args) throws RemoteException 
 {
 	Arith stub = new ArithmeticRemote();
 	try
 	{  	
 		Naming.rebind("rmi://localhost:5000/soo", stub);

		
	} catch(MalformedURLException ex)
	    {
		System.out.println(ex.toString());
	    }
 }
}