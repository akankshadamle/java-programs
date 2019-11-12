class Complex 
{ 
int x,y;
void setData(int x,int y)
	{ this.x = x;
	this.y=y;
	}
void showData()
	{ if(y<0)
		System.out.println(x+y+"j");
	else
		System.out.println(x+"+"+y+"j");
	}
Complex retComplex()
	{
	return this;
	}
}
class ComplexDemo
{
	public static void main(String s[])
	{
	Complex c = new Complex();
	c.setData(5,7);
	c.showData();
	Complex temp;
	temp= c.retComplex();
	temp.showData();
	//System.out.println(this);
	}	
}