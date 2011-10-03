package com.robledo.util.opengl;

public abstract class OpenGLTexture {
	Integer intObject;
	public OpenGLTexture(int value) {
		intObject = new Integer(value);
	}
	public abstract int intValue();
}
