package com.hughes.thread;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("abcd.txt"));
		Game f = (Game) in.readObject();
		System.out.println(f.name);
	}

}