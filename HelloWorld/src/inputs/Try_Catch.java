package inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_Catch {

	public static void main(String[] args) {
        
        try {
        	BufferedReader basa = new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.print("Enter your name: ");
        	String ngalan = basa.readLine();
        	
        	System.out.print("Enter your age: ");
        	int age = Integer.parseInt(basa.readLine());
        	
        	System.out.println("\n User Information: ");
        	System.out.println("Name: " + ngalan);
        	System.out.println("Age: " + age);
        	
        	basa.close();
        } catch (IOException wrong) {
        	System.out.println("Error reading input: " + wrong.getMessage());
        } catch (NumberFormatException wrong) {
        	System.out.println("Please enter a valid number for age " + wrong.getMessage());
        }

	}

}
