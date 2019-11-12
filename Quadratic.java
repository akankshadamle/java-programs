import java.util.Scanner;
public class Quadratic
 { public static void main( String s[])
   { 
     Scanner o1= new Scanner(System.in);
     int a,b,c;
	float x;
	System.out.println("\n Enter a , b and c");
	a=o1.nextInt();
	b=o1.nextInt();
	c=o1.nextInt();
	if((b*b-4*a*c)>0)
	{	
		x=(float)(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("\n X1="+x);
		x=(float)(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("\n X2="+x);
	}
	else
		System.out.println("roots are imaginary");
	}
}