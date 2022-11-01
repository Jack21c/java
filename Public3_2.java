import java.util.*;
public class Public3_2{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	int mes = in.nextInt();
	int data = in.nextInt();
	int[] a;
	int n = 13;
	a = new int[13];
	a[1] = 31; a[2] = 28; a[3] = 31; a[4] = 30; a[5] = 31; a[6] = 30;
	a[7] = 31; a[8] = 31; a[9] = 30; a[10] = 31; a[11] = 30; a[12] = 31;
	if(mes > 12 || mes < 1)
	{
	    System.out.print("-1");
	}
	else
	{
	    if(data > a[mes] || data < 0)
	    {
	        System.out.print("-1");
	    }
	    else
	    {
	        int i = mes + 1;
	        int s = 0;
	        for(;i <= 12;i++)
	        {
	         s += a[i];
	        }
	        s += a[mes] - data;
	        System.out.print(s);
	    }
	}
  }
 }