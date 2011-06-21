/**   
 * Copyright 2009-2010 SÌnke Sothmann, Steffen SchÌfer and others
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robledo.util.java.math;

//import com.robledo.gwt.util.Console;

/**
 * Contains several helper methods to construct matrices like projection (etc).
 * 
 * 
 */
public final class MatrixUtil {
	private MatrixUtil() {
	}

	/**
	 * 
	 * @param fieldOfViewVertical
	 * @param aspectRatio
	 * @param minimumClearance
	 * @param maximumClearance
	 * @return the created perspective matrix
	 */
	public static FloatMatrix4x4 createPerspectiveMatrix(
			int fieldOfViewVertical, float aspectRatio, float minimumClearance,
			float maximumClearance) {
		double fieldOfViewInRad = fieldOfViewVertical * Math.PI / 180.0;
		return new FloatMatrix4x4(new float[][] {
				new float[] {
						(float) (Math.tan(fieldOfViewInRad) / aspectRatio), 0,
						0, 0 },
				new float[] {
						0,
						(float) (1 / Math.tan(fieldOfViewVertical * Math.PI
								/ 180.0)), 0, 0 },
				new float[] {
						0,
						0,
						(minimumClearance + maximumClearance)
								/ (minimumClearance - maximumClearance),
						2 * minimumClearance * maximumClearance
								/ (minimumClearance - maximumClearance) },
				new float[] { 0, 0, -1, 0 } });
	};
	
	
	/**
	 * 
	 * @param left
	 * @param right
	 * @param bottom
	 * @param top
	 * @param near
	 * @param far
	 * @return the created ortho matrix
	 */
	public static FloatMatrix4x4 createOrthoMatrix(
			float left, 
			float right, 
			float bottom,
			float top,
			float near,
			float far) {
		float tx = - (right+left) / (right-left);
		float ty = - (top+bottom) / (top-bottom);
		float tz = - (far+near) / (far-near);
		return new FloatMatrix4x4(new float[][] {
				new float[] {(2/(right-left)), 0, 0, tx },
				new float[] {0, (2/(top-bottom)), 0, ty },
				new float[] {0, 0,(-2/(far-near)),tz },
				new float[] {0, 0, 0, 1 } });
	};
	

	/**
	 * Creates a rotation matrix.
	 * 
	 * @param angleX
	 *            the angle in degrees for the rotation around the x axis
	 * @param angleY
	 *            the angle in degrees for the rotation around the y axis
	 * @param angleZ
	 *            the angle in degrees for the rotation around the z axis
	 * @return the created matrix
	 */
	/*public static FloatMatrix4x4 createRotationMatrix(float angleX, float angleY,
			float angleZ) {
		return createRotationMatrixX(angleX).multiply(
				createRotationMatrixY(angleY)).multiply(
				createRotationMatrixZ(angleZ));
	}*/
	
	public static FloatMatrix4x4 createRotationMatrix(
			float angle, 
			float x,
			float y,
			float z) {
		double theta = (angle * Math.PI/180);
		float c = (float) Math.cos(theta);
		float s = (float) Math.sin(theta);
		float t = 1 -c;
		return new FloatMatrix4x4(new float[][] {
				new float[] {x*x*t+c,x*y*t-z*s,x*z*t+y*s,0},
				new float[] {x*y*t+z*s,y*y*t+c,y*z*t-x*s,0},
				new float[] {x*z*t-y*s,y*z*t+x*s,z*z*t+c,0},
				new float[] {0,0,0,1}});
	}

	/*private static FloatMatrix4x4 createRotationMatrixX(float angle) {
		double angleInRad = angle * (Math.PI / 180.0);

		// 1 0 0 0
		//
		// 0 cos(q) -sin(q) 0
		//
		// 0 sin(q) cos(q) 0
		//
		// 0 0 0 1
		// this was confirmed with wikipedia, the sylvester js library, and myself
		// rotates the y axis towards the z axis
		// counter clockwise rotation, follows the right hand rule

		return new FloatMatrix4x4(new float[][] {
				new float[] { 1, 0, 0, 0 },
				new float[] { 0, (float) cos(angleInRad),
						(float) -sin(angleInRad), 0 },
				new float[] { 0, (float) sin(angleInRad),
						(float) cos(angleInRad), 0 },
				new float[] { 0, 0, 0, 1 } });
	}

	private static FloatMatrix4x4 createRotationMatrixY(float angle) {
		double angleInRad = angle * (Math.PI / 180.0);

		// cos(a) 0 sin(a) 0
		//
		// 0 1 0 0
		//
		// -sin(a) 0 cos(a) 0
		//
		// 0 0 0 1
		// this was confirmed with wikipedia, the sylvester js library, and myself
		// rotates the z axis towards the x axis
		// counter clockwise rotation, follows the right hand rule

		return new FloatMatrix4x4(new float[][] {
				new float[] { (float) cos(angleInRad), 0,
						(float) sin(angleInRad), 0 },
				new float[] { 0, 1, 0, 0 },
				new float[] { (float) -sin(angleInRad), 0.0f,
						(float) cos(angleInRad), 0.0f },
				new float[] { 0, 0, 0, 1 } });
	}

	private static FloatMatrix4x4 createRotationMatrixZ(float angle) {
		double angleInRad = angle * (Math.PI / 180.0);

		// cos(a) -sin(a) 0 0
		//
		// sin(a) cos(a) 0 0
		//
		// 0 0 1 0
		//
		// 0 0 0 1
		// this was confirmed with wikipedia, the sylvester js library, and myself
		// rotates the x axis towards the y axis
		// counter clockwise rotation, follows the right hand rule

		return new FloatMatrix4x4(new float[][] {
				new float[] { (float) cos(angleInRad), (float) -sin(angleInRad),
						0, 0 },
				new float[] { (float) sin(angleInRad),
						(float) cos(angleInRad), 0, 0 },
				new float[] { 0, 0, 1, 0 }, new float[] { 0, 0, 0, 1 } });
	}*/

	/**
	 * Creates a translation matrix.
	 * 
	 * @param translateX
	 *            the amount to translate parallel to the x axis
	 * @param translateY
	 *            the amount to translate parallel to the y axis
	 * @param translateZ
	 *            the amount to translate parallel to the z axis
	 * @return the created matrix
	 */
	public static FloatMatrix4x4 createTranslationMatrix(float translateX,
			float translateY, float translateZ) {
		return new FloatMatrix4x4(
				new float[][] { new float[] { 1, 0, 0, translateX },
						new float[] { 0, 1, 0, translateY },
						new float[] { 0, 0, 1, translateZ },
						new float[] { 0, 0, 0, 1 } });
	}
	
	public static FloatMatrix4x4 createIdentityMatrix() {
		return new FloatMatrix4x4(
				new float[][] { new float[] { 1, 0, 0, 0 },
						new float[] { 0, 1, 0, 0 },
						new float[] { 0, 0, 1, 0 },
						new float[] { 0, 0, 0, 1 } });
	}
	
	public static void printMatrix(FloatMatrix mat) {
		String info;
		for (int row = 0; row < mat.height; row++) {
			info = "";
			for (int column = 0; column < mat.width; column++) {
				if (column == 0) {
					info = Float.toString(mat.getData()[row][column]);
				} else {
					info = info + " " + Float.toString(mat.getData()[row][column]);
				}	
			}
			//Console.log(info);
		}
		
	}
	
	public static void testMultipleRotation() {
		FloatMatrix4x4 rotz = createRotationMatrix(
				(float) (Math.PI/4 * 180/Math.PI), 0.0f,0.0f,1.0f);
		FloatMatrix4x4 roty = createRotationMatrix(
				(float)(-Math.PI/8 * 180/Math.PI), 0.0f,1.0f,0.0f);
		FloatMatrix4x4 result = rotz.multiply(roty);
		printMatrix(result);
	}
	

	/*public static void testMultipleRotation() {
		FloatMatrix4x4 rotz = createRotationMatrix(0,0,(float) (Math.PI/4 * 180/Math.PI));
		FloatMatrix4x4 roty = createRotationMatrix(0,(float)(-Math.PI/8 * 180/Math.PI), 0);
		FloatMatrix4x4 result = rotz.multiply(roty);
		printMatrix(result);
	}
	
	public static void testSingleRotation() {
		FloatMatrix4x4 rot = createRotationMatrix(
				0,
				(float)(-Math.PI/8 * 180/Math.PI),
				(float) (Math.PI/4 * 180/Math.PI));
		printMatrix(rot);
	}
	
	public static void test4x1mult() {
		FloatMatrix result;
		FloatMatrix4x4 rot = createRotationMatrix(
				0,
				0,
				(float) (Math.PI/4 * 180/Math.PI));
		float[][] vector = new float[4][1];
		vector[0][0] = 1;
		vector[1][0] = 0;
		vector[2][0] = 0;
		vector[3][0] = 1;
		result = rot.multiply(new FloatMatrix(vector));
		printMatrix(result);
	}*/
	
	/*
	 * Matrix multiplication is not commutative, 
	 * AB is not necessarily equal to BA
	 * 
	 * Matrix multiplication is associative,
	 * (AB)C is equal to A(BC)
	 * 
	 */
}