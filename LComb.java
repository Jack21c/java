import java.util.Scanner;

public class LComb {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        while(a>0) {
            if((a&1)>0)
                c+=b;
            b<<=1;
            a>>=1;
        }System.out.print(c);
    }
}
