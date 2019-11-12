class Box
{ 
 double width , height , depth;
 Box() // default 
 {
 }
Box( double a , double b , double c)  // parametrized
 {
 width = a;
 height = b;
 depth = c;
 }
Box( Box temp) // copy
 {
 width = temp.width;
 height = temp.height;
 depth = temp.depth;
 }
void volume()
 { 
 System.out.println( " volume =" + width*height*depth);
 }
}
class BoxConstructor
{
 public static void main(String s[])
 {	
	Box B1 = new Box();
	Box B2 = new Box(1.2, 4.5, 12.6);
	Box B3 = new Box(B2);
	B1.volume();
 	B2.volume();
	B3.volume();
 }
}