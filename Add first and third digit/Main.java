import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int last_digit = n%10;
    int first_digit = n/100;
    int sum = last_digit+first_digit;
    System.out.println(sum);
  }
}