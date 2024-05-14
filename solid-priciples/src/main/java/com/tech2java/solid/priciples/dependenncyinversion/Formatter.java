package com.tech2java.solid.priciples.dependenncyinversion;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
