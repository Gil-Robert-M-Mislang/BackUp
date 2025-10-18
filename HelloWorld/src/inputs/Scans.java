package inputs;

import java.util.Scanner;

public class Scans {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		System.out.println("\n User Information: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		if(age >= 18) {
			System.out.println("You are an adult college student");
		} else {
			System.out.println("You are a minor college student");
		}
		
		input.close();
	}

}
