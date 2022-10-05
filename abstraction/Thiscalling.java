
public class this_calling 
{
	this_calling(int x)
	{
		this("hiii",88);
		System.out.println(x);
	}
	this_calling(String j,int n)
	{
		this(22.4d);
		System.out.println(j+"  "+n);
	}
	this_calling(double w)
	{
		System.out.println(w);
	}
	

	public static void main(String[] args) 
	{
         new this_calling(2);
	}

}
