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

public class Sererok2 {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		ServerSocket ss = new ServerSocket(1234);
		//Socket socket = new Socket(ipaddress, 1234);
		Socket s1 = new Socket();
		InputStream in1 = s1.getInputStream();
		//Scanner scanner = in1.read()
		//in1 = s1.getInputStream();
		
		while(in1.read() != -1)
		{
			String string = in.nextLine();
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