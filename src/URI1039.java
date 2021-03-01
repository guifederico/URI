import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class URI1039 {
    public static class Circulo {
        private int r;
        private int cordx;
        private int cordy;

        public Circulo() {
            r = 0;
            cordx = 0;
            cordy = 0;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int getCordx() {
            return cordx;
        }

        public void setCordx(int cordx) {
            this.cordx = cordx;
        }

        public int getCordy() {
            return cordy;
        }

        public void setCordy(int cordy) {
            this.cordy = cordy;
        }

        public void cabe(Circulo cacador, Circulo flor) {
            int cacsomarx = cacador.getR() + cacador.getCordx();
            int cacsomary = cacador.getR() + cacador.getCordy();
            int florsomarx = flor.getR() + flor.getCordx();
            int florsomary = flor.getR() + flor.getCordy();

            if (cacsomarx > florsomarx && cacsomary > florsomary) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);

        Circulo cacador = new Circulo();
        Circulo flor = new Circulo();

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while(in.ready()) {
            String str = in.readLine();
            String v[] = str.split(" ");

            cacador.setR(Integer.parseInt(v[0]));
            cacador.setCordx(Integer.parseInt(v[1]));
            cacador.setCordy(Integer.parseInt(v[2]));

            flor.setR(Integer.parseInt(v[3]));
            flor.setCordx(Integer.parseInt(v[4]));
            flor.setCordy(Integer.parseInt(v[5]));

            cacador.cabe(cacador, flor);

        }

    }
}
