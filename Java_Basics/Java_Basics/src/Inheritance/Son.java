package Inheritance;

public class Son extends Grandfather {

	public static void main(String[] args) {
		Son s = new Son();
		s.city();
		s.country();
		sonactivity();
		Grandfather gf = new Son();
	}
	public static void sonactivity() {
		System.out.println("this is son acticity");
	}
	public Son() {
		System.out.println("i am son");
	}
	public Son(String name) {
		System.out.println("this is parameterized son "+name);
	}
}
