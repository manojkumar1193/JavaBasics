package java_tutorials;

import java.io.IOException;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String str = sc.nextLine();
		System.out.println("Enter gender: ");
		char gender = sc.next().charAt(0);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Name: "+str);
		System.out.println("gender: "+gender);
		System.out.println("Age: "+age);
	
	}

}
