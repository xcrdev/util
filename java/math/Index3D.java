package com.robledo.util.java.math;

import com.robledo.util.java.util.Round;


public class Index3D {
	private int x;
	private int y;
	private int z;
	public Index3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public static Index3D createIndexFromWorldPoint(Point3D point, float edge) {
		Point3D cubeMidPoint;
		if (
				point.getX() % edge == edge/2.0f && 
				point.getY() % edge == edge/2.0f &&
				point.getZ() % edge == edge/2.0f) {
			cubeMidPoint = point;
		} else {
			cubeMidPoint = new Point3D(
					Round.midPointOfMultiple(edge, point.getX()),
					Round.midPointOfMultiple(edge, point.getY()),
					Round.midPointOfMultiple(edge, point.getZ()));
		}
		
		return new Index3D(
				(int) ((cubeMidPoint.getX()-edge/2.0f)/edge),
				(int) ((cubeMidPoint.getY()-edge/2.0f)/edge),
				(int) ((cubeMidPoint.getZ()-edge/2.0f)/edge));
		
	}
}
