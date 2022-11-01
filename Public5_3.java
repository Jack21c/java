import java.util.*;
public class Public{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int n = in.nextInt();
	int[] k;
	k = new int[n];
	for(int i = 0; i < n; i++)
	{
	    k[i] = i*n + i + 1;
	}
	for(int i = 0; i < n-1; i++)
	{
	    System.out.print(k[i] + );
	    k[i] = i*n + i + 1;
	}
	
	int[][] a;
	a = new int[n][n];
	int d = 1;
	int[][] b;
	b = new int[n][n];
	int[][] p;
	p = new int[n][n];
	int[][] c;
	c = new int[n][n];
	for(int i = 0; i < n; i++)
	{
	    for(int j = 0; j < n; j++)
	    {
	        a[i][j] = d;
	        b[j][i] = d;
	        c[i][j] = 0;
	        if(i == j)
	        {
	            c[i][j] = 1;
	        }
	        d++;
	    }
	}
	for(int i = 0; i < n; i++)
	{
	    for(int j = 0; j < n; j++)
	    {
	        if(c[i][j] == 1)
	        {
	            System.out.print(a[i][j]);
	        }
	    }
	}
   }
 }