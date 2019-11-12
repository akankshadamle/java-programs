class DupElementArray
{	public static void main(String s[])
	{
	int x[]={2,4,1,9,8,4,5,6,3,7};
	int sum =0;
	for(int i=0;i<x.length;i++)
		{
		sum+=x[i];
		}
	System.out.print("duplicate number is="+(sum-45)); // sum of numbers 1-9 is 45
	}
}