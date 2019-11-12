class RemoveChar
{
	public static void main(String s[])
	{
	String str="this is java";
	System.out.println(removeCharAt(str,3));
	}
	public static String removeCharAt(String s, int pos)
	{
	String t1=s.substring(0,pos);
	String t2=s.substring(pos+1);
	return t1+t2;
	}

}