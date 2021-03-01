import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int grenal, inter = 0, grem = 0;

        inter = dado.nextInt();
        grem = dado.nextInt();
        System.out.printf("Novo grenal (1-sim 2-nao)\n");
        int control = dado.nextInt();
        int Inter = 0;
        int Gremio = 0;
        int Empate = 0;
        int partidas = 1;

        if (inter > grem) {
            Inter++;
        }
        if (inter < grem) {
            Gremio++;
        }
        if (inter == grem) {
            Empate++;
        }

        while (control == 1) {
            inter = dado.nextInt();
            grem = dado.nextInt();
            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            control = dado.nextInt();

            if (inter > grem) {
                Inter++;
                partidas++;
            }
            if (inter < grem) {
                Gremio++;
                partidas++;
            }
            if (inter == grem) {
                Empate++;
                partidas++;
            }
        }

        System.out.printf("%d grenais\n", partidas);
        System.out.printf("Inter:%d\n", Inter);
        System.out.printf("Gremio:%d\n", Gremio);
        System.out.printf("Empates:%d\n", Empate);
        if (Inter > Gremio) {
            System.out.printf("Inter venceu mais\n");
        }
        if (Inter < Gremio) {
            System.out.printf("Gremio venceu mais\n");
        }
        if (Inter == Gremio) {
            System.out.printf("Nao houve vencedor\n");
        }
    }
}
