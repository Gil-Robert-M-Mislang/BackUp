import java.util.Scanner;

public class Harshad{
    public static boolean main(String[] args) {
        int numbers = 0;
        int result = 0;
        
        Scanner newInput = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        numbers = newInput.nextInt();

        int temp = numbers;

        while(temp >= 10)
        {
            result += temp%10;
            temp /=10;
        }
        

        result += temp;

        if(numbers%result == 0)
        {
            System.out.println("The number is Harshad");
            newInput.close();
            return true;
        }
        else
        {
            System.out.println("The number is not Harshad");
            newInput.close();
            return false;
        }

    }
}
