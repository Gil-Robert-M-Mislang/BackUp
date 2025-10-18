package inputs;

public class Arguments {
	public static void main(String[] args) {
		System.out.println("Number of Command Line Arguments: " + args.length);
		System.out.println("Inputs: ");
		for(int i = 0; i < args.length; i++) {
			System.out.println("Input #" + i+1 + " is " + args[i]);
		}
	}
}
