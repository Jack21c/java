import java.util.*;
public class Stroci_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			String s = in.nextLine();
			int k = 1;
			int l = s.length();
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
