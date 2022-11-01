import java.util.Scanner;

public class WithPoint {
 static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = 2;
  String a = in.next();
  int k = 10;
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
		  double c = 0;
		  boolean tchk = false;
		  int i = a.length()-1;
		  for(; i>=0 && a.charAt(i) != '.'; i--)
		  {
			  int ch = getNum(a.charAt(i))*Pow(i - t, n);
			  if(ch!=0)
				  c+= (double)1/ch;
		  }
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
 
}