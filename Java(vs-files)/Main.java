import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        int choice = 0;

        System.out.println("\n\t\t========= Main Menu =========");
        System.out.println("\t\t1. Automorphic");
        System.out.println("\t\t2. Harshad");
        System.out.println("\t\t3. Mortgage");
        System.out.println("\t\t4. Transpose");
        System.out.println("\t\t5. Try");
        System.out.print("\t\tPlease enter your choice: ");
        choice = newInput.nextInt();

        System.err.println(choice);

        newInput.close();
    }
}