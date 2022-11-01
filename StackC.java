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

public class StackC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		MyStack Stack = new MyStack();
		System.out.println("");
		while(true)
		{
			String s = in.next();
			//System.out.println(s);
			if(s.equals("back"))
			{
				Stack.back();
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
						Stack.sizeout();
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

//class NoElementException extends Exception{}

class MyStack{
	private int[] data = new int[100];
	private int size = 0;
	MyStack()
	{
		Arrays.fill(data, 0);
	}
	void push(int n)
	{
		if(size >= data.length)
		{
			int[] data_copy = new int[size+1];
			System.arraycopy(data, 0, data_copy, 0, size);
			data = data_copy;
		}
		data[size] = n;
		size++;
		System.out.println("ok");
	}
	void back()
	{
		if(size == 0)
		{
			//throw new NoElementException;
			System.out.println("error");
		}
		else
		{
			System.out.println(data[size-1]);
		}
	}
	void pop()
	{
		if(size == 0)
		{
			//throw new NoElementException;
			System.out.println("error");
		}
		else
		{
			System.out.println(data[size-1]);
			data[size-1] = 0;
			size--;
		}
	}
	void sizeout()
	{
		System.out.println(size);
	}
	void clear()
	{
		Arrays.fill(data, 0);
		size = 0;
		System.out.println("ok");
	}
	
	
	
	
}




