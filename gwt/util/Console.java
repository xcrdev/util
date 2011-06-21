package com.robledo.util.gwt.util;

public class Console {
	public final native static void log(String line) /*-{
		console.log(line);
	}-*/;
}
