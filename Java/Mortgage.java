import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

class Mortgage{
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        int principalAmount = 0;
        double interestRate = 0.00;
        int period = 0;

        System.out.println("Welcome to Mortgage Calculator!");
        System.out.println("Please provide the following: ");

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principalAmount = newInput.nextInt();

            if(principalAmount >= 1_000 && principalAmount <= 1_000_000)
            {
                break;
            }

            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interestRate = newInput.nextDouble();

            if(interestRate > 0 && interestRate <= 30)
            {
                break;
            }
            
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            period = newInput.nextInt();

            if(period >= 1 && period <= 30)
            {
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        interestRate = (interestRate/100) / 12;
        period *= 12;
        double exponent = Math.pow((1 + interestRate), (double) period);

        double numerator = (double) interestRate * exponent;
        double denominator = exponent - 1;

        double mortgage = principalAmount * (numerator/denominator);

        String result = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + result);

        newInput.close();
    }
}