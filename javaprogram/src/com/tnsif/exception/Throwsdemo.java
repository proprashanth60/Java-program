package com.tnsif.exception;
import java.io.FileReader;

import java.io.IOException;

public class Throwsdemo {
	static void test() throws IOException,ClassNotFoundException{
		FileReader file=new FileReader("abc.txt");//may thow io
		Class.forName("test");
		file.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Throwsdemo.test();
			
		}
		catch(IOException e) {
			System.out.println("file error");
		}
		catch(ClassNotFoundException t) {
			System.out.println("class not found error");
		}

	}

}
