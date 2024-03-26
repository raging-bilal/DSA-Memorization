// Using Memoization To Find The nth Fibonacci Number



// Find the 6th Fibonacci number with recursion, but using memoization to avoid unnecessary recursive calls:


public class Test2 {
    private static Integer[] memo = new Integer[7]; // Use Integer to allow null values

    public static void main(String[] args) {
        System.out.println("F(6) = " + F(6));
        System.out.print("memo = [");
        for (int i = 0; i < memo.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(memo[i]);
        }
        System.out.println("]");
    }

    public static int F(int n) {
        if (memo[n] != null) { // Already computed
            return memo[n];
        } else { // Computation needed
            System.out.println("Computing F(" + n + ")");
            if (n <= 1) {
                memo[n] = n;
            } else {
                memo[n] = F(n - 1) + F(n - 2);
            }
            return memo[n];
        }
    }
}

//Java