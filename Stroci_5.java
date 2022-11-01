
import java.util.*;
public class Stroci_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s = in.next();
		int p = 1;
		int l = s.length();
		for(int i = 0; i < l; i++)
		{
			char c1 = s.charAt(i);
			char c2 = s.charAt(l - i - 1);
			if(c1 != c2)
			{
				p = 0;
			}
		}
		if(p == 0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}

}
