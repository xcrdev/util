package com.robledo.util.java.util;

public class Round {

	public static float roundToMultiple(float multiple, float number) {
		return Math.round(number/multiple)*multiple;
	}
	
	public static float ceilToMultiple(float multiple, float number) {
		return (float) (Math.ceil(number/multiple)*multiple);
	}
	
	public static float floorToMultiple(float multiple, float number) {
		return (float) (Math.floor(number/multiple)*multiple);
	}
	
	public static float midPointOfMultiple(float multiple, float number) {
		return (float) (Math.floor(number/multiple) * multiple + Math.signum(number)*multiple/2.0f);
	}
	
	/*public static float roundToMultiple(float multiple, float number) {
		float result;
		if (number % multiple == 0) {
			return number;
		} else {
			
			
			if (number % multiple >= number % multiple/2.0f) {
				result = ceilToMultiple(multiple, number);
			} else {
				result = floorToMultiple(multiple, number);
			}
			
		}
		return result;
	}
	
	public static float ceilToMultiple(float multiple, float number) {
		float result;
		result = (float) Math.floor(number);
		while (true) {
			result++;
			if (result % multiple == 0.0f) {
				break;
			}
		}
		return result;
	}
	
	public static float floorToMultiple(float multiple, float number) {
		float result;
		//if (number % multiple == 0.0f) {
		//	return number;
		//} else {
			result = (float) Math.floor(number);
			while (true) {
				result--;
				if (result % multiple == 0.0f) {
					break;
				}
			}
		//}
		return result;
	}
	
	public static float midPointOfMultiple(float multiple, float number) {
		//TODO write a unit test for this and test
		//positive and negative numbers
		//multiple of 1 and 4
		//numbers > multiple/2
		//numbers < multiple/2
		float result;
		if (number % multiple == multiple/2.0f) {
			return number;
		} else {
			
			
			result = (float) Math.floor(number);
			while (true) {
				if (result % multiple == 0.0f) {
					break;
				} else {
					result--;
				}
			}
			result = result + multiple/2.0f;
			
		}
		return result;
	}*/
	
}
