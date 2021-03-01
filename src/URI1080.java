import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, ind = 0, maior = 0;

        for (int i = 0; i < 100; i++) {
            num = entrada.nextInt();

            if (i == 0) {
                maior = num;
                ind = i + 1;
            }

            if (num > maior) {
                maior = num;
                ind = i + 1;
            }
        }

        System.out.printf("%d\n", maior);
        System.out.printf("%d\n", ind);
    }
}
