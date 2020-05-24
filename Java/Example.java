import java.util.Scanner;
class Example
{
	public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter Rows and column");
	int r = sc.nextInt();
	int c = sc.nextInt();
	int arr[][] = new int[r][c];
	System.out.println("enter the element of maatrix");
	for (int i=0;i<r;i++)
		for (int j=0;j<c;j++)
			arr [i][j]= sc.nextInt();

		System.out.println("Your matrix" arr[i][j]);
		System.out.println("The tranpose of Matrix is:");
		for (int i=0;i<c;i++)
		{
		for (int j=0;j<r;j++)
		{
System.out.println(arr [j][i]+ "");
        }
System.out.print("\n");
        }
}
}