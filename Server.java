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

public class Server {

	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		
		ServerSocket ss = new ServerSocket(1234);
		Socket s = ss.accept();
		Player player = new Player(s, 1);
		player.play();
		//Socket socket = ss.accept();
		//InputStream in = socket.getInputStream();
		//Scanner scanner = new Scanner (in);
		//Print print = new Print(ss);
		//new Thread(print).start();
		
    }
}
