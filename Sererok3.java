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

public class Sererok3 {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		ServerSocket ss = new ServerSocket(1234);
		Socket s1 = new Socket('127.0.0.1', 1234);
		InputStream in1 = s1.getInputStream();
		//Socket socket = new Socket(ipaddress, 1234);
		//Scanner scanner = in1.read()
		//in1 = s1.getInputStream();
		
		//while(in1.read() != -1)
		//{
		//	String string = in.nextLine();
		//}
		String string = in.nextLine();
		int k = 0;
		while(string.charAt(k) != ' ')
		{
			k++;
		}
		String site = "";
		char[] ch = string.toCharArray();
		for(int i = 5; i<k; i++)
		{
			site += ch[i].toString();
		}
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