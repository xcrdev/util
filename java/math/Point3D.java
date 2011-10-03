package com.robledo.util.java.math;


public class Point3D {
	private float x;
	private float y;
	private float z;
	public Point3D(float x, float y, float z) {
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
	
	/*public static Vector3D minus(Point3D a, Point3D b) {
		return new Vector3D(a.x-b.x, a.y-b.y, a.z-b.z);
	}*/

	
	public static Point3D add(Point3D a, Point3D b) {
		return new Point3D(a.x+b.x, a.y+b.y, a.z+b.z);
	}
	
	public static Point3D add(Point3D a, Vector3D b) {
		return new Point3D(a.getX()+b.getX(), a.getY()+b.getY(), a.getZ()+b.getZ());
	}
	
	public Point3D multiply(float scalar) {
		return new Point3D(x*scalar, y*scalar, z*scalar);
	}
}
