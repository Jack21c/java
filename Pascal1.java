import java.math.*;
import java.lang.Integer;
import java.util.*;
class Pascal1{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	//BigInteger n= new BigInteger("5");
	//BigInteger ma= new BigInteger("0");
	int ma = 0;
	int n = in.nextInt();
	//BigInteger[] m;
	//BigInteger m = new BigInteger[2^n];
	for(int i = 0; i =< n; i++)
	{
		int k = 1;
		for(int j = 1; j<=n; j++)
		{
			k *= j;
		}
		int e = 1;
		for(int j = 1; j<=i; j++)
		{
			e *= j;
		}
		int q = 1;
		for(int j = 1; j<=n-i; j++)
		{
			q *= j;
		}
		int y = 1;
		if(i == 0 || i == n)
		{
			y = 1;
		}
		else
		{
			y = k/(e*q);
		}
		if( y > ma)
		{
			ma = y;
		}
	}
	//BigInteger l= new BigInteger("0");
	int l = (new Integer(ma)).toString().length() + 2;
	//int l1 = l.intValue();
	//BigInteger koll= new BigInteger("0");
	int koll = 2*n - 1;
	//BigInteger plus= new BigInteger("0");
	int plus = 0;
	if(n%2 == 0)
	{
		plus = 1;
	}
	//BigInteger i= new BigInteger("1");
	//BigInteger j= new BigInteger("1")
	for(int i = 0; i<=n; i++)
	{
		for(int j = 1; j <= n-i; j++)
		{
			for(int g = 1; g<=l; g++)
			{
				System.out.print(" ");
			}
		}
		int count = n-i + 1;
		for(int r = 0; r <= i; r++)
		{
			//int y = (j-(n-i+1))/2;
			int v = 1;
			for(int w =  1; w<= (i); w++)
			{
				v *= w;
			}
			int u = 1;
			for(int w =  1; w<=r; w++)
			{
				u *= w;
			}
			int q = 1;
			for(int w =  1; w<=i-r; w++)
			{
				q *= w;
			}
			int x = 1;
			if(r == 0 || r == i)
			{
				x = 1;
			}
			else
			{
				if(u != 0)
				{
					x = v/(u*q);
				}
			}
			int lx = (new Integer(x)).toString().length();
			int f = l - lx;
			if(f%2 == 0)
			{
				for(int g = 1; g<=(f/2); g++)
				{
					System.out.print(" ");
				}
				System.out.print(x);
				for(int g = 1; g<=(f/2); g++)
				{
					System.out.print(" ");
				}
			}
			else
			{
				for(int g = 1; g<=(f/2); g++)
				{
					System.out.print(" ");
				}
				System.out.print(x);
				int h = l - lx - (f/2);
				for(int g = 1; g<=h; g++)
				{
					System.out.print(" ");
				}
			}
			for(int g = 1; g<=l; g++)
			{
				System.out.print(" ");
			}
		}
		for(int j = n+i+1; j <= koll; j++)
		{
			for(int g = 1; g<=l; g++)
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
  }
 }