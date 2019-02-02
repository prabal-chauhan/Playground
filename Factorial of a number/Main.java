import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int mul=1;//int rev=0,last_digit;
    //int temp = n;
   for(int i=1;i<=n;i++)
    {
      //int num=n%10;
      //n=n/10;
      //sum=sum+(num*num*num);
      //System.out.println(sum);
     mul=mul*i;
     
    }
    //if(temp==sum)
      //System.out.println("Armstrong Number");
    //else
      //System.out.println("Not a Armstrong Number");
    System.out.println(mul);
}
}