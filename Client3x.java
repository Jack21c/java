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
	void putInMessage(String m)
	{
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
	Container c = f.getContentPane();
    //c.setLayout(null);
	String[] s1 = {"пила", "дрель", "топор", "револьвер", "сила"};
    JComboBox cb1 = new JComboBox(s1);
    //cb1.setBounds(20, 300, 200, 30);
    String[] s2 = {"поставить 5", "погладить", "пинок", "кинуть маркер", "спрсить у Вани"};
    JComboBox cb2 = new JComboBox(s2);
    //cb2.setBounds(20, 300, 200, 30);
    ButtonGroup bgroup = new ButtonGroup();
	JButton b1;
    JButton b2;
    JButton b3;
    JRadioButton brel = new JRadioButton ("Брель", true);
    JRadioButton vv = new JRadioButton ("ВВ");
    JRadioButton mm = new JRadioButton ("ММ");
    JRadioButton marach = new JRadioButton ("Марач");
    JRadioButton gena = new JRadioButton ("Гена");
    
    JTextField sf = new JTextField(15);
    JTextField vf = new JTextField(15);
    Client client = new Client();
    
    MyPanel(JButton b11, JTextField sf1, JTextField vf1, JFrame f1, Client client1)
    {
        this.b1 = b11;
        this.sf = sf1;
        sf.setToolTipText("send");
        this.vf = vf1;
        vf.setToolTipText("view");
        
        this.f = f1;
        this.client = client1;
        //this.c = c1;
        //c = c1;
        //c.setLayout(null);
    }
    int ok, nn, sun;
    int kaz, mil, nom;
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getActionCommand().equals("Enter"))
    	{
    		vf.setText(vf.getText() + sf.getText());
    		client.putInMessage(sf.getText());
    		vf.setText(vf.getText() + "\n");
    		
    		
    	}
        repaint();
    }
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        //try
       // {
        //    image = ImageIO.read(new File("src/ball.png"));
       // }
       // gr.drawImage(image, 200, 200, ABORT);
        
    }
}

public class Client3x {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

		Client client = new Client();
		JFrame f = new JFrame("Eeeee");
	    f.setSize(800, 500);
	    f.setLocation(100, 100);
	    JTextField sf = new JTextField(15);
	    sf.setToolTipText("send");
        JTextField vf = new JTextField(15);
	    vf.setToolTipText("view");
        sf.setBounds(10, 420, 300, 30);
        vf.setBounds(10, 10, 300, 400);
        
        JButton b1 = new JButton("Enter");
        b1.setBounds(320, 420, 90, 30);
        Container c = f.getContentPane();
        c.setLayout(null);//ComboBoxTest cbt = new ComboBoxTest();
        MyPanel p = new MyPanel(b1, sf, vf, f, client);
        p.setBounds(0, 0, 800, 500);
        //c.add(p);
        c.add(b1);
        c.add(sf);
        c.add(vf);
        
        sf.addActionListener(p);
        b1.addActionListener(p);
        vf.addActionListener(p);
        f.setVisible(true);
		Scanner in =new Scanner(System.in);
		String ipaddress = in.nextLine();
		Socket socket = new Socket(ipaddress, 1234);
		OutputStream out = socket.getOutputStream();
		PrintWriter printwriter = new PrintWriter(out, true);
		Send send = new Send(printwriter, client);
		new Thread(send).start();
		
		
    }
}