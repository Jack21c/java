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



public class SortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		Olympiader[] ol = new Olympiader[n];
		for(int j = 0; j < n; j++) {
			int i = in.nextInt();
			int p = in.nextInt();
			ol[j] = new Olympiader(i, p);
		}
		Arrays.sort(ol);
		for(int j = 0; j < n; j++) 
			ol[j].print();
	}
}
class Olympiader implements Comparable <Olympiader>{
	public int inumber, point;
	public Olympiader(int in, int p) {inumber = in; point = p;}
	public Olympiader() {inumber = 0; point = 0;}
	public int compareTo(Olympiader o) {
		// TODO Auto-generated method stub
		if(this.point > o.point) return 1;
		if(this.point < o.point) return -1;
		if(this.inumber > o.inumber) return 1;
		if(this.inumber < o.inumber) return -1;
		return 0;
	}
	public void print() {
		System.out.println(inumber + " " + point);
	}
}
class MyCompInt implements Comparator <Integer>{
	public int compare(Integer a, Integer b) {
		if(a<b)return 1;
		else return -1;
	}
}