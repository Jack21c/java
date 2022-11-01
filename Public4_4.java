import java.util.*;
public class Public4_4{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	int d = in.nextInt();
	int[] m;
	m = new int[100000];
	int[] p;
	p = new int[100000];
	int k = 0;
	for(int i = 10000; i < 100000; i++)
	{
	    m[i - 10000] = i;
	    p[i - 10000] = 0;
	    if(i%a == b && i%c == d)
	    {
	        p[i - 10000] = 1;
	        k = 1;
	    }
	}
	for(int i = 0; i < 90000; i++)
	{
	    if(p[i + 10000] == 1)
	    {
	        System.out.print(m[i + 10000] + " ");
	    }
	}
	if(k == 0)
	{
	    System.out.print("-1");
	}
   }
 }