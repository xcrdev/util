package com.robledo.util.gwt.webgl;

//import java.util.ArrayList;

import com.google.gwt.core.client.JavaScriptObject;

public class JsArrayTest extends JavaScriptObject {

	protected JsArrayTest () {
		
	};
	
	public native static final JavaScriptObject create (float[] array) /*-{
		return new Float32Array(array);
	}-*/;
	
	public native static final JavaScriptObject create (short[] array) /*-{
		return new Uint16Array(array);
	}-*/;
	
	public native static final JavaScriptObject createUint16Array () /*-{
		return new Uint16Array(2048);
	}-*/;
	
	public native static final int length(JavaScriptObject array) /*-{
		return array.length;
	}-*/;
	
	public native static final void generateIndices (JavaScriptObject indices) /*-{
		var lastElement;
		if (indices.length == 0) {
			lastElement = 0;
		} else {
			lastElement = indices[indices.length - 1];
			lastElement = (lastElement + 1);
		}
		
	      //front face
	      indices[indices.length] = (lastElement + 0);
	      indices[indices.length] = (lastElement + 1);
	      indices[indices.length] = (lastElement + 2);
	      indices[indices.length] = (lastElement + 0);
	      indices[indices.length] = (lastElement + 2);
	      indices[indices.length] = (lastElement + 3);
	      //back face
	      indices[indices.length] = (lastElement + 4);
	      indices[indices.length] = (lastElement + 5);
	      indices[indices.length] = (lastElement + 6);
	      indices[indices.length] = (lastElement + 4);
	      indices[indices.length] = (lastElement + 6);
	      indices[indices.length] = (lastElement + 7);
	      //top face
	      indices[indices.length] = (lastElement + 8);
	      indices[indices.length] = (lastElement + 9);
	      indices[indices.length] = (lastElement + 10);
	      indices[indices.length] = (lastElement + 8);
	      indices[indices.length] = (lastElement + 10);
	      indices[indices.length] = (lastElement + 11);
	      //bottom face
	      indices[indices.length] = (lastElement + 12);
	      indices[indices.length] = (lastElement + 13);
	      indices[indices.length] = (lastElement + 14);
	      indices[indices.length] = (lastElement + 12);
	      indices[indices.length] = (lastElement + 14);
	      indices[indices.length] = (lastElement + 15);
	      //right face
	      indices[indices.length] = (lastElement + 16);
	      indices[indices.length] = (lastElement + 17);
	      indices[indices.length] = (lastElement + 18);
	      indices[indices.length] = (lastElement + 16);
	      indices[indices.length] = (lastElement + 18);
	      indices[indices.length] = (lastElement + 19);
	      //left face
	      indices[indices.length] = (lastElement + 20);
	      indices[indices.length] = (lastElement + 21);
	      indices[indices.length] = (lastElement + 22);
	      indices[indices.length] = (lastElement + 20);
	      indices[indices.length] = (lastElement + 22);
	      indices[indices.length] = (lastElement + 23);
	}-*/;
}
