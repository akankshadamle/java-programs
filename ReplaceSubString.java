public class ReplaceSubString
{
	public static void main(String s[])
	{
	String str= "hello world";
	String temp;
	System.out.println(str);
	temp=str.replace('H','W');
	System.out.println(temp);
	temp=str.replaceFirst("he","wa");
	System.out.println(temp);
	System.out.println(str=str.replaceAll("o","O"));
	System.out.println(str);
	}
}