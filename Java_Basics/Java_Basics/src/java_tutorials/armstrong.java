package java_tutorials;

public class armstrong {

	public static void main(String[] args) {
		int n=153,t=153, rem, quo,sum=0;
		while (n != 0) {
			rem = n % 10;
			quo = n / 10;
			sum= sum+(rem*rem*rem);
			n=quo;
		}
		if(sum==t)
			System.out.print(sum+" is armstrong number");
	}
}
