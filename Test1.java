// Using Memoization To Find The nth Fibonacci Number


// Find the 6th Fibonacci number with recursion:


public class Test1 {
    public static void main(String[] args) {
        System.out.println("F(6) = " + F(6));
    }

    public static int F(int n) {
        System.out.println("Computing F(" + n + ")");
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }
}

//Java