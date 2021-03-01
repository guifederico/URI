import java.util.Scanner;

public class Slide1 {

    public static double potenciaDois (int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return 2 * potenciaDois(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int n = dado.nextInt();

        System.out.println(potenciaDois(n));

    }
}
