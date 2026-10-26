public class TaskI {
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int num = n;
        while (num > 0) {
            int dig = num % 10;
            sum = sum + dig * dig * dig;
            num = num / 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}