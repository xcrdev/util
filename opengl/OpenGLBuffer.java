package com.robledo.util.opengl;

public abstract class OpenGLBuffer {
	Integer intObject;
	public OpenGLBuffer(int value) {
		intObject = new Integer(value);
	}
	public abstract int intValue();
}
