import java.util.*;
public class Public{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int n = in.nextInt();
	int h= (n/3600)%24;
	int m= (n - h*3600)/60;
	int s = n%60;
	if(m<10)
	{
	    int m1 = 0;
	    if(s<10)
	    {
	        int s1 = 0;
	        System.out.print(h + ":" + m1 + m + ":" + s1 + s);
	    }
	    else
	    {
	        System.out.print(h + ":" + m1 + m + ":" + s);
	    }
	}
	else
	{
	    if(s<10)
	    {
	      int s1 = 0;
	       System.out.print(h + ":" + m + ":" + s1 + s);
	    }
	    else
	    {
	        System.out.print(h + ":" + m + ":" + s);
	    }
	    
	}
  }
 }