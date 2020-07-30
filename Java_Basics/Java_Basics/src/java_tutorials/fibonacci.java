package java_tutorials;

public class fibonacci {

	public static void main(String[] args) {
		int t1=0,t2=1,sum=0;
		for(int i=0;i<=10;i++) {
			System.out.print(t1+" ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}

	}

}
