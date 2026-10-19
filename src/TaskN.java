import java.util.Scanner;
public class TaskN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = 0;
        int y = 0;
        int p = 0;
        for (int i = 1; i <= b; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                e += 1;
            } else if (a > 0) {
                y += 1;
            }
            else{
                p += 1;
            }
        }
        System.out.print(e + " " + y + " " + p + " ");
    }
}