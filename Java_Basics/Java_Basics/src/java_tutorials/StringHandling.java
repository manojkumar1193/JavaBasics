package java_tutorials;

public class StringHandling {

	public static void main(String[] args) {
		String str="manoj";
		String t="";
		for(int i=str.length()-1;i>=0;i--) {
			t= t + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(t);

	}

}
