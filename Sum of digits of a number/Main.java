import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner  i = new Scanner(System.in);
      int n =i.nextInt();
      int sum =0,m;
     while(n>0)
     {
       m= n%10;
       sum = sum+m;
       n=n/10;
     }
      System.out.println(sum);
       
       
	}
}