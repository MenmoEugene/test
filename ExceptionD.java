class D
{
	int div(int a,int b)throws Exception
	{
		return a/b;
	}
}
class ExceptionD 
{
	public static void main(String[] args) 
	{
		D c = new D();
		try
		{
			int x = c.div(4,0);
			sop("x="+x);
		}
		catch (Exception e)
		{
			sop("·ÖÄ¸²»ÎªÁã");
			sop(e.getMessage());
			sop(e.toString());

			e.printStackTrace();
		}
		sop("over");
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
