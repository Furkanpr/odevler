package odevler;

import java.util.Scanner;

public class denklemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// :)
	
		System.out.println("-IKINCI DERECEDEN DENKLEMLER-\n");
		
		Scanner y = new Scanner(System.in);
	
		double a,b,c,x1,x2,delta;
		
		System.out.println("x ^ 2 nin katsayisini yaziniz: ");
		 a = y.nextDouble();
	
		System.out.println("x in katsayinini yaziniz: ");
		 b = y.nextDouble();
		
		System.out.println("sabit sayiyi yaziniz: ");
		 c = y.nextDouble();
		
		delta = b*b-(4*a*c);
		 
		 
        if( delta < 0	)
        {		
        	System.out.println("denklemin reel koku yoktur ");	
        }	
		
        else if ( delta == 0	)
        {	
		System.out.println("bir koku vardir(tam kare ifadesidir) ");
        }
	
	
        else 
        {
	
	
	
         x1 = (-b + Math.sqrt(delta)) / (2 * a);
	     x2 = (-b - Math.sqrt(delta)) / (2 * a);
	
	System.out.println("x1= "+ x1);
	System.out.println("\nx2= "+ x2);
	
        }	
	
	}

}
