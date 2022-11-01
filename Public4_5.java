import java.util.*;
import java.math.*;
public class Public4_5{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	String s = in.next();
	BigInteger c2 = new BigInteger(s);
    int k = s.length();
    String str = Integer.toString(k);
	BigInteger c = new BigInteger(str);
    BigInteger sum = new BigInteger("0");
    BigInteger l = new BigInteger("10");
	BigInteger g = new BigInteger("1");
    for(int i = 1; i <= k; i++)
    {
        sum = sum.add(c2.subtract(c2.divide(l.pow(i)).multiply(l.pow(i)).divide(l.pow(i-1))));
    }
    System.out.print(sum);
   }
 }