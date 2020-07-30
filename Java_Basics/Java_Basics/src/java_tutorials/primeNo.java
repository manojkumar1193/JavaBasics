package java_tutorials;

public class primeNo {

	public static void main(String[] args) {
		int n=29;
		int i;
		boolean flag=true;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
			}
		}
		if(flag==true)
			System.out.print(n+" is prime");
		else
			System.out.print(n+" is not prime");
	}

}
