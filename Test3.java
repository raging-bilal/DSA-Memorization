// Using Memoization To Find The nth Fibonacci Number


// See the difference in calculations for finding the 30th Fibonacci number, with and without memoization:



public class Test3 {
    private static int computationCount = 0;
    private static int computationCountMem = 0;
    private static Integer[] memo = new Integer[31];

    public static void main(String[] args) {
        System.out.println("F(30) = " + F(30));
        System.out.println("Number of computations: " + computationCount);

        System.out.println("\nUsing memoization:");
        System.out.println("F(30) = " + FMem(30));
        System.out.println("Number of computations with memoization: " + computationCountMem);
    }

    public static int F(int n) {
        computationCount++;
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }

    public static int FMem(int n) {
        if (memo[n] != null) { // Already computed
            return memo[n];
        } else { // Computation needed
            computationCountMem++;
            if (n <= 1) {
                memo[n] = n;
            } else {
                memo[n] = FMem(n - 1) + FMem(n - 2);
            }
            return memo[n];
        }
    }
}

//Java