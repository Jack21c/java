
import java.util.*;
public class Stroci_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			String s = in.next();
			String s1 = s;
			int l = s.length();
			char c1 = s1.charAt(0);
			char c2 = s1.charAt(l - 1);
			if(c1 != '\u0020' && c2 != '\u0020')
			{
				s1 = " " + s + " ";
			}
			else
			{
				if(c1 != '\u0020' && c2 == '\u0020')
				{
					s1 = " " + s;
				}
				if(c1 == '\u0020' && c2 != '\u0020')
				{
					s1 = s + " ";
				}
			}
			int k = 0;
			int p1 = 0;
			int p2 = 0;
			int p = 0;
			int l1 = s1.length();
			for(int i = 0; i < l1; i++)
			{
				char c = s1.charAt(i);
				if(c == '\u0020' && (p2 - p1) < (i - p))
				{
					p2 = i;
					p1 = p;
				}
				if(c == '\u0020')
				{
					k++;
					p = i;
				}
			}
			int d = p2 - p1 - 1;
			for(int i = p1 + 1; i < p2; i++)
			{
				System.out.print(s1.charAt(i));
			}
			System.out.println("");
			System.out.print(d);
		}
}
