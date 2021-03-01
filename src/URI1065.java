import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        double num;

        for (int i = 0; i < 5; i++) {
            num = entrada.nextDouble();
            if (num % 2 == 0) {
                cont++;
            }
        }

        System.out.println(cont + " valores pares");
    }
}
