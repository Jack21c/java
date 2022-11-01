import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


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
    int x2 = 100;
    int y2 = 0;
    int w2 = 5;
    int h2 = 60;
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
        ball_x = f.getWidth()/2;
        ball_y = f.getHeight()/2;
        new Thread(mt).start();
        //this.c = c1;
        //c = c1;
        down_y = f.getHeight() - down_h - 40;
        c.setLayout(null);
    }
    void setAnother(int x, int y, int w, int h, int stopp)
    {
    	x2 = x;
    	y2 = x;
    	w2 = x;
    	h2 = x;
    	stop += stopp;
    }
    int get_x()
    {
    	int x1 = f.getWidth() - x;
    	return x1;
    }
    int get_y()
    {
    	int y1 = y;
    	return y1;
    }
    int get_w()
    {
    	int w1 = w;
    	return w1;
    }
    int get_h()
    {
    	int h1 = h;
    	return h1;
    }
    void set_x2(int x1)
    {
    	x2 = x1;
    }
    void set_y2(int y1)
    {
    	y2 = y1;
    }
    void set_w2(int w1)
    {
    	w2 = w1;
    }
    void set_h2(int h1)
    {
    	h2 = h1;
    }
    void set_stop2(int stop1)
    {
    	stop += stop1;
    }
    
    public int get_stop() {
		// TODO Auto-generated method stub
		return stop;
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
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
        
        if(((ball_x - r <= x && (ball_y >= y && ball_y <= y + h))||ball_x - r > x) && ((ball_x - r >= x2 && (ball_y >= y2 && ball_y <= y2 + h2))||ball_x - r < x2) && stop == 0)
        {
        	//new Thread(mt).start();
        	Color c_body = new Color(179, 0, 0);
            gr.setColor(c_body);
            gr.fillRect(x, y, w, h);
            gr.fillRect(x2, y2, w2, h2);
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
            if(ball_x - r >= x2  && (ball_y >= y2 && ball_y <= y2 + h2))
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
 

public class Player {

	static JFrame f = new JFrame("Eeeee");
	static MyPanel p = new MyPanel(f);
    
	static int x2 = 100;
    static int y2 = 0;
    static int w2 = 5;
    static int h2 = 60;
    static int vzb = 0;
    int x = 100;
    int y = 0;
    int w = 5;
    int h = 60;
    static int stop1 = 0;
    static int stop2 = 0;
    
    public Player(int i) {
		// TODO Auto-generated constructor stub
		
    	f.setSize(1400, 600);
        f.setLocation(100, 100);
        
        Container c = f.getContentPane();
        c.setLayout(null);
        
        p.setBounds(0, 0, f.getWidth() - 10, f.getHeight() - 10);
        //p.setAnother(x2, y2, w2, h2, stop2);
        c.add(p);
        f.setVisible(true);
	}
    void setpAnother(int x, int y, int w, int h, int stopp)
    {
    	p.setAnother(x, y, w, h, stopp);
    	x2 = x;
    	y2 = x;
    	w2 = x;
    	h2 = x;
    	stop2 = stopp;
    }
    int getp_x()
    {
    	return p.get_x();
    }
    int getp_y()
    {
    	return p.get_y();
    }
    int getp_w()
    {
    	return p.get_w();
    }
    int getp_h()
    {
    	return p.get_h();
    }
    int getp_stop()
    {
    	return p.get_stop();
    }
    void setp_x2(int x2)
    {
    	p.set_x2(x2);
    }
    void setp_y2(int y2)
    {
    	p.set_y2(y2);
    }
    void setp_w2(int w2)
    {
    	p.set_w2(w2);
    }
    void setp_h2(int h2)
    {
    	p.set_h2(h2);
    }
    void setp_stop2(int stop2)
    {
    	p.set_stop2(stop2);
    }
    
    public Player(int x1, int y1, int w1, int h1, int stop1, int i) {
		// TODO Auto-generated constructor stub
    	//Scanner in = new Scanner(System.in);
		
		
		x2 = x1;
		y2 = y1;
		w2 = w1;
		h2 = h1;
		stop2 = stop1;
			
		
	}

    public Player(Socket s, int i) {
		// TODO Auto-generated constructor stub
    	//Scanner in = new Scanner(System.in);
		
		InputStream in;
		try {
			
			in = s.getInputStream();
			
			if(in.read() != '0')
			{
			x2 = in.read();
			y2 = in.read();
		    w2 = in.read();
		    h2 = in.read();
		    stop1 = in.read();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f.setSize(1400, 600);
        f.setLocation(100, 100);
        
        Container c = f.getContentPane();
        c.setLayout(null);
        
        p.setBounds(0, 0, f.getWidth() - 10, f.getHeight() - 10);
        //p.setAnother(x2, y2, w2, h2, stop2);
        c.add(p);
        f.setVisible(true);
        
	}

	public void play() {
		vzb = 1;
	}

}
