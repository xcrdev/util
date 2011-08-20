package com.robledo.util.gwt.webgl;

public class WebGLUniformLocation {
	private Integer value;
	public WebGLUniformLocation(int value) {
		this.value = new Integer(value);
	}
	
	public int intValue() {
		return value.intValue();
	}
}
