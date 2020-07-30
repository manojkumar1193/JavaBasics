package java_tutorials;

public class SumOfArrayNos {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum =0;
		//Enhanced for loop
		for (int item: a) {
			sum = sum + item;
		}
		System.out.println("Enhanced for loop " + sum);
		//Basic for loop
		sum =0;
		for (int item = 0; item<a.length;item++) {
			if(a[item]==3) 
				System.out.println("the index of 3 is "+item);
			sum=sum+a[item];	
		}
		System.out.println("Basic for loop " + sum);
	}

}
