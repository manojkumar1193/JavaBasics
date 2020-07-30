package Inheritance;

public class Grandson extends Son{

	public static void main(String[] args) {
		Grandson gs = new Grandson("manoj");
		gs.sonactivity();
		
	}
	public Grandson() {
		System.out.println("I am grandson");
	}
	public Grandson(String str) {
		super(str);
		System.out.println("this is parameterized Grandson "+str);
	}
}
