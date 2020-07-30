package java_tutorials;

import java.util.Arrays;

public class newArray {
	public static void newArraynonzero(int b,int a[]) {
		int arr[] = new int[b];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				arr[j]=a[i];
				j++;
			}
					
		}
		System.out.println("new array:"+Arrays.toString(arr));			
	}

	public static void main(String[] args) {
		int a[]= {1,4,0,6,7,0,2,1};
		int zerocount=0;
		int nonzerocount=0;
		int count= a.length;
		for(int i=0;i<count;i++) {
			if(a[i]==0)
				zerocount=zerocount+1;		
			else
				nonzerocount= nonzerocount+1;		
		}
		System.out.println("nonzerocount:"+nonzerocount);
		System.out.println("zerocount:"+zerocount);
		newArraynonzero(nonzerocount,a);
	}

}
