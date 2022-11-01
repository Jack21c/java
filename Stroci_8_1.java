import java.util.Scanner;
public class Stroci_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			String s = in.nextline();
			while(s.indexOf("  ") != -1)
			{
				s.replaceAll("  ", " ");
			}
			String s2 = s;
			int k = 1;
			int l = s.length();
			for(int i = l - 1; i >= 0; i--)
			{
				s2[i] = s[n-i-1];
			}
			if(s.equalsIgnoreCase(s2) == true)
			{
				
			}
			for(int i = 0; i < l; i++)
			{
				if(s.charAt(i) == ' ')
				{
					k++;
				}
			}
			System.out.print(k);
		}
}
