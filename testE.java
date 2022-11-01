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

public class testE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		ArrayDeque<Integer> b = new ArrayDeque<Integer>();
		int n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			String s = in.next();
			if(s.equals("-"))
			{
				int k = a.removeFirst();
				System.out.println(k);
				if((a.size() + b.size())%2 == 1)
				{
					int u = b.removeFirst();
					a.addLast(u);
				}
			}
			else {
				int c = in.nextInt();
				if(s.equals("*")) {
					if((a.size() + b.size())%2 == 0) {
						a.addLast(c);
					}
					else {
						if((a.size() + b.size())%2 == 1) {
							b.addFirst(c);
						}
					}
				}
				if(s.equals("+")) {
					b.addLast(c);
					if((a.size() + b.size())%2 == 1)
					{
						int g = b.removeFirst();
						a.addLast(g);
					}
				}
			}
		}
		
	}

}




