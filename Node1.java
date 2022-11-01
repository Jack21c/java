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


public class Node1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> llist = new LinkedList<Integer>();
		Date ldata = new Date();
		long li0 = ldata.getTime();
		System.out.println(li0);
		for(int i = 0; i < 1000000; i++)
		{
			llist.add(llist.size(), 1);
		}
		Date ldata1 = new Date();
		long li1 = ldata1.getTime();
		llist.remove(llist.size()-1);
		Date ldata2 = new Date();
		long li2 = ldata2.getTime();
		//System.out.println(i1-i0);
		System.out.println(li1);
		System.out.println(li2);
		System.out.println(li2-li1);
		System.out.println("");
		
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		Date adata = new Date();
		long ai0 = adata.getTime();
		System.out.println(ai0);
		for(int i = 0; i < 1000000; i++)
		{
			alist.add(alist.size(), 1);
		}
		Date adata1 = new Date();
		long ai1 = adata1.getTime();
		alist.remove(alist.size()-1);
		Date adata2 = new Date();
		long ai2 = adata2.getTime();
		//System.out.println(i1-i0);
		System.out.println(ai1);
		System.out.println(ai2);
		System.out.println(ai2-ai1);
		System.out.println("");
		
		MyList list = new MyList();
		Date data = new Date();
		long i0 = data.getTime();
		System.out.println(i0);
		for(int i = 0; i < 1000000; i++)
		{
			list.addLast(1);
		}
		Date data1 = new Date();
		
		long i1 = data1.getTime();
		//list.addLast(1);
		list.remove(list.size-1);
		Date data2 = new Date();
		long i2 = data2.getTime();
		long id = i2 - i1;
		//System.out.println(i0);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i2-i1);
		//list.print();
		
		
	}
}

class MyList{
	Node head;
	int size = 0;
	MyList(){
	}
	void addFirst(int x) {
		head = new Node(x, 1);
		size = 1;
	}
	void addLast(int x) {
		if(head == null) {
			head = new Node(x, 1);
			size = 1;
			return;
		}
		Node cvr = head;
		while(cvr.next != null)
			cvr = cvr.next;
		Node node = new Node(x, cvr.number+1);
		cvr.next = node;
		node.prev = cvr;
		size++;
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
		size++;
		
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
			size++;
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
		size--;
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
		size--;
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
	
}

class Node{
	int data;
	int number;
	Node next;
	Node prev;
	Node(int x, int n){
		data = x;
		number = n;
	}
	void setn(int n)
	{
		number = n;
	}
	
}
