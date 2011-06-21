package com.robledo.util.gwt.webgl;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.robledo.util.gwt.canvas.Context;

public class WebGLRenderingContext extends Context{

	protected WebGLRenderingContext () {
	}
	
	public static final int LEQUAL = 0x0203;
	public static final int DEPTH_TEST = 0x0B71;
	public static final int COMPILE_STATUS = 0x8B81;
	public static final int FRAGMENT_SHADER = 0x8B30;
	public static final int VERTEX_SHADER = 0x8B31;
	public static final int LINK_STATUS = 0x8B82;
	public static final int ARRAY_BUFFER = 0x8892;
	public static final int ELEMENT_ARRAY_BUFFER = 0x8893;
	public static final int STATIC_DRAW = 0x88E4;
	public static final int COLOR_BUFFER_BIT = 0x00004000;
	public static final int DEPTH_BUFFER_BIT = 0x00000100;
	public static final int FLOAT = 0x1406;
	public static final int TRIANGLES = 0x0004;
	public static final int TEXTURE_2D = 0x0DE1;
	public static final int TEXTURE_MAG_FILTER = 0x2800;
	public static final int TEXTURE_MIN_FILTER = 0x2801;
	public static final int LINEAR = 0x2601;
	public static final int NEAREST_MIPMAP_NEAREST = 0x2700;
	public static final int LINEAR_MIPMAP_NEAREST = 0x2701;
	public static final int NEAREST_MIPMAP_LINEAR = 0x2702;
	public static final int LINEAR_MIPMAP_LINEAR = 0x2703;
	public static final int TEXTURE0 = 0x84C0;
	public static final int UNSIGNED_SHORT = 0x1403;
	public static final int RGB = 0x1907;
	public static final int RGBA = 0x1908;
	public static final int UNSIGNED_BYTE = 0x1401;
	public static final int NEAREST = 0x2600;
	public static final int INT = 0x1404;
	public static final int DYNAMIC_DRAW = 0x88E8;
	public static final int SRC_ALPHA = 0x0302;
	public static final int ONE = 1;
	public static final int BLEND = 0x0BE2;
	public static final int ONE_MINUS_SRC_ALPHA = 0x0303;
	public static final int TEXTURE_WRAP_S = 0x2802;
	public static final int TEXTURE_WRAP_T = 0x2803;
	public static final int CLAMP_TO_EDGE = 0x812F;;
	public static final int REPEAT = 0x2901;
	public static final int UNPACK_FLIP_Y_WEBGL = 0x9240;
	
	public native final void clearColor (float red, float green, float blue, float alpha) /*-{
    	this.clearColor(red,green,blue,alpha);
	}-*/;
	public native final void clearDepth (float depth) /*-{
    	this.clearDepth(depth);
	}-*/;
	public native final void enable (int cap) /*-{
    	this.enable(cap);
	}-*/;
	public native final void depthFunc (int func) /*-{
    	this.depthFunc(func);
	}-*/;
	public native final void blendFunc (int sfactor, int dfactor) /*-{
		this.blendFunc(sfactor, dfactor);
	}-*/;
	public native final WebGLShader createShader (int shaderType) /*-{
		return this.createShader(shaderType);
	}-*/;
	public native final void shaderSource (WebGLShader shader, String shaderSource) /*-{
		this.shaderSource(shader, shaderSource);
	}-*/;
	public native final void compileShader(WebGLShader shader) /*-{
		this.compileShader(shader);
	}-*/;
	public native final boolean getShaderParameterb(WebGLShader shader, int pname) /*-{
		return this.getShaderParameter(shader, pname);
	}-*/;
	public native final String getShaderInfoLog(WebGLShader shader) /*-{
		return this.getShaderInfoLog(shader);
	}-*/;
	public native final WebGLProgram createProgram() /*-{
		return this.createProgram();
	}-*/;
	public native final void attachShader(WebGLProgram program, WebGLShader shader) /*-{
		this.attachShader(program, shader);
	}-*/;
	public native final void linkProgram(WebGLProgram program) /*-{
		this.linkProgram(program);
	}-*/;
	public native final boolean getProgramParameterb(WebGLProgram program, int pname) /*-{
		return this.getProgramParameter(program, pname);
	}-*/;
	public native final void useProgram(WebGLProgram program) /*-{
		this.useProgram(program);
	}-*/;
	public native final int getAttribLocation(WebGLProgram program, String name) /*-{
		return this.getAttribLocation(program, name);
	}-*/;
	public native final void enableVertexAttribArray (int index) /*-{
		this.enableVertexAttribArray(index);
	}-*/;
	public native final WebGLUniformLocation getUniformLocation(WebGLProgram program, String name) /*-{
		return this.getUniformLocation(program, name);
	}-*/;
	public native final WebGLBuffer createBuffer() /*-{
		return this.createBuffer();
	}-*/;
	public native final void bindBuffer(int target, WebGLBuffer buffer) /*-{
		this.bindBuffer(target, buffer);
	}-*/;
	//public native final void bufferData(int target, TypedArray<?> data, int usage) /*-{
	//	this.bufferData(target, data, usage);
	//}-*/;
	public native final void bufferData(int target, JavaScriptObject data, int usage) /*-{
		this.bufferData(target, data, usage);
	}-*/;
	public native final void viewport(int x, int y, int width, int height) /*-{
		this.viewport(x, y, width, height);
	}-*/;
	public native final void clear(int mask) /*-{
		this.clear(mask);
	}-*/;
	public native final void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int offset) /*-{
		this.vertexAttribPointer(index, size, type, normalized, stride, offset);
	}-*/;
	public native final void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array value) /*-{
		this.uniformMatrix4fv(location, transpose, value);
	}-*/;
	//public native final void uniformMatrix4fv(int location, boolean transpose, JavaScriptObject value) /*-{
	//	this.uniformMatrix4fv(location, transpose, value);
	//}-*/;
	public native final void drawArrays(int mode, int first, int count) /*-{
		this.drawArrays(mode, first, count);
	}-*/;
	public native final void bindTexture(int target, WebGLTexture texture) /*-{
		this.bindTexture(target, texture);
	}-*/;
	public native final void texParameteri(int target, int pname, int param) /*-{
		this.texParameteri(target, pname, param);
	}-*/;
	public native final void generateMipmap(int target) /*-{
		this.generateMipmap(target);
	}-*/;
	public native final void activeTexture(int texture) /*-{
		this.activeTexture(texture);
	}-*/;
	public native final void uniform1i(WebGLUniformLocation location, int x) /*-{
		this.uniform1i(location, x);
	}-*/;
	public native final WebGLTexture createTexture() /*-{
		return this.createTexture();
	}-*/;
	public native final void flush() /*-{
		this.flush();
	}-*/;
	public native final void drawElements(int mode, int count, int type, int offset) /*-{
		this.drawElements(mode, count, type, offset);
	}-*/;
	public native final void texImage2D(int target, int level, int internalformat, int format, int type, Element image) /*-{
		this.texImage2D(target, level, internalformat, format, type, image);
	}-*/;
	public native final void uniform3f(WebGLUniformLocation location, float x, float y, float z) /*-{
		this.uniform3f(location, x, y, z);
	}-*/;
	
	public final native void pixelStorei(int pname, int param) /*-{
		this.pixelStorei(pname, param);
	}-*/;

}
