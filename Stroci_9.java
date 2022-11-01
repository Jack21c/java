import java.util.*;
public class Stroci_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in =new Scanner(System.in);
			String s = in.next();
			int k = in.nextInt();
			int l = s.length();
			int n = 26;
			char[] m;
			m = new char[n];
			m[0] = 'A';
			m[1] = 'B';
			m[2] = 'C';
			m[3] = 'D';
			m[4] = 'E';
			m[5] = 'F';
			m[6] = 'G';
			m[7] = 'H';
			m[8] = 'I';
			m[9] = 'J';
			m[10] = 'K';
			m[11] = 'L';
			m[12] = 'M';
			m[13] = 'N';
			m[14] = 'O';
			m[15] = 'P';
			m[16] = 'Q';
			m[17] = 'R';
			m[18] = 'S';
			m[19] = 'T';
			m[20] = 'U';
			m[21] = 'V';
			m[22] = 'W';
			m[23] = 'X';
			m[24] = 'Y';
			m[25] = 'Z';
			char[] e;
			e = new char[l];
			int sc = 0;
			for(int i = 0; i < l; i++)
			{
				int p = 0;
				char c = s.charAt(i);
				for(int j = 0; j < n; j++)
				{
					if(c == m[j])
					{
						p = j;
						break;
					}
				}
				int r = p - k;
				if(r < 0)
				{
					r = 26 + r;
				}
				e[i] = m[r];
			}
			int g = 1;
			for(int i = 0; i < l; i++)
			{
				System.out.print(e[i]);
			}
		}
}
