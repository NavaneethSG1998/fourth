package number;

public class fabecy
{

	public static void main(String[] args) 
	{
       int fib1=0;
       int fib2=1;
       int fib3;
       for(int i=1; i<=10;i++)
       {
       fib3=fib1+fib2;
       fib1=fib2;
       System.out.println(fib3);
	}

}
}