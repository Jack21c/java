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


public class Tree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		MyTree tree = new MyTree();
		//System.out.println("");
		
		int x = in.nextInt();
		while(x != 0) {
			tree.addNode(x);
			x = in.nextInt();
		}
		System.out.println(tree.height);
		
		
	}
}

class MyTree{
	Node head;
	int height = 0;
	int ret = 0;
	MyTree(){
	}
	void addHead(int x) {
		head = new Node(x, 1);
		height = 1;
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
	/*void addLast(int x) {
		if(head == null) {
			head = new Node(x, 1);
			height = 1;
			return;
		}
		Node cvr = head;
		while(cvr.next != null)
			cvr = cvr.next;
		Node node = new Node(x, cvr.number+1);
		cvr.next = node;
		node.prev = cvr;
		height++;
	}
	void add(int i, int x) {
		Node cvr = head;
		while(cvr.number != i)
			cvr = cvr.next;
		Node node = new Node(x, i);
		node.next = cvr;
		node.prev = cvr.prev;
		cvr.prev.next = node;
		cvr.prev = node;
		while(cvr.next != null) {
			cvr.setn(cvr.number+1);
			cvr = cvr.next;
		}
		cvr.setn(cvr.number+1);
		height++;
		
	}
	void add(Node node, int x)
	{
		Node cvr = node;
		Node newnode = new Node(x, cvr.number+1);
		newnode.prev = cvr;
		newnode.next = cvr.next;
		if(cvr.next != null)
			cvr.next.prev = newnode;
		cvr.next = newnode;
		if(newnode.next != null) {
			Node cur = newnode.next;
			while(cur.next != null) {
				cur.setn(cur.number+1);
				cur = cur.next;
			}
			cur.setn(cur.number+1);
			height++;
		}
		
	}
	void remove(int i)
	{
		Node cvr = head;
		while(cvr.number != i)
			cvr = cvr.next;
		cvr.next.prev = cvr.prev;
		cvr.prev.next = cvr.next;
		cvr = cvr.next;
		while(cvr.next != null) {
			cvr.setn(cvr.number-1);
			cvr = cvr.next;
		}
		cvr.setn(cvr.number-1);
		height--;
	}
	void remove(Node node) {
		node.next.prev = node.prev;
		node.prev.next = node.next;
		Node cvr = node.next;
		while(cvr.next != null) {
			cvr.setn(cvr.number-1);
			cvr = cvr.next;
		}
		cvr.setn(cvr.number-1);
		height--;
	}
	public String toString() {
		String s ="";
		Node cvr = head;
		while(cvr.next != null) {
			s += Integer.toString(cvr.data);
			cvr = cvr.next;
		}
		s += Integer.toString(cvr.data);
		return s;
	}
	void print() {
		System.out.println(this);
	}
	*/
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
