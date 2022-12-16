import java.util.Scanner;

public class Test{
    public static void main(String agrs[])
        {
           Scanner sc = new Scanner(System.in);
           long l = sc.nextLong();
           long r = sc.nextLong();
           int answer = 0;
	   double k1 = 0;
	   double k2 = 0;
	   double k3 = 0;
	   double k4 = 0;
	   double k5 = 0;
	   double k6 = 0;
	   double k7 = 0;
	   double k8 = 0;
	   double k9 = 0;
	  
	
	   for (int i = 0; i<=18; i++) {
	   	k1 = k1 + Math.pow(10, i);
		if (l <= k1 && k1 <= r){
			answer ++;
		}
           }

	   for (int i = 0; i<=18; i++) {
	   	k2 = k2 + 2 * Math.pow(10, i);
		if (l <= k2 && k2 <= r){
			answer ++;
		}
           }
	
	   for (int i = 0; i<=18; i++) {
	   	k3 = k3 + 3 * Math.pow(10, i);
		if (l <= k3 && k3 <= r){
			answer ++;
		}
           }
           

	   for (int i = 0; i<=18; i++) {
	   	k4 = k4 + 4 * Math.pow(10, i);
		if (l <= k4 && k4 <= r){
			answer ++;
		}
           }
	   
	   for (int i = 0; i<=18; i++) {
	   	k5 = k5 + 5 * Math.pow(10, i);
		if (l <= k5 && k5 <= r){
			answer ++;
		}
           }
     	   
	    for (int i = 0; i<=18; i++) {
	   	k6 = k6 + 6 * Math.pow(10, i);
		if (l <= k6 && k6 <= r){
			answer ++;
		}
           }

	    for (int i = 0; i<=18; i++) {
	   	k7 = k7 + 7 * Math.pow(10, i);
		if (l <= k7 && k7 <= r){
			answer ++;
		}
           }

            for (int i = 0; i<=18; i++) {
	   	k8 = k8 + 8 * Math.pow(10, i);
		if (l <= k8 && k8 <= r){
			answer ++;
		}
           }
          
           for (int i = 0; i<=18; i++) {
	   	k9 = k9 + 9 * Math.pow(10, i);
		if (l <= k9 && k9 <= r){
			answer ++;
		}
           }

  	 System.out.println(answer);
        }
}