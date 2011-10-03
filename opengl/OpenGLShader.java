package com.robledo.util.opengl;

public abstract class OpenGLShader {
	Integer intObject;
	public OpenGLShader(int value) {
		intObject = new Integer(value);
	}
	public abstract int intValue();
}
