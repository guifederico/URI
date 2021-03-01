import java.util.Scanner;

public class URI1124 {
    public static class Cilindro {
        private int raio;

        public int getRaio() {
            return raio;
        }

        public void setRaio(int raio) {
            this.raio = raio;
        }

        public Cilindro() {
            raio = 0;
        }
    }

    public static class Elevador {
        private int largura;
        private int comprimento;

        public int getLargura() {
            return largura;
        }

        public void setLargura(int largura) {
            this.largura = largura;
        }

        public int getComprimento() {
            return comprimento;
        }

        public void setComprimento(int comprimento) {
            this.comprimento = comprimento;
        }

        public Elevador() {
            largura = 0;
            comprimento = 0;
        }

        public void cabe(Cilindro cilindro1, Cilindro cilindro2) {
            int somar = (cilindro1.getRaio() * 2) + (cilindro2.getRaio() * 2);
            if (somar <= this.largura || somar <= this.comprimento) {
                System.out.println("S");
            }
            else {
                System.out.println("N");
            }
        }
    }
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        Cilindro cilindro1 = new Cilindro();
        Cilindro cilindro2 = new Cilindro();
        boolean control = true;

        Scanner dado = new Scanner(System.in);
        elevador.setLargura(dado.nextInt());
        elevador.setComprimento(dado.nextInt());
        cilindro1.setRaio(dado.nextInt());
        cilindro2.setRaio(dado.nextInt());

        elevador.cabe(cilindro1, cilindro2);


    }
}
