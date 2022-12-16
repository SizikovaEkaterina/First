import java.util.Scanner;

public class Rulet{
    public static void main(String agrs[])
        {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();             
           double r = Math.log(n) / Math.log(2);
	   int answer = r;
	   if (r % 1 == 0) {
    	   	System.out.println(answer);				
	   }
 	   else {
		 
		System.out.println(answer = Math.floor(r) + 1);
	   }

        }
}