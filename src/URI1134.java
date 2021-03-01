import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int fuel;
        int a = 0;
        int g = 0;
        int d = 0;
        int n = 1;

        while (n == 1) {
            fuel = entrada.nextInt();

            if(fuel == 1) {
                a++;
            }

            if(fuel == 2) {
                g++;
            }

            if(fuel == 3) {
                d++;
            }

            if(fuel == 4) {
                n++;
            }
        }

        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", a);
        System.out.printf("Gasolina: %d\n", g);
        System.out.printf("Diesel: %d\n", d);
    }
}
