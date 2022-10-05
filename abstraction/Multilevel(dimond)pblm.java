interface test
{
	void disp();
}
interface cool
{
	 void cool();
}
  class demo implements test,cool
{
	public void hi()
	{
		System.out.println("byee");
	}
	public void bye()
	{
		System.out.println("leee");
	}
	public void disp()
	{
		System.out.println("feue");
	}
}
public class dimond 
{

	public static void main(String[] args) 
	{
		demo d=new demo();
		d.hi();
		d.bye();
		d.disp();
	}

}