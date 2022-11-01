// ������������� ��������� ����� JTextField
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;

class TextFieldTest extends JFrame
{
    // ��������� ����
	JTextField smallField, bigField;
	JTextField sud;
    
    public TextFieldTest()
    {
    	//gr.drawString("������� ���� ������ ", 300, 300);
        
        //super("��������� ����");
        JFrame f = new JFrame("Eeeee");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // �������� ��������� �����
        smallField = new JTextField(15);
        smallField.setToolTipText("�������� ����");
        bigField = new JTextField("����� ����", 25);
        bigField.setToolTipText("������ ����");
        sud =  new JTextField(35);
        sud.setToolTipText("Sudyba");
        
        // ��������� ������
        bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
        bigField.setHorizontalAlignment(JTextField.RIGHT);
        // ��������� ��������� �����
        smallField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ����������� ���������� ������
                JOptionPane.showMessageDialog(TextFieldTest.this, 
                               "���� �����: " + smallField.getText());
            }
        });
        // ���� � �������
        JPasswordField password = new JPasswordField(12);
        password.setEchoChar('*');
        // �������� ������ � ���������� ������
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(bigField  );
        contents.add(password  );
        setContentPane(contents);
        // ���������� ������ ���� � ������� ��� �� �����
        setSize(1300, 900);
        setVisible(true);
    }
}

public class Panel_copy_inter {
	public static void main(String[] args) {
        new TextFieldTest();
    }
}
