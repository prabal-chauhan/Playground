import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum =0;
      //int first_digit , last_digit , sum=0;
      //last_digit = n%10;
      while(n!=0)
      {
        
        int num = n%10;
        sum = num+sum;
        n=n/10;
      }
      System.out.println(sum);
      
      
      //first_digit = n;
        //sum = first_digit+last_digit;
      
	}
}