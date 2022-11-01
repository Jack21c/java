import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.awt.FlowLayout;

import javax.imageio.*;

import java.io.*;





class Server0 {

	Server0() throws IOException {
        // TODO Auto-generated method stub

		System.out.println("waiting...");
		ServerSocket ss = new ServerSocket(1234);
		Socket s = ss.accept();
		InputStream in = s.getInputStream();
		Scanner scanner = new Scanner (in);
		OutputStream out = s.getOutputStream();
		PrintWriter printwriter = new PrintWriter(out, true);
		Player player_s = new Player(1);
		
		
		while(true)
		{
			int x = player_s.getp_x();
			int y = player_s.getp_y();
			int w = player_s.getp_w();
			int h = player_s.getp_h();
			int stop = player_s.getp_stop();
			printwriter.println(x);
			printwriter.println(y);
			printwriter.println(w);
			printwriter.println(h);
			printwriter.println(stop);
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int w2 = scanner.nextInt();
			int h2 = scanner.nextInt();
			int stop2 = scanner.nextInt();
			player_s.setpAnother(x2, y2, w2, h2, stop2);
			
			
			
		}
		//Socket socket = ss.accept();
		//InputStream in = socket.getInputStream();
		//Scanner scanner = new Scanner (in);
		//Print print = new Print(ss);
		//new Thread(print).start();
		
    }
}
 
 class Client0 {
	Client0() throws IOException {
        // TODO Auto-generated method stub
		
		Socket socket = new Socket("localhost", 1234);
		InputStream in = socket.getInputStream();
		Scanner scanner = new Scanner (in);
		OutputStream out = socket.getOutputStream();
		PrintWriter printwriter = new PrintWriter(out, true);
		Player player_c = new Player(2);
		player_c.play();
		while(true)
		{
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			int w2 = scanner.nextInt();
			int h2 = scanner.nextInt();
			int stop2 = scanner.nextInt();
			player_c.setpAnother(x2, y2, w2, h2, stop2);
			int x = player_c.getp_x();
			int y = player_c.getp_y();
			int w = player_c.getp_w();
			int h = player_c.getp_h();
			int stop = player_c.getp_stop();
			printwriter.println(x);
			printwriter.println(y);
			printwriter.println(w);
			printwriter.println(h);
			printwriter.println(stop);
			
			
			
		}
		//Socket socket = ss.accept();
		//InputStream in = socket.getInputStream();
		//Scanner scanner = new Scanner (in);
		//Print print = new Print(ss);
		//new Thread(print).start();
		
    }

}

public class Proect_game1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		int number = in.nextInt();
		if(number == 1)
		{
			Server0 server = new Server0();
		}
		else
		{
			Client0 client = new Client0();
		}
	}

}
