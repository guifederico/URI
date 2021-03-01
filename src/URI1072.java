import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        int in = 0, out = 0, num;

        for (int i = 0; i < casos; i++) {
            num = entrada.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
