

import java.util.*;
public class MyMain{
  
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	String s = in.next();
	char c2 = s.charAt(0);
	if(IsDigit(c2) == true)
	{
	    System.out.print("yes");
	}
	else
	{
	    System.out.print("no");
	}
	
  }
 
 static boolean IsDigit(char c){
     return(c >= '0' && c <= '9');
 }
}
