import java.util.Scanner;

public class URI1589 {
    public static class Conduite {
        private int r;

        public Conduite() {
            r = 0;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int rTotal(int x, int y) {
            int r1 = x;
            int r2 = y;
            return r1 + r2;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Conduite c1 = new Conduite();
        Conduite c2 = new Conduite();
        Conduite c3 = new Conduite();

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
           c1.setR(entrada.nextInt());
           c2.setR(entrada.nextInt());

           System.out.println(c3.rTotal(c1.getR(), c2.getR()));
        }
    }
}


