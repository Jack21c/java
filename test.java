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

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		ArrayDeque<Integer> ad9 = new ArrayDeque<Integer>();
		ArrayDeque<Integer> ad10 = new ArrayDeque<Integer>();
		ArrayDeque<Integer> ad11 = new ArrayDeque<Integer>();
		ArrayDeque<String> ad9f = new ArrayDeque<String>();
		ArrayDeque<String> ad10f = new ArrayDeque<String>();
		ArrayDeque<String> ad11f = new ArrayDeque<String>();
		//Queue<Integer> q1 = new Queue<Integer>();
		//MyQueve Stack = new MyQueve();
		//System.out.println("");
		while(in.hasNext())
		{
			int kl = in.nextInt();
			String s = in.next();
			if(kl == 9)
			{
				ad9.addLast(kl);
				ad9f.addLast(s);
			}
			if(kl == 10)
			{
				ad10.addLast(kl);
				ad10f.addLast(s);
			}
			if(kl == 11)
			{
				ad11.addLast(kl);
				ad11f.addLast(s);
			}
			//System.out.println(s);
			
		}
		while(ad9.isEmpty() == false)
		{
			System.out.print(ad9.removeLast());
			System.out.print(" ");
			System.out.print(ad9f.removeLast());
			System.out.println(" ");
			
			
		}
		while(ad10.isEmpty() == false)
		{
			System.out.print(ad10.removeLast());
			System.out.print(" ");
			System.out.print(ad10f.removeLast());
			System.out.println(" ");
			
		}
		while(ad11.isEmpty() == false)
		{
			System.out.print(ad11.removeLast());
			System.out.print(" ");
			System.out.print(ad11f.removeLast());
			
		}
		
		
		
	}

}




