import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;
        double num;

        for (int i = 0; i < 5; i++) {
            num = entrada.nextDouble();
            if (num > 0) {
                pos++;
            }

            if (num % 2 == 0) {
                par++;
            }

            if (num < 0) {
                neg++;
            }

            if (num % 2 != 0) {
                impar++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }
}
