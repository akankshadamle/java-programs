class PassArray
{
	public static void main(String s[])
	{
	int temp[]={10,3,4,5,7};
	//printArray(temp);
	System.out.println("\n");
	printArray(new int[]{3,1,2,6,4,2});
	}
public static void printArray(int []a)
	{
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}