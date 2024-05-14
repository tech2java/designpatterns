package com.tech2java.solid.priciples.dependenncyinversion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();


		try(PrintWriter pw=new PrintWriter(System.out)) {
			//Providing dependencies to the client code
			printer.writeMessage(msg, new JSONFormatter(), pw);
		}


		try(PrintWriter pw=new PrintWriter(new FileWriter("test_msg.txt"))) {
			//Providing dependencies to the client code
			printer.writeMessage(msg, new JSONFormatter(), pw);
		}
	}

}
