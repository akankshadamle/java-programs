import java.util.Scanner;
class MathOperation
	{
	static int x, y;
	static float z;
	static void setValue()
		{
		Scanner o1 = new Scanner(System.in);
		System.out.println("\n enter x and y ");
		x = o1.nextInt();
		y= o1.nextInt();
		}
	static void add()
		{
		z=x+y;
		System.out.println("\n Addition = "+z);
		}
	static void sub()
		{
		z=x+y;
		System.out.println(" \n Subtraction = " +z);
		}
	static void multiply()
		{
		z=x*y;
		System.out.println(" \n multiplication= " +z);
		}	
	static void div()
		{
		z=(float)x/y;
		System.out.println(" \n division = " +z);
		}
}
class MathDemo
{
	public static void main(String s[])
		{
		MathOperation.setValue();
		MathOperation.add();
		MathOperation.sub();
		MathOperation.multiply();
		MathOperation.div();

		}
}
