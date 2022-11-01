import java.math.*;
import java.util.Scanner;

public class WPB {
 static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = 10;
  String a = in.next();
  int k = 2;
  if(a.indexOf('.') == -1) {
	  int c = 0;
	  for(int i = a.length()-1; i>=0; i--)
	  {
	   c+=getNum(a.charAt(i))*Pow(a.length()-i-1, n);
	  }
	  String out = "";
	  while(c!=0)
	  {
	   out=getChar(c%k)+out;
	   c=(c)/k;
	  }
	  System.out.println(out);
	 }else {
		  int t = a.indexOf('.');
		  int cdo = 0;
		  int cpo = 0;
		  double c = Double.parseDouble(a);
		  boolean tchk = false;
		  //int i = -(a.length()-1-t);
		  //for(;a.charAt(-i+t) != '.'; i++)
		  //{
			//  double ch = getNum(a.charAt(-i+t))*PowMinusD(i, n);
		//	  System.out.print(ch);
		//	  if(ch!=0)
			//	  c+= ch;
		  //}
		  //BigDecimal cbd = new BigDecimal(0);
		  double res =  0;
		  for(int u = -1; new BigDecimal(res).scale() < 32 && c > 0; u--) {
			  if(c - PowMinusD(u, k) > 0)
				  res += PowMinusD(u, 1);
		  }
		  //while()
		  //bigDecemial.scale()
		  
		  for(int j = t-1; j>=0; j--)
		  {
			  cdo+=getNum(a.charAt(j))*Pow(t-j-1, n);
		  }
		  String outdo = "";
		  String outpo = "";
		  while(cdo!=0)
		  {
			  outdo=getChar(cdo%k)+outdo;
		      cdo=(cdo)/k;
		  }
		  System.out.println(c);
		  if(!outdo.isEmpty())
			  c += Double.parseDouble(outdo);
		  //c += Double.parseDouble(outdo);
		  System.out.print(c);
	 }
  
 }
 
 static char getChar(int num)
 {
  return alphabet.charAt(num);
 }

 static int getNum(char c)
 {
  return alphabet.indexOf(c);
 }
 
 static int Pow(int p, int n)
 {
  if(p==0)
   return 1;
  else
   return n*Pow(p-1, n);
  }
 //static BigDecimal PowMinusBD(int p, int n)
 //{
	//  if(p==0)
	//   return new BigDecimal(1);
	//  else
	//   return new BigDecimal(PowMinusBD(p+1, n)/n);
	//  
	// }
 static double PowMinusD(int p, int n)
 {
	  if(p==0)
	   return 1;
	  else {
		  double res = PowMinusD(p+1, n)/n;
		  return res;
	  }
	  
	 }
 
}