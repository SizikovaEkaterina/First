import java.util.Scanner;

public class Add {
    public static void main(String agrs[])
        {
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b = sc.nextInt();  
           if (a >= -32000 && a <= 32000 && b >=-32000 && b <=32000)    
               {
                   System.out.println(a + b);
               } 
                       
        }
}