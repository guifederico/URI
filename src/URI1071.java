import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, y, prim, ult, soma = 0;

        x = entrada.nextInt();
        y = entrada.nextInt();

        if (x > y) {
            prim = y;
            ult = x;
        }
        else {
            prim = x;
            ult = y;
        }

        int cont = prim + 1;
        for (int i = 1; i < (ult - prim); i++) {
            if (cont % 2 != 0 && cont != ult) {
                soma += cont;
            }
            cont++;
        }

        System.out.println(soma);
    }
}
