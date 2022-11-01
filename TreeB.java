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


public class TreeB {
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
		System.out.println(tree.number);
		
		
	}
}

class MyTree{
	Node head;
	int height = 0;
	int ret = 0;
	int number = 0;
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
