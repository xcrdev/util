package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JavaScriptObject;

public class ArrayBufferView extends JavaScriptObject {

	public final native ArrayBuffer getBuffer() /*-{
		return this.buffer;
	}-*/;
	
	public final native int getByteLength() /*-{
		return this.byteLength;
	}-*/;
	
	public final native int getByteOffset() /*-{
		return this.byteOffset;
	}-*/;
	
}
