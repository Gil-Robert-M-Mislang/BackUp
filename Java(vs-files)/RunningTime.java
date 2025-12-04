public class RunningTime {

    public static long runAlgorithm(int n) {
        int sum = 0;

        long start = System.nanoTime();
 
        for(int i = 0; i < n; ++i ) 
            for(int j = 0; j < i * i; ++j ) 
                for(int k = 0; k < j; ++k ) 
                    ++sum;


        long end = System.nanoTime();

        return (end - start); // nanoseconds
    }

    public static void main(String[] args) {
        int[] testValues = {3, 6, 9, 12, 15, 18};

        System.out.printf("%-12s %-20s\n", "N", "Time (microseconds)");
        System.out.println("---------------------------------------");

        for (int n : testValues) {
            long ns = runAlgorithm(n);                 // nanoseconds
            double us = ns / 1000.0;                  // convert to microseconds
            System.out.printf("%-12d %-20.3f\n", n, us);
        }
    }
}
