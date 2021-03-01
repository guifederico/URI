import java.util.Scanner;

public class URI2708 {

    public static class Jeep {
        private int pass;

        public Jeep() {
            pass = 0;
        }

        public int getPass() {
            return pass;
        }

        public void setPass(int pass) {
            this.pass = pass;
        }
    }

    public static class Parque {
        private int visit;
        private int jipe;

        public Parque() {
            visit = 0;
            jipe = 0;
        }

        public int getJipe() {
            return jipe;
        }

        public void setJipe(int jipe) {
            this.jipe += jipe;
        }

        public int getVisit() {
            return visit;
        }

        public void setVisit(int visit) {
            this.visit += visit;
        }

    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Jeep jipe = new Jeep();
        Parque park = new Parque();
        boolean control = true;

        while (control) {
            String tipo = dado.next();

            if (tipo.equals("ABEND")) {
                break;
            }

            int quantia = dado.nextInt();

            if (tipo.equals("SALIDA")) {
                jipe.setPass(quantia);
                park.setJipe(1);
                park.setVisit(quantia);
                jipe.setPass(0);
            }

            if (tipo.equals("VUELTA")) {
                jipe.setPass(quantia);
                park.setJipe(-1);
                park.setVisit((quantia) * (-1));
            }

        }
        System.out.println(park.getVisit());
        System.out.println(park.getJipe());

    }
}
