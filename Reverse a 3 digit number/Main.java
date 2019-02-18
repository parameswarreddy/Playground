import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n,reverse=0;
    Scanner i= new Scanner(System.in);
    n=i.nextInt();
    while(n!=0)
    {
      reverse = reverse*10;
      reverse=reverse+n%10;
      n=n/10;
    }
    System.out.println(reverse);
    
  }
}