package java_tutorials;

public class factorial 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int mul = 1;
		while (n > 0) 
		{
			for (int i = n; i > 0; i--) 
			{
				mul = mul * i;
			}
			System.out.print(n+"! is "+mul);
			System.out.println();
			n--;
			mul=1;
		}
		
	}

}
