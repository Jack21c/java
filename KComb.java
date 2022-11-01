import java.util.Scanner;

public class KComb {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ca = a<<2;
        int cb = b>>4;
        int c = ca+cb;
        System.out.print(DelStar(c, 5));
    }
    static int DelStar(int a, int k) {
        int c = 1<<k;
        int a1 = a;
        int a2 = a;
        for(int i = k; a>>i > 0; i++) {
            c = 1<<i;
            a = a|c;
            a = a^c;
        }
        return a;
    }
}
