package com.hughes.thread;
import java.io.*;

class Game implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "shruti";
    int no = 90;

    public void display() {
        System.out.println("Serialization...");
    }
}

public class SerDeserExample {
    public static void main(String[] args) {
        Game gm = new Game();
        try {
            FileOutputStream fout = new FileOutputStream("abcd.tmp");
            ObjectOutputStream o = new ObjectOutputStream(fout);
            o.writeObject(gm);
            o.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
