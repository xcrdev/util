package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JsArrayNumber;

public class Uint16Array extends TypedArray<Uint16Array> {

	  protected Uint16Array() {
	  };
	  
	  public static final native Uint16Array create(JsArrayNumber data) /*-{
	  	return new Uint16Array(data);
	  }-*/;
	  
	  public static final Uint16Array create(short[] data) {
		  return create(toJsArrayUnsigned(data));
	  }

	  public static final Uint16Array create(char[] data) {
		  return create(toJsArrayUnsigned(data));
	  }
	  
	  public static final Uint16Array create(int[] data) {
		  return create(toJsArrayUnsigned(data));
	  }
	
}
