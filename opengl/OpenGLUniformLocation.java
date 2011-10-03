package com.robledo.util.opengl;

public abstract class OpenGLUniformLocation {
	Integer intObject;
	public OpenGLUniformLocation(int value) {
		intObject = new Integer(value);
	}
	public abstract int intValue();
}
