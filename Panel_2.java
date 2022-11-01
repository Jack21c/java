import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel
{
	public void paintComponent(Graphics gr)
	{
		super.paintComponent(gr);
		//gr.drawImage(sun3.png, 350, 100, 300, 300, ImageObserver observer);
		Color c_troci = new Color(0, 100, 0);
		gr.setColor(c_troci);
		gr.drawString("It is the best picture", 200, 100);
		Color c_ground = new Color(0, 0, 0);
		gr.setColor(c_ground);
		gr.fillRect(0, 555, 1000, 5);
		Color c_cabina = new Color(189, 189, 189);
		gr.setColor(c_cabina);
		gr.fillRect(500, 360, 120, 170);
		Color c_cuzof = new Color(70, 130, 180);
		gr.setColor(c_cuzof);
		gr.fillRect(200, 330, 300, 200);
		Color c_okno = new Color(179, 224, 230);
		gr.setColor(c_okno);
		gr.fillRect(525, 385, 70, 35);
		gr.setColor(c_ground);
		gr.fillOval(525, 495, 60, 60);
		gr.fillOval(270, 495, 60, 60);
		Color c_1 = new Color(255, 175, 0);
		gr.setColor(c_1);
		gr.fillOval(450, 100, 80, 80);
		Color c_2 = new Color(255, 195, 0);
		gr.setColor(c_2);
		gr.fillOval(460, 110, 60, 60);
		Color c_3 = new Color(255, 215, 0);
		gr.setColor(c_3);
		gr.fillOval(470, 120, 40, 40);
		Color c_4 = new Color(255, 235, 0);
		gr.setColor(c_4);
		gr.fillOval(480, 130, 20, 20);
		
	}
}

public class Panel_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Eeeee");
		f.setSize(1000, 600);
		f.setLocation(200, 100);
		f.getContentPane().add(new MyPanel());
		f.setVisible(true);
	}

}
