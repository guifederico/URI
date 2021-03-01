import java.util.Scanner;

public class URI1038 {
    public static class Lanche1 {
        int cod;
        double preco;

        public Lanche1() {
            cod = 1;
            preco = 4.00;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static class Lanche2 {
        int cod;
        double preco;

        public Lanche2() {
            cod = 2;
            preco = 4.50;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static class Lanche3 {
        int cod;
        double preco;

        public Lanche3() {
            cod = 3;
            preco = 5.00;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static class Lanche4 {
        int cod;
        double preco;

        public Lanche4() {
            cod = 4;
            preco = 2.00;
        }

        public double getPreco() {
            return preco;
        }
    }

    public static class Lanche5 {
        int cod;
        double preco;

        public Lanche5() {
            cod = 5;
            preco = 1.50;
        }

        public double getPreco() {
            return preco;
        }
    }


    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int pedido = dado.nextInt();
        int quant = dado.nextInt();

        Lanche1 lanche1 = new Lanche1();
        Lanche2 lanche2 = new Lanche2();
        Lanche3 lanche3 = new Lanche3();
        Lanche4 lanche4 = new Lanche4();
        Lanche5 lanche5 = new Lanche5();

        if (pedido == 1) {
            double total = quant * lanche1.getPreco();
            System.out.printf("Total: R$ %.2f\n", total);
        }

        if (pedido == 2) {
            double total = quant * lanche2.getPreco();
            System.out.printf("Total: R$ %.2f\n", total);
        }

        if (pedido == 3) {
            double total = quant * lanche3.getPreco();
            System.out.printf("Total: R$ %.2f\n", total);
        }

        if (pedido == 4) {
            double total = quant * lanche4.getPreco();
            System.out.printf("Total: R$ %.2f\n", total);
        }

        if (pedido == 5) {
            double total = quant * lanche5.getPreco();
            System.out.printf("Total: R$ %.2f\n", total);
        }
    }
}
