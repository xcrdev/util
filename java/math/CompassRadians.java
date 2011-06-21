package com.robledo.util.java.math;

import java.lang.Number;

public class CompassRadians extends Number {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// numbers in java are immutable
	// using final keeps it consistent with other numbers
	private final double value; 
	
	public CompassRadians(double value) {
		if (value < 0 || value >= 2 * Math.PI)
            throw new IllegalArgumentException(value + " is out of range");
       this.value = value;
	}

	public boolean equals(Object obj) {
	    //check for self-comparison
	    if ( this == obj ) return true;

	    //use instanceof instead of getClass here for two reasons
	    //1. if need be, it can match any supertype, and not just one class;
	    //2. it renders an explict check for "that == null" redundant, since
	    //it does the check for null already - "null instanceof [type]" always
	    //returns false. (See Effective Java by Joshua Bloch.)
	    if ( !(obj instanceof CompassRadians) ) return false;
	    //Alternative to the above line :
	    //if ( aThat == null || aThat.getClass() != this.getClass() ) return false;

	    //cast to native object is now safe
	    CompassRadians that = (CompassRadians)obj;

	    //now a proper field-by-field evaluation can be made
	    return
	      this.doubleValue() == that.doubleValue();
	}
	
	public String toString () {
		return String.valueOf(this.doubleValue());
	}
	
	public CompassRadians add(CompassRadians obj) {
		return new CompassRadians(setBetweenZeroAndTwoPi(this.doubleValue() + obj.doubleValue()));
	}
	
	public CompassRadians subtract(CompassRadians obj) {
		return new CompassRadians(setBetweenZeroAndTwoPi(this.doubleValue() - obj.doubleValue()));
	}
	
	public static double setBetweenZeroAndTwoPi(double value) {
		if (value < 0 || value >= 2 * Math.PI) {
			if (value < 0) {
				while (value < 0) {
					value = value + 2 * Math.PI;
				}
			} else if (value >= 2 * Math.PI) {
				while (value >= 2 * Math.PI){
					value = value - 2 * Math.PI;
				}
			}
		}
		//value = value % (2 * Math.PI);  
		return value;
	}
	
	@Override
	public double doubleValue() {
		return this.value;
	}

	@Override
	public float floatValue() {
		return (float) this.value;
	}

	@Override
	public int intValue() {
		return (int) this.value;
	}

	@Override
	public long longValue() {
		return (long) this.value;
	}

}
