import java.util.Scanner;
abstract class Emp
	{
	int eno ;
	String ename;
	void getData()
		{
		Scanner o1= new Scanner(System.in);
		System.out.println(" enter eno and ename");
		eno = o1.nextInt();
		ename= o1.next();
		}
	void showData()
 		{
		System.out.println("Emp No="+eno+" "+"Emp Name=" +ename);
		}
	abstract void salary();
	}
class PermanentEmp extends Emp
     {
	float basic, hra, da, pf , gpf, gsal;
	void getPemp()
	{
	Scanner o1= new Scanner(System.in);
	getData();
	System.out.println("enter BASIC , HRA , DA , PF AND GPF");
	basic= o1.nextFloat();
	hra= o1.nextFloat();
	da= o1.nextFloat();
	pf= o1.nextFloat();
	gpf= o1.nextFloat();
	}
	void salary()
	{
	 gsal=basic+hra+da-(pf+gpf);
	showData();
	System.out.println("grand salary ="+gsal);
	}
      }
class TemporaryEmp extends Emp
{
	float gsal, sal_p_day, bonus;
	int attendance;
	void getTemp()
	{
	Scanner o1=new Scanner(System.in);
	getData();
	System.out.println("enter salary per day, no. of attendance, bonus");
	sal_p_day= o1.nextFloat();
	attendance= o1.nextInt();
	bonus = o1.nextFloat();
	}
	void salary()
	{
	gsal=sal_p_day* attendance + bonus;
	showData();
	System.out.println("grand salary ="+gsal);
	}
}
class AbsEmployee
{
	public static void main(String s[])
	{
	PermanentEmp p1= new PermanentEmp();
	TemporaryEmp t1= new TemporaryEmp();
	p1.getPemp();
	t1.getTemp();
	Emp e;
	e=p1;
	e.salary();
	e=t1;
	e.salary();

	}
}