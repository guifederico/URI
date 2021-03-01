import java.util.Scanner;

public class URI2221 {
    public static class Pokemon {

        private int atk;
        private int def;
        private int bonus;
        private int lvl;
        private float golpe;

        public Pokemon() {
            atk = 0;
            def = 0;
            bonus = 0;
            lvl = 0;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public int getBonus() {
            return bonus;
        }

        public void setBonus(int z, int b) {
            if (z % 2 == 0) {
                this.bonus = b;
            }
            else {
                this.bonus = 0;
            }
        }

        public int getlvl() {
            return lvl;
        }

        public void setlvl(int lvl) {
            this.lvl = lvl;
        }

        public float getGolpe() {
            return golpe;
        }

        public void setGolpe(float golpe) {
            this.golpe = golpe;
        }

        public void valorGolpe(int atk, int def, int bonus) {
            float golpe = ((atk + def) / 2) + bonus;
            this.setGolpe(golpe);
        }

        public String duelo (float x, float y) {
            String res = "";
            if (x > y) {
                res = "Dabriel";
            }
            if (y > x) {
                res = "Guarte";
            }
            if (x == y) {
                res = "Empate";
            }
            return res;
        }
    }


    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Pokemon pGuarte = new Pokemon();
        Pokemon pDabriel = new Pokemon();
        Pokemon pGanhador = new Pokemon();


        int duelos = dado.nextInt();

        for (int i = 0; i < duelos; i++) {

            int extra = dado.nextInt();

            pDabriel.setAtk(dado.nextInt());
            pDabriel.setDef(dado.nextInt());
            pDabriel.setlvl(dado.nextInt());

            pDabriel.setBonus(pDabriel.lvl, extra);

            pGuarte.setAtk(dado.nextInt());
            pGuarte.setDef(dado.nextInt());
            pGuarte.setlvl(dado.nextInt());

            pGuarte.setBonus(pGuarte.lvl, extra);

            pDabriel.valorGolpe(pDabriel.getAtk(), pDabriel.getDef(), pDabriel.getBonus());
            pGuarte.valorGolpe(pGuarte.getAtk(), pGuarte.getDef(), pGuarte.getBonus());

            System.out.println(pGanhador.duelo(pDabriel.getGolpe(), pGuarte.getGolpe()));

        }
    }
}
