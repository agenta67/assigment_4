import java.util.Scanner;
public class TaskK {
    public static int lcm(int a, int b) {
        int num = a;
        while (num % a != 0 || num % b != 0) {
            num++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM = " + lcm(a, b));
    }
}