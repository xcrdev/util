package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JsArrayNumber;

public class Float32Array extends TypedArray<Float32Array> {
	
	protected Float32Array() {
	}
	  
	public static final native Float32Array create(JsArrayNumber data) /*-{
		return new Float32Array(data);
	}-*/;
	  
	public static final Float32Array create(float[] data) {
		return create(toJsArray(data));
	}
	  
	public final native int getLength() /*-{
		return this.length;
	}-*/;
}