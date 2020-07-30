package java_tutorials;
import java.util.Arrays;

public class Interview1_1 
{
	public static void main(String[] args) 
	{
		int a[]= {3,4,0,6,7,0,2,5};
		int arr1[] = new int[6];
		//int count= a.length;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				arr1[j]=a[i];
				j++;
			}		
		}
		System.out.println("array elements:"+Arrays.toString(arr1));
	}
}