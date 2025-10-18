package inputs;

import java.io.Console;

public class Cons {

	public static void main(String[] args) {
		Console console = System.console();
		
		if(console == null) {
			System.out.println("Please run this program in terminal or command prompt");
			return;
		}
		
		String correctUsername = "admin";
		String correctPassword = "java123";
		
		String username = console.readLine("Enter username: ");
		char[] passwordArray = console.readPassword("Enter password: ");
		String password = new String(passwordArray);
		
		if(username.equals(correctUsername) && password.equals(correctPassword)) {
			System.out.println("Login Successful! Welcome, " + username);
		} else if (!(username.equals(correctUsername))) {
			System.out.println("Wrong Username! ");
		} else if (!(password.equals(correctPassword))) {
			System.out.println("Wrong Password! ");
		}
	}
}
