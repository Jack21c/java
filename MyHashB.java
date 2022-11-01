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


public class MyHashB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //FastScanner fs = new FastScanner(System.in);
			Scanner in =new Scanner(System.in);
			MyHash hash = new MyHash();
			//HashSet<String> hs = new HashSet<String>();
			//System.out.println(" ");
			//PrintWriter pw = new PrintWriter (System.out);
			while(in.hasNext()) {
				String g = in.next();
				if(g.equals("+")) {
					String s = in.next();
					hash.add(s);
				}
				if(g.equals("-")) {
					String s = in.next();
					hash.remove(s);
				}
				if(g.equals("?")) {
					String s = in.next();
					boolean bl = hash.contains(s);
					if(bl) System.out.println("YES");
					else System.out.println("NO");
				}
				if(g.equals("#"))
					break;
			}
		 //PrintWriter printWriter = new PrintWriter ("file.txt");
		    //printWriter.println ("hello");
		    //pw.close();   
	}
}

class MyHash{
	int length = 1000;
	ArrayList<String>[] m;
	public MyHash(){
		m = new ArrayList[length];
		for(int i = 0; i < length; i++)
			m[i] = new ArrayList<>();
	}
	public void add(String s){
		m[Math.abs(s.hashCode()%1000)].add(s);
	}
	public void remove(String s){
		int hc = Math.abs(s.hashCode()%1000);
		for(int i = 0; i < m[hc].size(); i++){
			if(m[hc].get(i).equals(s))
				m[hc].remove(i);
		}
	}
	public boolean contains(String s){
		int hc = Math.abs(s.hashCode()%1000);
		for(int i = 0; i < m[hc].size(); i++){
			if(m[hc].get(i).equals(s))
				return true;
		}
		return false;
	}
}