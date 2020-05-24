    import java.util.Scanner;
     
    class day1
    {
      public static void main(String args[])
      {
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Multiplication table of " + n);
     
        for (int c = 1; c <= 10; c++)
          System.out.println(n + "*" + c + " = " + (n*c));
      }
    }