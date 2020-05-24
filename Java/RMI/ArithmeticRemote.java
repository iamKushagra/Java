import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class ArithmeticRemote extends UnicastRemoteObject implements Arith

{
	public int add(int x, int y) {return (x+y);}
	public int sub(int x, int y) {return (x-y);}
	public int mul(int x, int y) {return (x*y);}
	public int div(int x, int y) {return (x/y);}
ArithmeticRemote()throws RemoteException
{
	super();
}
}


