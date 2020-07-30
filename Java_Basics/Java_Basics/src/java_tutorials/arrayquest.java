package java_tutorials;

public class arrayquest {

	public static void main(String[] args) {
		// 8 11 5
		// 3 4 7
		// 6 10 9
		int a[][]= {{8,11,5},{3,1,7},{6,24,9}};
		int temp,min = 0,ivalue = 0,jvalue = 0,i;
		int j = 0;
		temp=a[0][0];
		int max=a[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
			{
				 if(temp>a[i][j]) 
				 {
					 temp=a[i][j];
					 ivalue= i;
					 jvalue= j;
				 }
			}
	    }
		System.out.println("i is "+ivalue+" j is "+jvalue);
		System.out.println("minimum number is "+temp);
		for(i=0;i<3;i++) {
			for(j=jvalue;j<=jvalue;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		System.out.println("Maximum no in the min column is "+max);
	}
}
