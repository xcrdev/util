package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JsArrayNumber;

public class Int32Array extends TypedArray<Uint16Array> {

	  protected Int32Array() {
	  };
	  
	  public static final native Int32Array create(JsArrayNumber data) /*-{
	  	return new Uint16Array(data);
	  }-*/;
	  
	  public static final Int32Array create(int[] data) {
		  return create(toJsArray(data));
	  }
	
}
