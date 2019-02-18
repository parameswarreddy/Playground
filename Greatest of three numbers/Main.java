import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner i= new Scanner(System.in);
      int n1,n2,n3;
      n1=i.nextInt();
      n2=i.nextInt();
      n3=i.nextInt();
      if(n1>n2&&n1>n3)
        System.out.println(n1);
      else if(n2>n1&&n2>n3)
         System.out.println(n2);
      else if(n3>n1&&n3>n2)
         System.out.println(n3);
        
      
      
    }
}