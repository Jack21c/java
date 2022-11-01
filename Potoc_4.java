import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.util.*;

import javax.imageio.*;

import java.io.*;


public class Potoc_4 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		Bank bank = new Bank();
		Client c1 = new Client(bank);
		Client c2 = new Client(bank);
		new Thread(c1).start();
		new Thread(c2).start();
		
    }
}