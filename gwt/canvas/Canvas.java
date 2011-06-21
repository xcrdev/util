package com.robledo.util.gwt.canvas;

//import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
//import com.xavier.canvas.context2d.CanvasRenderingContext2D;
import com.robledo.util.gwt.webgl.WebGLContextAttributes;
import com.robledo.util.gwt.webgl.WebGLRenderingContext;

public class Canvas extends Element {
	
	//was empty and had no arguments
	protected Canvas() {
	}
	
	/*public Canvas create(String width, String height) {
		setId("canvas");  // must exist in advance?
		setWidth(width);
		setHeight(height);
		return this;
	}*/
	
	public final native WebGLRenderingContext getWebGLContext(String context) /*-{
    	return this.getContext(context);
    }-*/;
	
	public final native WebGLRenderingContext getContext(
			String context,
			WebGLContextAttributes attrs) /*-{
		return this.getContext(context, attrs);
	}-*/;
	
	public final native Context getContext(String context) /*-{
		return this.getContext(context);
	}-*/;
	
	public final native int getWidth() /*-{
		return this.width;
	}-*/;
	
	public final native int getHeight() /*-{
		return this.height;
	}-*/;	
	
	//new
    public final void setWidth(String width) {
    	setAttribute("width", width);
    }

    //new
    public final void setHeight(String height) {
    	setAttribute("height", height);
    }
	
}
