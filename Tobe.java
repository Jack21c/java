import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import javax.imageio.*;

import java.io.*;

public class Tobe {
	public static void main(String[] args) throws Exception{
		//Scanner in =new Scanner(System.in);
		String c = new String(Files.readAllBytes(Paths.get("test1.txt")));
		//c = c.replaceAll( "[^\\d]", "" );
		//int resultVal= Integer.parseInt(str);
		int a = Integer.parseInt(c);
		//BigInteger bi= new BigInteger("" + a);
		//int a = (int) c;
		//System.out.print(a);
		String s = to16(a);
		String s2 = to2(a);
		String s3 = B1toB2(a, 16, 2);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		/*try(FileReader reader = new FileReader("test1.txt"))
        {
           // читаем посимвольно
            
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   */
	}
	 private static String readUsingFiles(String fileName) throws IOException {
	        return new String(Files.readAllBytes(Paths.get(fileName)));
	    }
	 
	static int tobin(int a) {  
        int b = 0; 
        int c = a;
        while(c !=0 ) {  
        	if(c == a) {
        		b = c%2;
        	}else {
        		b *= 10*b + c%2;
        	}
            b = c%2;  
            c = c/2;  
        } 
        return b;
        //System.out.println(b);  
    }
	static String to16(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s2=bi.toString(16);
		BigInteger b2= new BigInteger(s2,16);
		return s2;
        
    }
	static String B1toB2(int a, int b1, int b2) {  
		BigInteger bi= new BigInteger("" + a, b1);
		String s2=bi.toString(b2);
		BigInteger bi2= new BigInteger(s2, b2);
		return s2;
        
    }
	static String to7(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s2=bi.toString(7);
		BigInteger b2= new BigInteger(s2,7);
		return s2;
        
    }
	static String to2(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s2=bi.toString(2);
		BigInteger b2= new BigInteger(s2,2);
		return s2;
        
    }
	/*static String to16(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s=bi.toString(16);
		BigInteger b2= new BigInteger(s,16);
		return s;
        int b = tobin(a); 
        int c = b;
        int d = 0;
        while(c !=0 ) {  
        	d = c%10000;
        	if(d == 0) {
        		
        	}
        	if(c == a) {
        		b = c%16;
        	}else {
        		b *= 10*b + c%2;
        	}
            b = c%2;  
            c = c/2;  
        } 
        System.out.println(b);  
    }*/
}
class Using {
	
}