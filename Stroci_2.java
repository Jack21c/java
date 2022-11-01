import java.util.*;

public class Stroci_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		String s = in.next();
		int k = s.codePointCount(0, 0);
		//String s2 = Stroci_2.RegChange(k);
		char c2 = s.charAt(0);
		System.out.print(k);
		
	}

	/* static String RegChange(int c){
		 
	     return(c >= '0' && c <= '9');
	 }*/
}
