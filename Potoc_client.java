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

class Client
{
	String s;
	void getMessage()
	{
		Scanner in =new Scanner(System.in);
		String m = in.nextLine();
		s = m;
	}
	String get_s()
	{
		return s;
	}
	
}



public class Potoc_client {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		Client client = new Client();
		Socket socket = new Socket("localhost", 1234);
		OutputStream out = socket.getOutputStream();
		PrintWriter printwriter = new PrintWriter(out, true);
		while(true)
		{
			client.getMessage();
			printwriter.println(client.get_s());
			Thread.sleep(5000);
		}
		
		
    }
}