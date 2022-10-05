

public class father 
{
	protected void bike()
	{
	System.out.println("aaa");
	}
	 void car()
	{
		System.out.println("sss");
	}
	private void atm()
	{
		System.out.println("xxxx");
	}
	public void cycle()
	{
		System.out.println("gggg");
	}
}



package myfamily;

public class son extends father
{

	public static void main(String[] args) 
	{
		father f=new father();
		f.bike();
		f.cycle();
		f.car();

	}

}



package uncle;
import myfamily.father;

public class aunty extends father
{

	public static void main(String[] args) 
	{
		aunty a=new aunty();
		a.bike();
		a.cycle();
	
		
	}

}
