import java.io.*;
import java.util.Scanner;
class EFG
{
	public void method(int a[])
	{ 
	    int n,i,j,temp;
	    n=a.length;
	    for(i=0;i<n;i++)
		{
			temp=a[i];
            for(j=i-1;j>=0&&a[j]>temp;j--)
		    {
				a[j=1]=a[j]; 			
		    }
		    a[j+1]=temp;
	    }
	}		
}
class insertion
{
	public static void main(String ar[])
	{
		int i,j,n,a[];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		EFG obj=new EFG();
		obj.method(a);
		System.out.println("Sorted array=");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
