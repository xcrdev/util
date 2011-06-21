package com.robledo.util.java.math;



public class Vector3D {
	private float x;
	private float y;
	private float z;
	public Vector3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	public Vector3D toUnitVector() {
		float len = this.length();
		return new Vector3D(this.x/len, this.y/len, this.z/len);
	}
	
	public float dot(Vector3D other) {
		return this.x * other.x + this.y * other.y + this.z * other.z;
	}
	
	public float length () {
		return (float) Math.sqrt(this.dot(this));
	}
	
	public Vector3D multiply (float scalar) {
		return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
	}
	
	public Vector3D divide (float scalar) {
		return new Vector3D(this.x / scalar, this.y / scalar, this.z / scalar);
	}
	
	public Vector3D cross (Vector3D v) {
		return new Vector3D(this.y*v.z-this.z*v.y, this.z*v.x-this.x*v.z,this.x*v.y-this.y*v.x);
	}
	
	public Vector3D add (Vector3D v) {
		return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
	}
	
	public Vector3D subtract (Vector3D v) {
		return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
	}
	
	public static Vector3D minus(Point3D a, Point3D b) {
		return new Vector3D(a.getX()-b.getX(),a.getY()-b.getY(),a.getZ()-b.getZ());
	}
	
	public static Vector3D create(Point3D originPoint, CompassRadians theta, float distance) {
		Point3D endPoint = Math3D.calculatePoint3D(originPoint, theta, distance);
		Vector3D result = minus(endPoint, originPoint);
		return result;
		
	}
	
	public static Vector3D minus (Vector3D a, Vector3D b) {
		return new Vector3D(a.getX()-b.getX(),a.getY()-b.getY(),a.getZ()-b.getZ());
		
	}
	
	public Vector3D translate(FloatMatrix4x4 mat4x4) {
		FloatMatrix result;
		float[][] floatArray4x1 = new float[4][1];
		floatArray4x1[0][0] = this.x;
		floatArray4x1[1][0] = this.y;
		floatArray4x1[2][0] = this.z;
		floatArray4x1[3][0] = 1.0f;
		result = mat4x4.multiply(new FloatMatrix(floatArray4x1));
		
		return new Vector3D(result.getData()[0][0],result.getData()[1][0],result.getData()[2][0]);
		
	}
}
