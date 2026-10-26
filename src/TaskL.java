import java.util.Scanner;
public class TaskL {
    public static int reverseNumber(int n) {
        int revers = 0;
        while (n > 0) {
            int digit = n % 10;
            revers = revers * 10 + digit;
            n = n / 10;
        }
        return revers;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseNumber(n));
    }
}