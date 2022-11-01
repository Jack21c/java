import java.util.*;
import java.math.*;
public class Public4_51{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	String s = in.next();
	BigInteger c2 = new BigInteger(s);
	int c3 = c2.intValue();
    int k = s.length();
    int summ = 0;
    for(int i = 1; i <= k; i++)
    {
        summ += (c3 - ((c3/(10^i))*(10^i)))/(10^(i-1));
		System.out.println(summ);
    }
    System.out.println(summ);
	System.out.print(k);
   }
 }