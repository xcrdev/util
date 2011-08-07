package com.robledo.util.tmp.opengl;

public abstract class OpenGLBufferUtil {

	public abstract java.nio.FloatBuffer createFloatBuffer(float[] buf);
	
	public abstract java.nio.ShortBuffer createShortBuffer(char[] buf);
	
	public abstract void createByteBuffer();
}
