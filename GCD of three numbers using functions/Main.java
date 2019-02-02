import java.util.Scanner;
public class Main{
    static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
      
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int k = in.nextInt();
      int x = gcd(n,m);
      if(k == 0)
      {System.out.print(x);}
      else
      {
        k=x%k;
        System.out.print(k);
      }
      
	}
}