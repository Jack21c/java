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

class Send implements Runnable
{
	String s;
	PrintWriter pw;
	Client c;
	Send(PrintWriter printwriter, Client client)
	{
		pw = printwriter;
		c = client;
	}
	void set_s(String m)
	{
		s = m;
	}
	public void run()
	{
		while(true)
		{
			c.getMessage();
			pw.println(c.get_s());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class MyPanel extends JPanel implements ActionListener
{
	JFrame f = new JFrame("Eeeee");
    f.setSize(1400, 900);
    f.setLocation(100, 100);
    
    JTextField sf = new JTextField(15);
    JButton b1;
    MyPanel(JButton b11)
    {
        this.b1 = b11;
    }
    int ok, nn, sun;
    int co = 0;
    public void actionPerformed(ActionEvent e)
    {
    	co++;
    	String st = new String(co + "");
    	//str = new
    	b1.setText(st);
        
        repaint();
    }
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        
        
    }
}
 

public class Clientx2 {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String ipaddress = in.nextLine();
		Client client = new Client();
		Socket socket = new Socket(ipaddress, 1234);
		OutputStream out = socket.getOutputStream();
		PrintWriter printwriter = new PrintWriter(out, true);
		Send send = new Send(printwriter, client);
		new Thread(send).start();
		
		
    }
}