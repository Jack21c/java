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
import java.util.*;
import java.awt.FlowLayout;

import javax.imageio.*;

import java.io.*;


class MyThread extends JPanel implements Runnable
{

	int l = 0;
	int x = 0;
    int y = 0;
    int w = 5;
    int h = 60;
    int ball_speedx = 20;
    int ball_speedy = 20;
    int ball_x = 0;
    int ball_y = 0;
    int r = 20;
    MyThread(int x1, int y1, int w1, int h1, int ball_speedx1, int ball_speedy1, int ball_x1, int ball_y1, int r1)
    {
    	 x = x1;
         y = y1;
         w = w1;
         h = h1;
         ball_speedx = ball_speedx1;
         ball_speedy = ball_speedy1;
         ball_x = ball_x1;
         ball_y = ball_y1;
         r = r1;
    }
	public void run()
	{
		int co = 0;
		while(true)
		{
			repaint();
	    	//String st = new String(co + "");
	    	//co++;
	    	//l++;
	    	//l = l%4;
			//System.out.println(st);
			try {
				Thread.sleep(500);
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
class MyPanel extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
	MyPanel()
	{
		this.addMouseListener(this);
		
	}
	
	/*public void  mouseClicked(MouseEvent e) 
	{
		int c = 0;
		if(e.MOUSE_CLICKED == MouseEvent.BUTTON1)
		{
			if(e.getX() >= 0 && e.getX() <= 6)
			{
				
			}
		}
		
	}*/
    JFrame f = new JFrame("Eeeee");
	Container c = f.getContentPane();
    //c.setLayout(null);
	
	JButton bup;
    JButton bdown;
    int x = 100;
    int y = 0;
    int w = 5;
    int h = 60;
    int ball_speedx = 3;
    int ball_speedy = 1;
    int ball_x = 0;
    int ball_y = 0;
    int r = 10;
    int up_x = 0;
    int up_y = 0;
    int up_w = 100;
    int up_h = 60;
    int down_x = 0;
    int down_y = 0;
    int down_w = 100;
    int down_h = 60;
    int k = 1;
    Font font=new Font ("TimesRoman", Font.BOLD, 56);
    int stop =0;

	MyThread mt = new MyThread(x, y, w, h, ball_speedx, ball_speedy, ball_x, ball_y, r);
    JTextField sf = new JTextField(15);
    MyPanel(JFrame f1)
    {
    	this.addMouseListener(this);
    	this.addMouseMotionListener(this);
    	this.addKeyListener(this);
        this.f = f1;
        y = f.getHeight()/2 - h/2;
        ball_x = f.getWidth()/4;
        ball_y = f.getHeight()/4;
        new Thread(mt).start();
        //this.c = c1;
        //c = c1;
        down_y = f.getHeight() - down_h - 40;
        c.setLayout(null);
    }
    @Override
    public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == e.VK_SHIFT)
		{
			k = 2;
			System.out.println("shift");
			
		}
		if(e.getKeyCode() == e.VK_CONTROL)
		{
			k = 3;
			System.out.println("cntrl");
			
		}
		
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
    	//if(Keylistenner)
		
		
	}
	@Override
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		/*System.out.println("Pressed");
		if(e.getX() >= up_x && e.getX() <= up_x + up_w)
			{
				if(e.getY() >= up_y && e.getY() <= up_y + up_h)
				{
					y -= 10;
				}
			}
			if(e.getX() >= down_x && e.getX() <= down_x + down_w)
			{
				if(e.getY() >= down_y && e.getY() <= down_y + down_h)
				{
					y += 10;
				}
			}
		repaint();*/
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		/*if(e.MOUSE_RELEASED == MouseEvent.BUTTON1)
		{
			if(e.getX() >= bup.getX() && e.getX() <= bup.getX() + bup.getWidth())
			{
				if(e.getY() >= bup.getY() && e.getY() <= bup.getY() + bup.getHeight())
				{
					y += 10;
				}
			}
			if(e.getX() >= bdown.getX() && e.getX() <= bdown.getX() + bdown.getWidth())
			{
				if(e.getY() >= bdown.getY() && e.getY() <= bdown.getY() + bdown.getHeight())
				{
					y -= 10;
				}
			}
		}*/
		//repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getY() < y + h/2)
		{
			y -= k*10; 
		}
		if(e.getY() > y + h/2)
		{
			y += k*10; 
		}
		
	}
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        
        if(((ball_x - r <= x && (ball_y >= y && ball_y <= y + h))||ball_x - r > x) && stop == 0)
        {
        	//new Thread(mt).start();
        	Color c_body = new Color(179, 0, 0);
            gr.setColor(c_body);
            gr.fillRect(x, y, w, h);
            if(ball_x + r >= f.getWidth() - 10 || ball_x - r <= 0)
            {
            	ball_speedx *= -1;
            }
            if(ball_y + 2*r >= f.getHeight()- 20 || ball_y - r <= 0)
            {
            	ball_speedy *= -1;
            }
            if(ball_x - r <= x  && (ball_y >= y && ball_y <= y + h))
            {
            	ball_speedx *= -1;
            }
            ball_x += ball_speedx;
            ball_y += ball_speedy;
            
            Color c_ball = new Color(179, 0, 179);
            gr.setColor(c_ball);
            gr.fillOval(ball_x - r, ball_y - r, 2*r, 2*r);
            try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
        else
        {
        	stop = 1;
        	if(ball_x - r > 0)
        	{
        		Color c_body = new Color(179, 0, 0);
                gr.setColor(c_body);
                gr.fillRect(x, y, w, h);
        		if(ball_y + 2*r >= f.getHeight()- 20 || ball_y - r <= 0)
                {
                	ball_speedy *= -1;
                }
        		 ball_x += ball_speedx;
                 ball_y += ball_speedy;
                 
                 Color c_ball = new Color(179, 0, 179);
                 gr.setColor(c_ball);
                 gr.fillOval(ball_x - r, ball_y - r, 2*r, 2*r);
                 try {
     				Thread.sleep(5);
     			} catch (InterruptedException e) {
     				// TODO Auto-generated catch block
     				e.printStackTrace();
     			}
        	}
        	else
        	{
        		Color c_end = new Color(0, 250, 0);
            	this.setBackground(c_end);
            	
            	gr.setFont(font);
            	//this.
            	Color c_st = new Color(250, 0, 0);
            	gr.setColor(c_st);
            	
                gr.drawString("The end", 300, 300);
        	}
        	
        }
		repaint();
        //try
       // {
        //    image = ImageIO.read(new File("src/ball.png"));
       // }
       // gr.drawImage(image, 200, 200, ABORT);
        
    }
	//private void setFont(int bold) {
		// TODO Auto-generated method stub
	//	
	//}
	private void setFont(int bold) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
 
public class Proect_game {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame f = new JFrame("Eeeee");
        f.setSize(700, 600);
        f.setLocation(100, 100);
        
        /*JPanel groupPanel = new JPanel();
        groupPanel.add(brel);
        groupPanel.add(vv);
        groupPanel.add(mm);
        groupPanel.add(marach);
        groupPanel.add(gena);
        groupPanel.setBorder(BorderFactory.createEtchedBorder());*/
        
        //, bigField;
        //TextFieldTest tf1 = new TextFieldTest(f);
        Container c = f.getContentPane();
        c.setLayout(null);
        //b3.setBounds(220, 0, 100, 100);
        //ComboBoxTest cbt = new ComboBoxTest();
        MyPanel p = new MyPanel(f);
        p.setBounds(0, 0, f.getWidth() - 10, f.getHeight() - 10);
        c.add(p);
        //c.add(sf);
        //c.add(fr1);
        //c.add(fr2);
        //c.add(sl1);
        //c.add(sl2);
       // while(true)
        //{
        //	p.p
        //}
        /*if(p.getn() == 1)
        {
        	c.add(cb1);
        }
        else
        {
        	c.add(cb2);
        }*/
        //c.add(b1);
        //c.add(b2);
        //c.add(b3);
        //bup.addActionListener(p);
        //bdown.addActionListener(p);
        //cb1.addActionListener(p);
        //cb2.addActionListener(p);
        f.setVisible(true);
    }
 
}
 
 