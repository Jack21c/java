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

public class Queve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		MyQueve Stack = new MyQueve();
		System.out.println("");
		while(true)
		{
			String s = in.next();
			//System.out.println(s);
			if(s.equals("front"))
			{
				Stack.front();
			}
			else
			{
				if(s.equals("pop"))
				{
					Stack.pop();
				}
				else
				{
					if(s.equals("size"))
					{
						Stack.size();
					}
					else
					{
						if(s.equals("clear"))
						{
							Stack.clear();
						}
						else
						{
							if(s.equals("exit"))
							{
								System.out.println("bye");
								break;
							}
							else
							{
								int n = in.nextInt();
								Stack.push(n);
							}
						}
					}
				}
			}
		}
	}

}

class MyQueve{
	private int[] data = new int[100];
	private int tail = 0;
	private int head = 0;
	MyQueve()
	{
		Arrays.fill(data, 0);
	}
	void push(int n)
	{
		data[tail%100] = n;
		tail++;
		System.out.println("ok");
	}
	void pop()
	{
		if(tail-head == 0)
		{
			//throw new NoElementException;
			System.out.println("error");
		}
		else
		{
			System.out.println(data[head%100]);
			data[head%100] = 0;
			head++;
		}
	}
	void front()
	{
		if(tail-head == 0)
		{
			//throw new NoElementException;
			System.out.println("error");
		}
		else
		{
			System.out.println(data[head%100]);
		}
	}
	void size()
	{
		System.out.println(tail-head);
	}
	void clear()
	{
		Arrays.fill(data, 0);
		tail = 0;
		head = 0;
		System.out.println("ok");
	}
	
	
	
	
}




