import java.util.Scanner;

public class URI3042 {
    public static class PapaiNoel {
        int posicaoAtual[] = new int[3];
        int toques;

        public int[] getPosicaoAtual() {
            return posicaoAtual;
        }

        public void setPosicaoAtual(int[] posicaoAtual) {
            this.posicaoAtual = posicaoAtual;
        }

        public int getToques() {
            return toques;
        }

        public void setToques(int toques) {
            this.toques += toques;
        }

        public PapaiNoel () {
            posicaoAtual[0] = 0;
            posicaoAtual[1] = 1;
            posicaoAtual[2] = 0;
            toques = 0;
        }

        public int run(String[] arvores) {
            int[] v = new int[3];
            int auxt = 0;

            for (int i = 0; i < arvores.length; i++) {
                v[i] = Integer.parseInt(arvores[i]);
            }

            if (v[0] == 1 && v[1] == 1 && v[2] == 0) {
                if (this.posicaoAtual[0] == 1) {
                    auxt = auxt + 2;
                    this.posicaoAtual[0] = 0;
                    this.posicaoAtual[1] = 0;
                    this.posicaoAtual[2] = 1;
                }

                if (this.posicaoAtual[1] == 1) {
                    auxt = auxt + 1;
                    this.posicaoAtual[0] = 0;
                    this.posicaoAtual[1] = 0;
                    this.posicaoAtual[2] = 1;
                }

            }

            if (v[0] == 0 && v[1] == 1 && v[2] == 1) {
                if (this.posicaoAtual[1] == 1) {
                    auxt = auxt + 1;
                    this.posicaoAtual[0] = 1;
                    this.posicaoAtual[1] = 0;
                    this.posicaoAtual[2] = 0;
                }

                if (this.posicaoAtual[2] == 1) {
                    auxt = auxt + 2;
                    this.posicaoAtual[0] = 1;
                    this.posicaoAtual[1] = 0;
                    this.posicaoAtual[2] = 0;
                }

            }

            if (v[0] == 1 && v[1] == 0 && v[2] == 1) {
                if (this.posicaoAtual[0] == 1) {
                    auxt = auxt + 1;
                    this.posicaoAtual[0] = 0;
                    this.posicaoAtual[1] = 1;
                    this.posicaoAtual[2] = 0;
                }

                if (this.posicaoAtual[2] == 1) {
                    auxt = auxt + 1;
                    this.posicaoAtual[0] = 0;
                    this.posicaoAtual[1] = 1;
                    this.posicaoAtual[2] = 0;
                }

            }
            return auxt;
        }
    }

    public static class Trilha {
        int L;
        int C;
        int R;

        public int getL() {
            return L;
        }

        public void setL(int l) {
            L = l;
        }

        public int getC() {
            return C;
        }

        public void setC(int c) {
            C = c;
        }

        public int getR() {
            return R;
        }

        public void setR(int r) {
            R = r;
        }
    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        boolean control = true;
        PapaiNoel sc = new PapaiNoel();

        while (control) {
            int metros = dado.nextInt();
            dado.nextLine();

            if (metros == 0) {
                control = false;
            }

            for (int i = 0; i < metros; i++) {
                Trilha trilha = new Trilha();

                String[] arvores = dado.nextLine().split(" ");

                sc.setToques(sc.run(arvores));
            }

            if (metros != 0) {
                System.out.println(sc.getToques());
            }

            sc = new PapaiNoel();
        }
    }
}
