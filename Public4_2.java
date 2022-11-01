import java.util.*;
public class Public4_2{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int c1 = in.nextInt();
	int c2 = in.nextInt();
	int p1 = 1;
	int p2 = 1;
	if(c1 < 0)
	{
	    c1 = -c1;
	    p1 = -1;
	}
	if(c2 < 0)
	{
	    c2 = -c2;
	    p2 = -1;
	}
	int p = 0;
	for(int i = 1; i <= c2; i++)
	{
	    p += c1;
	}
	if(p1 == -1)
	{
	    p = -p;
	}
	if(p2 == -1)
	{
	    p = -p;
	}
	System.out.print(p);
  }
 }