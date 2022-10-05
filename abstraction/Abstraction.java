interface ane
{  
	void noise(); 
}
class cat implements ane 
{ 
	public void noise()
	{
		System.out.println("jyoti");
	}
}
class dog implements ane 
{
	public void noise()
	{
		System.out.println("aishu");
	}
}
class snake implements ane 
{
	public void noise()
	{
		System.out.println("frends");
	}
}
class stimulator
{
	static void ansi(ane a1)
	{
		a1.noise();
	}
}
public class Animal 
{
	public static void main(String[] args) 
	{
		cat c=new cat();
		dog d=new dog();
		snake s=new snake();

		stimulator.ansi(c);
		stimulator.ansi(d);
		stimulator.ansi(s);

	}

}
