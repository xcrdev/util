package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JavaScriptObject;

public class WebGLContextAttributes extends JavaScriptObject{

	protected WebGLContextAttributes () {
		super();
	}
	
	public final static WebGLContextAttributes create() {
		return JavaScriptObject.createObject().cast();
	}
	
	public final native void setAntiAlias(boolean antialias) /*-{
		this.antialias = antialias;
	}-*/;
	
}
