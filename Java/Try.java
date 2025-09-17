import java.util.Scanner;

class Try
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter a name: ");
        Scanner myInput = new Scanner(System.in);

        String name = myInput.nextLine();
        System.out.println("Your name is " + name);

        myInput.close();
    }
}