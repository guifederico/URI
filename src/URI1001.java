import java.io.IOException;
import java.util.Scanner;

public class URI1001 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner dado;
        dado = new Scanner(System.in);
        int a, b, soma;

        a = dado.nextInt();
        b = dado.nextInt();

        soma = a + b;

        System.out.println("X = " + soma);
    }
 
}