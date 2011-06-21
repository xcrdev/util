package com.robledo.util.java.math;

import static java.lang.Math.cos;
import static java.lang.Math.sin;


public class Math3D {
	
	/**
	 * x1 = x0 + d*cos(theta)
	 * y1 = y1 + d*sin(theta)
	 */
	public static Point2D calculatePoint2D(Point2D originPoint, CompassRadians theta, float distance) {
		float x1;
		float y1;
		Point2D result;
		float x0 = originPoint.getX();
		float y0 = originPoint.getY();
		x1 = x0 + distance * (float) cos(theta.doubleValue());
		y1 = y0 + distance * (float) sin(theta.doubleValue());
		result = new Point2D(x1,y1);
		return result;
	}
	
	public static Point3D calculatePoint3D(Point3D originPoint, CompassRadians theta, float distance) {
		Point2D endPoint2D;
		endPoint2D = calculatePoint2D(new Point2D(originPoint.getZ(), originPoint.getX()), theta, distance);
		Point3D endPoint3D = new Point3D(endPoint2D.getY(), originPoint.getY(), endPoint2D.getX());
		return endPoint3D;
		
	}
	
	public static Point3D strafeLeft(Point3D position, CompassRadians myHeading, float step) {
		float z = position.getZ() + step * (float) (-sin(myHeading.doubleValue()));
		float x = position.getX() + step * (float) (cos(myHeading.doubleValue()));
		Point3D result = new Point3D(x, position.getY(), z);
    	return result;
	}
	
	public static Point3D strafeRight(Point3D position, CompassRadians myHeading, float step) {
       	float z = position.getZ() + step * (float) (sin(myHeading.doubleValue()));
       	float x = position.getX() + step * (float) (-cos(myHeading.doubleValue()));
		Point3D result = new Point3D(x, position.getY(), z);

    	return result;
	}
	
	public static Point3D moveForward(Point3D position, CompassRadians myHeading, float step) {

		float z = position.getZ() + step * (float) (cos(myHeading.doubleValue()));
		float x = position.getX() + step * (float) (sin(myHeading.doubleValue()));
		Point3D result = new Point3D(x, position.getY(), z);
    	return result;
	}
	
	public static Point3D moveBackward(Point3D position, CompassRadians myHeading, float step) {
		float z = position.getZ() + step * (float) (-cos(myHeading.doubleValue()));
		float x = position.getX() + step * (float) (-sin(myHeading.doubleValue()));
		Point3D result = new Point3D(x, position.getY(), z);
    	return result;
	}
	
	/*                      ^ x-axis
	 *                      |
	 *                      |
	 *                      |         _-'
	 *                      |      _-'
	 *                      |   _-'
	 *                      |_-'  theta
	 *   ---------------------------------------> z-axis
	 *                      |
	 *                      |
	 *                      |
	 *                      |
	 *                      |
	 *                      |
	 */
	

}
