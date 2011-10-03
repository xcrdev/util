package com.robledo.util.opengl;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TextFileReader {

	public static String getText(String fileName) {
		String text = new String("");
		try {
		    BufferedReader in = new BufferedReader(new FileReader(fileName));
		    
		    String str;
		    while ((str = in.readLine()) != null) {
		        text = text + str;
		    }
		    in.close();
		} catch (IOException e) {
		}
		return text;
	}
	
}
