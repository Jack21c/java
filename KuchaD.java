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


public class KuchaD {
	public static void main(String[] args) throws Exception{
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] d = new int[n];
		for(int j = 0; j<n; j++) {
			d[j] = in.nextInt();
		}
		Heap h = new Heap(n, d);
		for(int j = 0; j<m; j++) {
			int y = in.nextInt();
			if(y == 1) {
				if(h.getH() == 0)
					System.out.println(-1);
				else {
					
				}
			}
			else {
				int x = in.nextInt();
				System.out.println(h.addToN(x));
			}
		}
		h.print();
		
		
	}
}

class Ints{
	public int a, b;
	public Ints(int a1, int b1){
		a = a1; b = b1;
	}
	public void print() {
		System.out.println(a + " " + b);
	}
}

class Heap{
	private int n = 0, h = 0;
	private int[] data = new int[n];
	Heap() {}
	Heap(int n1) {
		data = new int[n1];
		n = n1;
	}
	Heap(int nh, int[] d) {
		n = nh; h = nh;
		data = d;
	}
	public int getH() {
		return h;
	}
	public void setKucha(int nh, int[] d) {n = nh; h = nh; data = d;}
	public void setN(int n1) {data = new int[n1]; n = n1;}
	public void add(int x) {
		if(h == n) {
			int[] data2 = new int[n+1];
			System.arraycopy(data, 0, data2, 0, n);
			data = data2;
		}
		data[h] = x;
		h++;
		this.siftUp(h-1);
	}
	public int addToN(int x) {
		if(h == n) {
			return -1;
		}
		else {
			data[h] = x;
			h++;
			int u = this.retSiftUp(h-1);
			return u;
		}
	}
	public Ints removeMax() {
		int d0 = data[0];
		data[0] = data[h-1];
		data[h-1] = 0;
		h--;
		int i = this.retSiftDown(0) + 1;
		Ints is = new Ints(i, d0);
		return is;
	}
	public Ints removeMaxCheck() {
		if(h == 1) {
			
		}
		int d0 = data[0];
		data[0] = data[h-1];
		data[h-1] = 0;
		h--;
		int i = this.retSiftDown(0) + 1;
		Ints is = new Ints(i, d0);
		return is;
	}
	public int getMax() {
		return data[0];
	}
	public void delMax() {
		data[0] = data[h-1];
		data[h-1] = 0;
		h--;
		this.siftDown(0);
	}
	public void clean() {
		n = 0;
		data = new int[n];
	}
	void siftUp(int i) {
		int j = i;
		while((j-1)/2 >= 0 && data[(j-1)/2]<data[j])
		{
			int d = data[j];
			data[j] = data[(j-1)/2];
			data[(j-1)/2] = d;
			j = (j-1)/2;
		}
	}
	int retSiftUp(int i) {
		int j = i;
		while((j-1)/2 >= 0 && data[(j-1)/2]<data[j])
		{
			int d = data[j];
			data[j] = data[(j-1)/2];
			data[(j-1)/2] = d;
			j = (j-1)/2;
		}
		return j;
	}
	void siftDown(int j) {
		//boolean bool = true;
		int i = j;
		while(true)
		{
			if((2*i+2)<h) {
				if(data[2*i+1]<data[2*i+2]) {
					if(data[i]<data[2*i+2]) {
						int d = data[i];
						data[i] = data[2*i+2];
						data[2*i+2] = d;
						i = 2*i+2;
					}
					else
						break;
				}
				else {
					if(data[i]<data[2*i+1]) {
						int d = data[i];
						data[i] = data[2*i+1];
						data[2*i+1] = d;
						i = 2*i+1;
					}
					else
						break;
				}
			}
			else {
				if((2*i+1)<h) {
					if(data[i]<data[2*i+1]) {
						int d = data[i];
						data[i] = data[2*i+1];
						data[2*i+1] = d;
						i = 2*i+1;
					}
					else
						break;
				}
				else
					break;
			}
		}
	}
	int retSiftDown(int j) {
		//2*i+1
		int i = j;
		while(true)
		{
			if((2*i+2)<h) {
				if(data[2*i+1]<data[2*i+2]) {
					if(data[i]<data[2*i+2]) {
						int d = data[i];
						data[i] = data[2*i+2];
						data[2*i+2] = d;
						i = 2*i+2;
					}
					else
						break;
				}
				else {
					if(data[i]<data[2*i+1]) {
						int d = data[i];
						data[i] = data[2*i+1];
						data[2*i+1] = d;
						i = 2*i+1;
					}
					else
						break;
				}
			}
			else {
				if((2*i+1)<h) {
					if(data[i]<data[2*i+1]) {
						int d = data[i];
						data[i] = data[2*i+1];
						data[2*i+1] = d;
						i = 2*i+1;
					}
					else
						break;
				}
				else
					break;
			}
		}
		return i;
	}
	public int plusadd(int i, int x) {
		data[i-1] += x;
		int u = this.retSiftUp(i-1) + 1;
		return u;
	}
	public int minusadd(int i, int x) {
		data[i-1] -= x;
		int u = this.retSiftDown(i-1) + 1;
		return u;
	}
	public void print() {
		for(int i=0; i<n; i++)
			System.out.print(data[i] + " ");
	}
}



