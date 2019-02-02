import java.util.Scanner;
class Main
{
   public static int sq_of_numbers(int num)
   {
      int area = num * num;
      return area;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int area1 = sq_of_numbers(n); 
     System.out.println(area1); //result printed here
   }
}
