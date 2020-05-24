import java.util.*;
class reverse
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner (System.in);
		int k, m = 0, n;
		System.out.println ("Give any No");
		k =sc.nextInt();
		while(k>0)
		{
			n = k%10;
			m=(m*10)+n;
			k = k/10;
		}
		System.out.println("Reverse is "+m);
	}
}