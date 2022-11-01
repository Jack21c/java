import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.util.*;

import javax.imageio.*;

import java.io.*;

class MyThread extends JPanel implements Runnable
{

	int l = 0;
	public void run()
	{
		int co = 0;
		while(true)
		{
	    	String st = new String(co + "");
	    	co++;
	    	l++;
	    	if(l == 4)
	    	{
	    		l = 0;
	    	}
	    	//l = l%4;
			System.out.println(st);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	int getl()
	{
		return l;
	}
	
}

class MyPanel extends JPanel implements ActionListener
{
	MyThread mt = new MyThread();
    JButton b1;
    MyPanel()
    {
        new Thread(mt).start();
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
        Color c_head = new Color(222, 179, 0);
        gr.setColor(c_head);
        gr.fillOval(400, 200, 60, 60);
        //gr.drawString("It is the best picture", 300, 300);
        Color c_body = new Color(179, 0, 0);
        gr.setColor(c_body);
        gr.fillRect(410, 260, 40, 125);
        Color c_con = new Color(0, 0, 179);
        gr.setColor(c_con);
        gr.fillRect(410, 287, 10, 80);
        gr.fillRect(440, 287, 10, 80);
        int nPoints = 4;
        int od  = 1;
        double k2d = Math.sqrt(2);
        int k2i = (int) k2d;
        int x1 = 7;
        int x2 = 88;
        
        int[] x1Points = {412, 412 + x1, 412 + x1 - x2, 412 - x2};
        int[] x2Points = {438, 438 + x1, 438 + x1 + x2, 438 + x2};
        int[] y1Points = {382, 382 + x1, 382 + x1 + x2, 382 + x2};
        int[] y2Points = {382, 382 - x1, 382 - x1 + x2, 382 + x2};
        if(mt.getl() == 1)
        {
        	gr.fillRect(412, 382, 10, 125);
            gr.fillRect(438, 382, 10, 125);
            
        }
        if(mt.getl() == 2)
        {
        	gr.fillRect(412, 382, 10, 125);
        	gr.fillPolygon(x2Points, y2Points, nPoints);
            
        }
        if(mt.getl() == 3)
        {
        	gr.fillPolygon(x1Points, y1Points, nPoints);
            gr.fillPolygon(x2Points, y2Points, nPoints);
            
        }
        if(mt.getl() == 0)
        {
        	gr.fillPolygon(x1Points, y1Points, nPoints);
        	gr.fillRect(438, 382, 10, 125);
        	
        }
        //gr.fillRect(412, 382, 10, 125);
        //gr.fillRect(438, 382, 10, 125);
        Color c_ball = new Color(179, 0, 179);
        gr.setColor(c_ball);
        if(mt.getl() == 1)
        {

            gr.fillOval(448, 447, 60, 60);
        }
        if(mt.getl() == 2)
        {

            gr.fillOval(548, 347, 60, 60);
        }
        if(mt.getl() == 3)
        {
            gr.fillOval(648, 247, 60, 60);
            
        }
        if(mt.getl() == 0)
        {
            gr.fillOval(548, 347, 60, 60);
        	
        }
        repaint();
    }
}


public class Panel_potoc_proect1 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame f = new JFrame("Eeeee");
        f.setSize(1400, 800);
        f.setLocation(100, 100);
       
        
        MyPanel p = new MyPanel();
        Container c = f.getContentPane();
        
        
        c.add(p);
        f.setVisible(true);
    }
}