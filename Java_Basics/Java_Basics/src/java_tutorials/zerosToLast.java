package java_tutorials;

public class zerosToLast {

	public static void main(String[] args) {
		int arr[]= {0,4,7,5,0,8};
		int count=0;
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=0) {
				arr1[count++]=arr[i];
			}
		}
		while(count<arr.length)
		{
			arr1[count]=0;
			count++;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
