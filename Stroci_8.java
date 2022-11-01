import java.util.Scanner;
public class Stroci_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			String s = in.nextLine();
			int k = 0;
			int l = s.length();
			for(int i = 0; i < l; i++)
			{
				char c = s.charAt(i);
				if(c == '\u0020')
				{
					k++;
				}
			}
			int n = l - k;
			char[] m;
			m = new char[n];
			int sc = 0;
			for(int i = 0; i < l; i++)
			{
				char c = s.charAt(i);
				if(c != '\u0020')
				{
					m[sc] = c;
					sc++;
					
				}
			}
			int g = 1;
			for(int i = 0; i < n; i++)
			{
				if(m[i] != m[n - i - 1])
				{
					System.out.print("no");
					g = 0;
					break;
					
				}
			}
			if(g == 1)
			{
				System.out.print("yes");
			}
		}
}
