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

class Server
{
	String s;
	void getMessage(String s1)
	{
		s = s1;
	}
	
	
}

class MyThread implements Runnable
{
	
	public void run()
	{
		
		while(true)
		{
			
			System.out.print("[");
			
			System.out.print("Hello");
			
			System.out.println("]");
			
	    	
			
		}
	}
}


class Print implements Runnable
{
	String s;
	PrintWriter pw;
	ServerSocket ss;
	Socket socket;
	InputStream in;
	Print(ServerSocket socket1)
	{
		ss = socket1;
	}
	public void run()
	{

		try {
			socket = ss.accept();
			in = socket.getInputStream();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scanner = new Scanner (in);
		while(true)
		{
			//synchronized(Serverx)
			//{
			//	int s = 5000;
			//	bank.put(-1 * s);
			//	bank.put(s);
			//	System.out.println(bank.account);
			//}
			String m = scanner.nextLine();
			System.out.println("Client -> Server: ");
			System.out.println(m);
		}
	}
}


public class Sererok {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		ServerSocket ss = new ServerSocket(80);
		//Socket socket = new Socket(ipaddress, 1234);
		Socket socket = ss.accept();
		OutputStream out = socket.getOutputStream();
		while(true)
		{
			String s = in.nextLine();
			PrintWriter pw = new PrintWriter(out, true);
			pw.println(s);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//out.
		//InputStream in = socket.getInputStream();
		//Scanner scanner = new Scanner (in);
		//Print print = new Print(ss);
		//new Thread(print).start();
		
    }
}