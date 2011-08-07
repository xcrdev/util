package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JavaScriptObject;

public class ArrayBuffer extends JavaScriptObject {

	protected ArrayBuffer() {
	}
	
	public static final native ArrayBuffer create(int length) /*-{
		return new ArrayBuffer(length);
	}-*/;
	
	public final native int getByteLength() /*-{
		return this.length;
	}-*/;
	
}
