package com.robledo.util.opengl;

public abstract class OpenGLProgram {

	Integer intObject;
	public OpenGLProgram(int value) {
		intObject = new Integer(value);
	}
	public abstract int intValue();
}
