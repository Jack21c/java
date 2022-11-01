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

public class SortE {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		Student[] c = new Student[n];
		for(int j = 0; j < n; j++) {
			String s1 = in.next();
			int p1 = in.nextInt();
			c[j] = new Student(s1, p1);
		}
		Arrays.sort(c);
		for(int j = 0; j < n; j++) 
			c[j].print();
	}
}
class Student implements Comparable <Student> {
	public int point;
	public String name;
	public Student(String s, int i) {
		name = s;
		point = i;
	}

	public Student() {
	}
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.point > o.point) return 1;
		else return -1;
	}
	
	public void print() {
		System.out.println(name);
	}

}