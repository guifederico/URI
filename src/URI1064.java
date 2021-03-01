import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        double num, med, soma = 0;


        for (int i = 0; i < 6; i++) {
            num = entrada.nextDouble();
            if (num > 0) {
                cont++;
                soma += num;
            }
        }

        med = soma / cont;

        System.out.printf("%d valores positivos\n", cont);
        System.out.printf("%.1f\n", med);

    }
}
