import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    //int b = in.nextInt();
    int first_digit = n/100;
    //int last_digit = n%10;
    //int num = n/10;
    //int second_last_digit = num%10;
    System.out.println(first_digit);
  }
}