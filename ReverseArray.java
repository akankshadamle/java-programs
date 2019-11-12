class ReverseArray
{
	public static void main(String s[])
	{
	int x[]={10,9,15,6,41,30};
	reverse(x);
	}
	public static void reverse(int y[])
	{
	System.out.print("Reverse array is");
		for(int i=y.length-1; i>=0;i--)
			System.out.print(" "+y[i]);
	}
}