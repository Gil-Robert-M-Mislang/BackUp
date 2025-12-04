import java.io.*;

class Activity {
    public static void dividedByZero() {
        throw new ArithmeticException("Trying to divide by zero");
    }

    public static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main (String[] args) {
        // try {
        //     int dividedByZero = 5/1;
        //     System.out.println(dividedByZero);
        // }
        // catch (ArithmeticException e) {
        //     System.out.println("ArithmeticException => " + e.getMessage());
        // }
        // finally {
        //     System.out.println("This is final block");
        // }

        // dividedByZero();

        try {
            findFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}