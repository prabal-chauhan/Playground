import java.util.Scanner;
class Main{
  public static int fn(int a , int b)
  {
    int big;
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        return big;
  }
	public static void main (String[] args){
	    // Type your code here
     Scanner in = new Scanner(System.in);
      int m = in.nextInt();
      int n = in.nextInt();
      int o = in.nextInt();
      int temp = fn(m,n);
      if(temp > o)
      {
        System.out.print(temp);
      }
      else
      {
        System.out.print(o);
      }  
    }
}