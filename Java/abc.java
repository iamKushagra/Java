import java.util.Scanner;
public class abc
{
	public static void main(String[] args) 
	{  
    Scanner sc = new Scanner(System.in);
	System.out.println ("Enter Size of Array");
	int r = sc.nextInt();
    int ar[] = new int[r];
    System.out.println("Enter the Element");
      for (int i=0;i<r;i++)
	           ar[i]= sc.nextInt();
                   
 System.out.println("Array Before Sort");  
                    for(int i=0; i < r; i++)
                         {  
                          System.out.print(ar[i] + " "); 
                         }  
                          System.out.println();           
                         selectionsort.selection(ar);
 System.out.println("Array After Sort");  
                    for(int i=0; i < r; i++)
                         {  
                          System.out.print(ar[i] + " ");  
                         }  
     }  
}