public class Slide2 {
    public static int f(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return f(b, a % b);
        }
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        System.out.println(f(a,b));

    }
}
