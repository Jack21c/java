import java.util.Scanner;

public class B2 {
static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = 2;
  String a = in.next();
  int k = 16;
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