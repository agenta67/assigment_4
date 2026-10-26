import java.util.Scanner;
public class TaskH {
    public static String decimalToBinary(int n) {
        String binary = "";
        while (n > 0) {
            int d = n % 2;
            binary = d + binary;
            n = n / 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Binary = " + decimalToBinary(n));
    }
}