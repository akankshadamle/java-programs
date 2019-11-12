class TestFinal
{
	final float pi= 3.14f;
	float radius;
	final void area()
		{	
		System.out.println(" \n area of circle=" + pi*radius*radius );
		}
}
class CircleArea extends TestFinal
{  /*void area()
      {} */
 	public static void main(String s[])
		{
		TestFinal t1= new TestFinal();
		//t1.pi=12.3f;
		t1.radius = 1.3f;
		t1.area();
		}

}