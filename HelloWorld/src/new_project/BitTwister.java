package new_project;

public class BitTwister {
	public static void main(String[] args) {

        // Question 1: Unary, Shift, and Arithmetic with Negative Numbers
        int x = -5;
        int y = ~x >> 1 + x;
        System.out.println("Question 1: x = " + x + ", y = " + y);

        // Question 2: Postfix Unary, Shift, and Multiplication
        int a = 3;
        int b = a++ << a * 2;
        System.out.println("Question 2: a = " + a + ", b = " + b);

        // Question 3: Mixed Operations with a Larger Shift
        int p = 1;
        int q = p << 30 >> 2;  // Large shift!
        System.out.println("Question 3: p = " + p + ", q = " + q);

        // Question 4: Combining Pre-increment, Subtraction, and Shift
        int m = 10;
        int n = ++m - 5 << m / 3;
        System.out.println("Question 4: m = " + m + ", n = " + n);

        // Question 5: Multiple Unary and Arithmetic
        int val = 7;
        int res = -val * -2 + ~val;
        System.out.println("Question 5: val = " + val + ", res = " + res);

        // Question 6: Combined Shift, Arithmetic, and Negation
        int u = 15;
        int v = -(u >> 2) + u * 3;
        System.out.println("Question 6: u = " + u + ", v = " + v);
    }
}
