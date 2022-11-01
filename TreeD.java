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


public class TreeD {
	public static void main(String[] args) throws Exception{
		String[] numbers = (new BufferedReader(new InputStreamReader(System.in))).readLine().split(" ");
		
		MyTree tree = new MyTree();
		//System.out.println("");
		for (String s : numbers) {
			int x = Integer.parseInt(s);
			if (x == 0)
				break;
			tree.addNode(x);
		}
		tree.print();
		//System.out.println(tree.secondmax);
		
		
	}
}

class MyTree{
	Node head;
	int height = 0;
	int ret = 0;
	int number = 0;
	int secondmax = 0;
	//String s;
	PrintWriter pw = new PrintWriter(System.out);
	
	MyTree(){
	}
	void addHead(int x) {
		head = new Node(x, 1);
		height = 1;
		number = 1;
	}
	Node gonext(Node cvr, int x) {
		if(cvr.data < x) {
			if(cvr.right != null) {
				cvr = cvr.right;
			}
			else {
				Node node = new Node(x, cvr.level+1);
				cvr.right = node;
				if(height < node.level)
					height = node.level;
				number++;
				ret = 1;
			}
		}
		else {
			if(cvr.data > x) {
				if(cvr.left != null) {
					cvr = cvr.left;
				}
				else {
					Node node = new Node(x, cvr.level+1);
					cvr.left = node;
					if(height < node.level)
						height = node.level;
					number++;
					ret = 1;
				}
			}
			else {
				ret = 1;
			}
			
		}
		return cvr;
	}
	void addNode(int x) {
		if(head == null) {
			head = new Node(x, 1);
			height = 1;
			number = 1;
			return;
		}
		Node cvr = head;
		while(ret == 0) {
			cvr = this.gonext(cvr, x);
			//System.out.println(cvr.data);
			
		}
			//this.gonext(cvr, x);
		if(ret != 0) {
			ret = 0;
			return;
		}
		
	}
	Node found_max() {
		Node cvr = head;
		Node max;
		while(cvr.right != null)
			cvr = cvr.right;
		max = cvr;
		return max;
	}
	void obhod_max2(Node cvr, Node max) {
		if(cvr.data > secondmax && cvr.data != max.data)
			secondmax = cvr.data;
		
		if(cvr.left == null && cvr.right == null)
			return;
		else {
			if(cvr.left != null)
				this.obhod_max2(cvr.left, max);
			if(cvr.right != null)
				this.obhod_max2(cvr.right, max);
		}
	}
	void obhod_print(Node cvr) {
		if(cvr.left != null)
			this.obhod_print(cvr.left);
		//PrintWriter pw = new PrintWriter(System.out);
		
		pw.println(cvr.data);
		if(cvr.right != null)
			this.obhod_print(cvr.right);
		
	}
	void found_second_max() {
		Node cvr = head;
		this.obhod_max2(cvr, this.found_max());
		
	}
	void print() {
		Node cvr = head;
		this.obhod_print(cvr);
		pw.close();
		
	}
	
}

class Node{
	int data;
	int level;
	Node left;
	Node right;
	Node leftpl;
	Node rightpl;
	
	Node(int x){
		data = x;
	}
	Node(int x, int l){
		data = x;
		level = l;
	}
	void setl(int l)
	{
		level = l;
	}
	
}


