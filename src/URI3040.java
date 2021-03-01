import java.util.Scanner;

public class URI3040 {
    public static class Arvore {
        int h;
        int d;
        int g;

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public int getD() {
            return d;
        }

        public void setD(int d) {
            this.d = d;
        }

        public int getG() {
            return g;
        }

        public void setG(int g) {
            this.g = g;
        }

        public Arvore() {
            h = 0;
            d = 0;
            g = 0;
        }

        public void cabe (int h, int d, int g) {
            if ((h >= 200 && h <= 300) && d >= 50 && g > 150) {
                System.out.println("Sim");
            }
            else {
                System.out.println("Nao");
            }
        }
    }
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Arvore tree = new Arvore();
        int testes = dado.nextInt();

        for (int i = 0; i < testes; i++) {
            tree.setH(dado.nextInt());
            tree.setD(dado.nextInt());
            tree.setG(dado.nextInt());

            tree.cabe(tree.getH(), tree.getD(), tree.getG());
        }
    }
}
