import java.util.Scanner;
class Main
{
  public static int fn(int e, int b)
  {
    int power = 1;
    for(int i=1 ; i<=e ; i++)
    {
      power = power * b;
    }
    return power;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int expo = in.nextInt();
    int pow = fn(expo,base);
    System.out.print(pow);
  }
}
