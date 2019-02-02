import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n  = in.nextInt();
    int list[] = new int[n];
    for(int i = 0 ; i < n ; i++)
    {
      list[i] = in.nextInt();
    }
    perfect_batch(list,n);
  }
  public static void perfect_batch(int list[],int n)
  {
    boolean is_perfect_batch = false;
    int batch_sum = list[0]+list[1]+list[2];
    for(int i = 3 ; i < n ; i = i+3)
    {
      int curr_batch_sum = list[i]+list[i+1]+list[i+2];
      if(curr_batch_sum == batch_sum)
      {
        is_perfect_batch = true;
      }
    }
    if(is_perfect_batch == false)
    {
      System.out.println("Not a Perfect Batch");
    }
    else
    {
      System.out.println("Perfect Batch");
    }
  }
}