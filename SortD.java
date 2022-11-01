import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javax.imageio.*;
import java.io.*;

public class SortD {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		Stroca[] c = new Stroca[100];
		int n = 0;
		for(;n < 100; n++) {
			if(in.hasNext()) {
				String s = in.nextLine();
				c[n] = new Stroca(s);
			}
			else
				break;
		}
		Stroca[] sa = new Stroca[n];
		for(int j = 0;j < n; j++) {
			sa[j] = c[j];
		}
		for(int j = 0; j < n; j++)
			Arrays.sort(sa);
		for(int j = 0; j < n; j++) 
			sa[j].print();
	}
}

class Stroca implements Comparable <Stroca>{
	public String str;
	public Stroca(String s) {str = s;}
	public Stroca() {}
	public int compareTo(Stroca o) {
		// TODO Auto-generated method stub
		String s1  = this.str + o.str;
		String s2  = o.str + this.str;
		if(s1.compareTo(s2) >= 0) return 1;
		else return -1;
	}
	public void print() {
		System.out.print(str);
	}
}
