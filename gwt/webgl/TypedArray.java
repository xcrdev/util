package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public abstract class TypedArray<T extends TypedArray<?>> extends JavaScriptObject {

	  protected TypedArray() {
	  }
	  
	  static JsArrayNumber toJsArray(float[] data) {
		    JsArrayNumber jsan = (JsArrayNumber) JsArrayNumber.createArray();
		    int len = data.length;
		    for(int i = len - 1; i >= 0; i--) {
		      jsan.set(i, data[i]);
		    }
		    return jsan;
		  }
	  
	  static JsArrayNumber toJsArray(int[] data) {
		    JsArrayNumber jsan = (JsArrayNumber) JsArrayNumber.createArray();
		    int len = data.length;
		    for(int i = len - 1; i >= 0; i--) {
		      jsan.set(i, data[i]);
		    }
		    return jsan;
		  }

	  static JsArrayNumber toJsArray(char[] data) {
		    JsArrayNumber jsan = (JsArrayNumber) JsArrayNumber.createArray();
		    int len = data.length;
		    for(int i = len - 1; i >= 0; i--) {
		      jsan.set(i, data[i]);
		    }
		    return jsan;
		  }
	  
	  static JsArrayNumber toJsArrayUnsigned(short[] data) {
		    JsArrayNumber jsan = (JsArrayNumber) JsArrayNumber.createArray();
		    int len = data.length;
		    for(int i = len - 1; i >= 0; i--) {
		      //jsan.set(i, data[i] & 65535);
		    	jsan.set(i, data[i]);
		    }
		    return jsan;
		  }
	  
	  static JsArrayNumber toJsArrayUnsigned(char[] data) {
		    JsArrayNumber jsan = (JsArrayNumber) JsArrayNumber.createArray();
		    int len = data.length;
		    for(int i = len - 1; i >= 0; i--) {
		      jsan.set(i, data[i] & 65535);
		      //jsan.set(i, data[i]);
		    }
		    return jsan;
		  }
	  
	  static JsArrayNumber toJsArrayUnsigned(int[] data) {
		    JsArrayNumber jsan = (JsArrayNumber) JsArrayNumber.createArray();
		    int len = data.length;
		    for(int i = len - 1; i >= 0; i--) {
		      jsan.set(i, data[i] & 65535);
		      //jsan.set(i, data[i]);
		    }
		    return jsan;
		  }
}