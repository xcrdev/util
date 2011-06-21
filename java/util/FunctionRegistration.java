package com.robledo.util.java.util;

public abstract class FunctionRegistration {

	public abstract void callback();
	
	//public static void defaultCallback() {
	//}
	
	public final static FunctionRegistration DEFAULT_FUNCTION = new FunctionRegistration() {
		@Override
		public void callback() {
			//empty function
		}
	};
	
}
