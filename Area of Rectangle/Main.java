import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    int b = in.nextInt();
    //int first_digit = n/10;
     //int last_digit = n%10;
    int area = l*b;
    System.out.println(area);
  }
}