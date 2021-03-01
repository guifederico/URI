import java.util.Scanner;

public class URI1961 {
    public static class Sapo {
        private int pulo;

        public Sapo() {
            pulo = 0;
        }

        public int getPulo() {
            return pulo;
        }

        public int setPulo(int pulo) {
            this.pulo = pulo;
            return pulo;
        }

        public void pular(int canos, int p, String[] alturas) {
            int prox;
            int ant;
            int teste;
            int fimdejogo = 0;

            Cano c[] = new Cano[canos];

            for (int i = 0; i < canos; i++) {
                c[i] = new Cano();
                c[i].setAltura(Integer.parseInt(alturas[i]));
            }

            ant = c[0].getAltura();

            for (int i = 1; i < canos; i++) {

                prox = c[i].getAltura();
                teste = prox - ant;
                if (teste > p) {
                    fimdejogo = 1;
                }
                ant = prox;
            }

            if (fimdejogo == 0) {
                System.out.println("YOU WIN");
            }
            else {
                System.out.println("GAME OVER");
            }
        }
    }

    public static class Cano {
        private int altura;

        public Cano() {
            altura = 0;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
    }

    public static void main(String[] args) {
        Sapo s = new Sapo();

        Scanner dado = new Scanner(System.in);

        int p = s.setPulo(dado.nextInt());
        int canos = Integer.parseInt(dado.nextLine().trim());
        String[] alturas = dado.nextLine().split(" ");

        s.pular(canos, p, alturas);

    }
}