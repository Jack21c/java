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

public class QueveF {

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
		if(tail - head >= data.length)
		{
			int[] data_copy = new int[data.length+1];
			System.arraycopy(data, head%data.length, data_copy, 0, data.length - head%data.length);
			System.arraycopy(data, 0, data_copy, data.length - head%data.length, head%data.length);
			head = 0;
			tail = data.length;
			data = data_copy;
		}
		data[tail%data.length] = n;
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
			System.out.println(data[head%data.length]);
			data[head%data.length] = 0;
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
			System.out.println(data[head%data.length]);
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




