import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.util.*;

import javax.imageio.*;

import java.io.*;
class MyThread implements Runnable
{
	
	public void run()
	{
		
		while(true)
		{
			
			System.out.print("[");
			
			System.out.print("Hello");
			
			System.out.println("]");
			
	    	
			
		}
	}
}

public class Potoc_5 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		MyThread c1 = new MyThread();
		MyThread c2 = new MyThread();
		new Thread(c1).start();
		new Thread(c2).start();
		
    }
}