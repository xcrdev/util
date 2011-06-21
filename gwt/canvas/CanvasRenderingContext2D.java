package com.robledo.util.gwt.canvas;



public class CanvasRenderingContext2D extends Context {

	protected CanvasRenderingContext2D () {
	}
	
	//void fillRect(in double x, in double y, in double w, in double h);
	public native final void fillRect(double x, double y, double width, double height) /*-{
		this.fillRect(x,y,width,height);
	}-*/;
	
	public native final void fillStyle(String style) /*-{
		this.fillStyle = style;
	}-*/;
	
	//void clearRect(in double x, in double y, in double w, in double h);
	public native final void clearRect(double x, double y, double width, double height) /*-{
		this.clearRect(x,y,width,height);
	}-*/;
	
}
