package new_project;

public class OperatorExplorers {
	public static void main(String[] args) {

        // Question 1: Boolean Operators & Short-Circuiting
        int x = 5;
        boolean result1 = (x > 10) && (++x < 7);
        System.out.println("Question 1: x = " + x + ", result1 = " + result1);

        // Question 2: Assignment Operators
        int y = 12;
        y %= 5 + 1;
        System.out.println("Question 2: y = " + y);

        // Question 3: Ternary Operator with Arithmetic
        int a = 3;
        int b = 7;
        int max = (a > b) ? a * 2 : b + 5;
        System.out.println("Question 3: max = " + max);

        // Question 4: Combining Boolean, Assignment, and Ternary
        int p = 4;
        boolean q = (p += 2) > 5 ? true : false;
        System.out.println("Question 4: p = " + p + ", q = " + q);

        // Question 5: Boolean XOR and Negation
        boolean bool1 = true;
        boolean bool2 = false;
        boolean result2 = bool1 ^ !bool2;
        System.out.println("Question 5: result2 = " + result2);

        // Question 6: Mixed Operators - Boolean, Arithmetic and Ternary
        int num1 = 10;
        int num2 = 5;
        int result3 = (num1 > num2) ? (num1 - num2) * 2 : (num1 + num2) / 2;
        System.out.println("Question 6: result3 = " + result3);
    }
}
