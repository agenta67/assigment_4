import java.util.Scanner;
public class TaskN {
    public static String transformDigits(int n) {
        String res = "";
        String num = "" + n;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }
            res = res + digit;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(transformDigits(n));
    }
}