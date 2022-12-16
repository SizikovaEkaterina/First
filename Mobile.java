import java.util.Scanner;

public class Mobile {
    public static void main(String agrs[])
        {
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b = sc.nextInt();
   	   int c = sc.nextInt();
 	   int d = sc.nextInt();
           int cost;
           if (d<=b)    
               {
                   System.out.println(cost=a);
               } 
           else 
		{
		    System.out.println (cost=(d-b)*c+a);
		}
  
        }
}