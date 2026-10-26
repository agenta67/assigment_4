import java.util.Scanner;
public class TaskG {
    public static long factorial(int n) {
        long d = 1;
        for (int i = 1; i <= n; i++) {
            d = d * i;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial = " + factorial(n));
    }
}