package com.tech2java.solid.priciples.dependenncyinversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Bofore
	//Writes message to a file
	/*
	public void writeMessage(Message msg, String fileName) throws IOException {
		//problem:If we want to change the formatter-
		Formatter formatter = new JSONFormatter();//creates formatter
		//problem2: if we want to change the Writer to Console

		// these are tightly coupled objects
		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
		}
	}

	 */


	public void writeMessage(Message msg, /*String fileName*/Formatter formatter ,PrintWriter writer) throws IOException {
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
	}
}
