interface ArrayType
{
int noOfElements = 10; // by default public, static and final
void average(); // by default abstract and public
}
class IntArray implements ArrayType
{
int x[]; // array refrence
public IntArray()
{
 x= new int[noOfElements];
}
public void getData()
{
int i = 0;
// noOfElements = 20;  interface variable cannot be modified because it's final
for(int t:x)
	x[i++]=i;
}
public void average()
	{
	int sum =0;
	for(int t:x)
		sum+=t;
	System.out.println("average of int Array="+(sum/10.0f));
	}
}
class FloatArray implements ArrayType
{
	float x[];
	public FloatArray()
	{
	  x= new float[noOfElements];
	}
	public void getData()
	{
	int i = 0;
	for(float t:x)
	x[i++]=i*2.1f;
	}
        public void average()
	{
	float sum =0;
	for(float t:x)
		sum+=t;
	System.out.println("average of int Array="+(sum/10.0f));
	}
}
class AverageArray
{
public static void main(String s[])
	{
	IntArray i1= new IntArray();
	FloatArray f1= new FloatArray();
	i1.getData();
	f1.getData();	
	i1.average();
	f1.average();
	}
}