import java.util.Scanner;

public class Sistem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int k = in.nextInt();
        int i = 0;
        int c = 0;
        for(int cn = n; cn>= 1; cn /= k) {
        	c+=(cn%k)*Math.pow(10, i++);
        }
        System.out.println(c);
	}

}
