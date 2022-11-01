import java.util.*;
public class Public3_5{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int c1 = in.nextInt();
	int c2 = in.nextInt();
	int c3 = in.nextInt();
	int[] a;
	a = new int[3];
	a[2] = c1;
	int i3 = 1;
	if(c2 >= a[2])
	{
	    a[2] = c2;
	    i3 = 2;
	}
	if(c3 >= a[2])
	{
	    a[2] = c3;
	    i3 = 3;
	}
	int i2 = 0;
	int i1 = 0;
	if(i3 == 1)
	{
	    if(c2 >= c3)
	    {
	        a[1] = c2;
	        a[0] = c3;
	        i2 = 2;
	        i1 = 3;
	    }
	    else
	    {
	        a[0] = c2;
	        a[1] = c3;
	        i1 = 2;
	        i2 = 3;
	    }
	}
	else
	{
	    if(i3 == 2)
    	{
	        if(c1 >= c3)
	        {
	            a[1] = c1;
	            a[0] = c3;
	            i2 = 1;
	            i1 = 3;
	        }
	        else
	        {
	            a[0] = c1;
	            a[1] = c3;
    	        i1 = 1;
	            i2 = 3;
	        }
	    }
	    else
	    {
	        if(c1 >= c2)
	        {
	            a[1] = c1;
	            a[0] = c2;
	            i2 = 1;
	            i1 = 2;
	        }
	        else
	        {
	            a[0] = c1;
	            a[1] = c2;
    	        i1 = 1;
	            i2 = 2;
	        }
	    }
	}
	System.out.print(a[0] + " " + a[1] + " " + a[2]);
  }
 }