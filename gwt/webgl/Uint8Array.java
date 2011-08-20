package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JsArrayNumber;

public class Uint8Array extends TypedArray<Uint8Array> {

	protected Uint8Array() {
	};

	public static final native Uint8Array create(JsArrayNumber data) /*-{
		var buffer = new ArrayBuffer(data.length*4);
		var float32View = new Float32Array(buffer);
		
		
		for (var i=0;i < data.length;i++) {
			float32View[i]=data[i];
		}
		return new Uint8Array(buffer);
	}-*/;

	public static final Uint8Array create(float[] data) {
		return create(toJsArray(data));
	}
	
	public final native int getLength() /*-{
		return this.length;
	}-*/;
	
	public final native int getValue(int i) /*-{
		return this[i];
	}-*/;
}
