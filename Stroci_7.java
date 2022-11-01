
import java.util.*;
public class Stroci_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int y = 0;
		int x = 0;
		while(in.hasNextLine())
		{
			String s = in.nextLine();
			String[] str = s.split(" ");
			int p = 1;
			int l = s.length();
			if(str[0] == "North")
			{
				y += Integer.parseInt(str[1]);
			}
			else
			{
				if(str[0] == "South")
				{
					y -= Integer.parseInt(str[1]);
				}
				else
				{
					if(str[0] == "North")
					{
						y += Integer.parseInt(str[1]);
					}
					else
					{
						if(str[0] == "East")
						{
							x += Integer.parseInt(str[1]);
						}
						else
						{
							if(str[0] == "West")
							{
								x -= Integer.parseInt(str[1]);
							}
						}
					}
				}
			}
		}
		System.out.println(x + " " + y);
	}

}
