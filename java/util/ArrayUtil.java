package com.robledo.util.java.util;

import java.util.ArrayList;

public class ArrayUtil {

	public static float[] toFloatArray(ArrayList<Float> floatAL) {
		if (floatAL != null) {
			Object[] objectArray = floatAL.toArray();
			float[] floatArray = new float[objectArray.length];
			 
			for (int i = 0; i < objectArray.length; i++)
			{
				floatArray[i] = ((Float)objectArray[i]).floatValue();
				
			}
			return floatArray;
		} else {
			return null;
		}
	}
	
	public static float[] toFloatArray(Object[] objectArray) {
		if (objectArray != null) {
			float[] floatArray = new float[objectArray.length];
			 
			for (int i = 0; i < objectArray.length; i++)
			{
				floatArray[i] = ((Float)objectArray[i]).floatValue();
				
			}
			return floatArray;
		} else {
			return null;
		}
	}
	
	public static char[] toCharArray(ArrayList<Character> charAL) {
		if (charAL != null) {
			Object[] objectArray = charAL.toArray();
			char[] charArray = new char[objectArray.length];
			 
			for (int i = 0; i < objectArray.length; i++)
			{
				charArray[i] = ((Character)objectArray[i]).charValue();
			}
			return charArray;
		} else {
			return null;
		}
	}
	
	public static char[] toCharArray(Object[] objectArray) {
		if (objectArray != null) {
			char[] charArray = new char[objectArray.length];
			 
			for (int i = 0; i < objectArray.length; i++)
			{
				charArray[i] = ((Character)objectArray[i]).charValue();
			}
			return charArray;
		} else {
			return null;
		}
	}
	
	public static short[] toShortArray(Object[] objectArray) {
		if (objectArray != null) {
			short[] shortArray = new short[objectArray.length];
			 
			for (int i = 0; i < objectArray.length; i++)
			{
				shortArray[i] = ((Short)objectArray[i]).shortValue();
			}
			return shortArray;
		} else {
			return null;
		}
	}
	

	
}
