import java.util.*;
public class Public3_4{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int c1 = in.nextInt();
	int c2 = in.nextInt();
	int c3 = in.nextInt();
	int m = c1;
	if(c2 > m)
	{
	    m = c2;
	}
	if(c3 > m)
	{
	    m = c3;
	}
	System.out.print(m);
  }
 }