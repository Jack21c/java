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

public class testB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		ArrayDeque<Integer> first = new ArrayDeque<Integer>();
		ArrayDeque<Integer> second = new ArrayDeque<Integer>();
		first.addLast(in.nextInt());
		first.addLast(in.nextInt());
		first.addLast(in.nextInt());
		first.addLast(in.nextInt());
		first.addLast(in.nextInt());
		second.addLast(in.nextInt());
		second.addLast(in.nextInt());
		second.addLast(in.nextInt());
		second.addLast(in.nextInt());
		second.addLast(in.nextInt());
		int counttime = 0;
		int end = 0;
		while(counttime < 1000000)
		{
			if((first.getFirst() == 0 && second.getFirst() == 9)) {
				first.addLast(first.getFirst());
				first.addLast(second.getFirst());
				first.removeFirst();
				second.removeFirst();
			}
			else {
				if(second.getFirst() == 0 && first.getFirst() == 9) {
					second.addLast(first.getFirst());
					second.addLast(second.getFirst());
					first.removeFirst();
					second.removeFirst();
				}
				else {
					if(first.getFirst() > second.getFirst()) {
						first.addLast(first.getFirst());
						first.addLast(second.getFirst());
						first.removeFirst();
						second.removeFirst();
					}
					else {
						if(second.getFirst() > first.getFirst()) {
							second.addLast(first.getFirst());
							second.addLast(second.getFirst());
							first.removeFirst();
							second.removeFirst();
						}
					}
				}
			}
			counttime++;
			if(second.isEmpty())
			{
				System.out.print("first " + counttime);
				end = 1;
				break;
			}
			if(first.isEmpty())
			{
				System.out.print("second " + counttime);
				end = 1;
				break;
			}
		}
		if(end == 0)
		{
			System.out.print("botva");
		}
		
	}

}




