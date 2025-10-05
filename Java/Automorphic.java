import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args)
    {
        Scanner newInput = new Scanner(System.in);
        int intNumber = 0;

        System.out.print("Please enter a number: ");
        intNumber = newInput.nextInt();

        int intSquare = intNumber * intNumber;
        int intRemainder = 0;
        int intResult = 0;

        while(intSquare >= 10)
        {
            intRemainder = intSquare%10;

            if(intResult < 10 && intResult > 0)
            {
                intResult = intResult + 10*intRemainder;
            }
            else
            {
                intResult = intRemainder;
            }

            intSquare /=10;

            if(intResult == intNumber)
            {
                System.out.println("It is an Automorphic");
                return;
            }
        }

        System.out.println("It is not an Automorphic");
        return;
    }
}
