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
 
public class Dek {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        MyDek Dek = new MyDek();
        // System.out.println("");
        while (true) {
            String s = in.next();
            // System.out.println(s);
            if (s.equals("front")) {
                Dek.front();
            } else {
                if (s.equals("back")) {
                    Dek.back();
                } else {
                    if (s.equals("pop_front")) {
                        Dek.pop_front();
                    } else {
                        if (s.equals("pop_back")) {
                            Dek.pop_back();
                        } else {
                            if (s.equals("size")) {
                                Dek.size();
                            } else {
                                if (s.equals("clear")) {
                                    Dek.clear();
                                } else {
                                    if (s.equals("exit")) {
                                        System.out.println("bye");
                                        break;
                                    } else {
 
                                        int n = in.nextInt();
                                        if (s.equals("push_front")) {
                                            Dek.push_front(n);
                                        }
                                        if (s.equals("push_back")) {
                                            Dek.push_back(n);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
 
}
 
class MyQueve {
    public int[] data = new int[1000];
    public int tail = 0;
    public int head = 0;
 
    MyQueve() {
        Arrays.fill(data, 0);
    }
 
    void push_back(int n) {
        if (tail - head >= data.length) {
            int[] data_copy = new int[data.length + 1];
            System.arraycopy(data, head % data.length, data_copy, 0, data.length - head % data.length);
            System.arraycopy(data, 0, data_copy, data.length - head % data.length, head % data.length);
            head = 0;
            tail = data.length;
            data = data_copy;
        }
        data[tail % data.length] = n;
        tail++;
        System.out.println("ok");
    }
 
    void pop_front() {
        if (tail - head == 0) {
            // throw new NoElementException;
            System.out.println("error");
        } else {
            System.out.println(data[head % data.length]);
            data[head % data.length] = 0;
            head++;
        }
    }
 
    void front() {
        if (tail - head == 0) {
            // throw new NoElementException;
            System.out.println("error");
        } else {
            System.out.println(data[head % data.length]);
        }
    }
 
    void size() {
        System.out.println(tail - head);
    }
 
    void clear() {
        Arrays.fill(data, 0);
        tail = 0;
        head = 0;
        System.out.println("ok");
    }
}
 
class MyDek extends MyQueve {
    MyDek() {
        Arrays.fill(data, 0);
    }
 
    void push_front(int n) {
        if (tail - head >= data.length) {
            int[] data_copy = new int[data.length + 1];
            System.arraycopy(data, head % data.length, data_copy, 1, data.length - head % data.length);
            System.arraycopy(data, 0, data_copy, data.length - head % data.length + 1, head % data.length);
            head = 1;
            tail = data.length + 1;
            data = data_copy;
            data[head % data.length - 1] = n;
            head--;
            System.out.println("ok");
        } else {
            if (tail - head == 0) {
                data[head % data.length] = n;
                tail++;
                System.out.println("ok");
            } else {
                if (head % data.length != 0) {
                    data[head % data.length - 1] = n;
                    head--;
                } else {
                    int[] data_copy = new int[data.length + 1];
                    System.arraycopy(data, 0, data_copy, 1, data.length);
                    data = data_copy;
                    data[head % data.length] = n;
                    tail++;
                }
                System.out.println("ok");
            }
        }
    }
 
    void pop_back() {
        if (tail - head == 0) {
            // throw new NoElementException;
            System.out.println("error");
        } else {
        	int td = tail % data.length - 1;
        	if(tail % data.length == 0)
        	{
        		td = data.length - 1;
        	}
            System.out.println(data[td]);
            data[td] = 0;
            tail--;
        }
    }
 
    void back() {
        if (tail - head == 0) {
            // throw new NoElementException;
            System.out.println("error");
        } else {
            System.out.println(data[tail % data.length - 1]);
        }
    }
}
 