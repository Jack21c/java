import java.util.Scanner;
public class Stroci_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			String s = in.nextLine();
			int l = s.length();
			while(s.indexOf("  ") != -1)
			{
				s = s.replaceAll("  ", " ");
			}
			System.out.print(s);
			/*
			char[] m;
			m = new char[l];
			int sc = 0;
			char c1 = s.charAt(0);
			char c2 = s.charAt(0);
			m[0] = c1;
			for(int i = 1; i < l; i++)
			{
				c2 = s.charAt(i);
				c1 = s.charAt(i-1);
				if(c2 == '\u0020' && c1 == '\u0020')
				{
				}
				else
				{
					m[sc] = c2;
					sc++;
				}
			}
			for(int i = 0; i < l; i++)
			{
				System.out.print(m[i]);
			}
			*/
		}
}
