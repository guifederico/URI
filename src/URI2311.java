import java.util.Scanner;

public class URI2311 {
    public static class Saltador {
        String nome;
        double grau;
        double notas[] = new double[7];
        double nf;
        double maior;
        double menor;

        public double getNf() {
            return nf;
        }

        public void setNf(int nf) {
            this.nf = nf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getGrau() {
            return grau;
        }

        public void setGrau(double grau) {
            this.grau = grau;
        }

        public double[] getNotas() {
            return notas;
        }

        public void setNotas(double[] notas) {
            this.notas = notas;
        }

        public Saltador() {
            grau = 0;
            nf = 0;
            maior = 0;
            menor = 0;
        }

        public void calculaNota(String[] notas) {
            double v[] = new double[7];

            for (int i = 0; i < 7; i ++) {
                v[i] = Double.parseDouble(notas[i]);
            }

            for (int i = 0; i < 7; i++) {
                this.nf = this.nf + v[i];
                if (v[i] > maior) {
                    maior = v[i];
                }
                else if (v[i] < menor) {
                    menor = v[i];
                }

                this.nf = (this.nf - maior - menor) * this.grau;
            }
        }
    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int competidores = dado.nextInt();

        for (int i = 0; i < competidores; i++) {
            Saltador salt = new Saltador();
            dado.nextLine();
            salt.setNome(dado.nextLine());
            salt.setGrau(dado.nextDouble());
            dado.nextLine();
            String[] notas = dado.nextLine().split(" ");

            salt.calculaNota(notas);
            System.out.println(salt.getNome() + " " + salt.getNf());
        }
    }
}
