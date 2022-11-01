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

public class SortC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		Point[] c = new Point[n];
		for(int j = 0; j < n; j++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			c[j] = new Point(x1, y1);
		}
		Arrays.sort(c);
		for(int j = 0; j < n; j++) 
			c[j].print();
	}
}

class Point implements Comparable <Point>{
	public int x, y, l2;
	public Point(int x1, int y1) {x = x1; y = y1; l2 = x*x + y*y;}
	public Point() {}
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if(this.l2 > o.l2) return 1;
		else return -1;
	}
	public void print() {
		System.out.println(x + " " + y);
	}
}
