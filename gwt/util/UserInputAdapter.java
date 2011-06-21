package com.robledo.util.gwt.util;
//import static java.lang.Math.cos;
//import static java.lang.Math.sin;

import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.KeyDownHandler;

import com.robledo.util.java.util.FunctionRegistration;

public class UserInputAdapter {

	private int emptySlot = 0;
	private final int REG_TABLE_SIZE = 10;
    private FunctionRegistration[] keyDownCallbackTable = new FunctionRegistration[REG_TABLE_SIZE];
    private FunctionRegistration[] keyUpCallbackTable = new FunctionRegistration[REG_TABLE_SIZE];
    private int[] keyValueTable = new int[REG_TABLE_SIZE];
    private MouseRegistration mouseCallback = null;
    //private MyFocusWidget canvasFocusWidget;
    
    private static UserInputAdapter instance = null;
    
    private UserInputAdapter() {
    }
    
	public static UserInputAdapter getInstance() {
		if (instance == null) {
			assert (false);
		}
		return instance;
	}
    
    public static class MouseEvent {
    	int x;
    	int y;
    	
    	public int getX() {
    		return x;
    	}
    	
    	public int getY() {
    		return y;
    	}
    	
    	public MouseEvent(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
    
    public static abstract class MouseRegistration{
    	public abstract void callback(MouseEvent event);
    }
    
    /*static {
        for (int i = 0; i < REG_TABLE_SIZE; i++) {
        	registrationTable[i] = FunctionRegistration.DEFAULT_FUNCTION;
        	keyTable[i] = 0;        
        }
    }*/
    
	
	private class UserKeyDownHandler implements KeyDownHandler {
		int keyReceived = 0;
		public void onKeyDown(KeyDownEvent event) {
			
			keyReceived = event.getNativeEvent().getKeyCode();
			for (int i = 0; i < emptySlot; i++) {
				if (keyReceived == keyValueTable[i]) {
					keyDownCallbackTable[i].callback();
				}
			}
		}	
	}
	
	private class UserKeyUpHandler implements KeyUpHandler {
		int keyReceived = 0;
		public void onKeyUp(KeyUpEvent event) {
			
			keyReceived = event.getNativeEvent().getKeyCode();
			for (int i = 0; i < emptySlot; i++) {
				if (keyReceived == keyValueTable[i]) {
					keyUpCallbackTable[i].callback();
				}
			}
		}	
	}
	
	private class UserMouseHandler implements MouseMoveHandler {

		@Override
		public void onMouseMove(MouseMoveEvent event) {
			if (mouseCallback != null) { 
				MouseEvent myEvent = new MouseEvent(event.getX(), event.getY());
				mouseCallback.callback(myEvent);
			}
			
		}
		
	}
	
    public static UserInputAdapter initialize(MyFocusWidget canvasFocusWidget) {
    	if (instance == null) {
    		instance = new UserInputAdapter();
    		canvasFocusWidget.addKeyDownHandler(instance.new UserKeyDownHandler());
    		canvasFocusWidget.addKeyUpHandler(instance.new UserKeyUpHandler());
    		canvasFocusWidget.addMouseMoveHandler(instance.new UserMouseHandler());
        	
    	} else {
    		assert (false);
    	}
        return instance;
    }
    
    public void registerKey(
    		int key, 
    		FunctionRegistration keyDown,
    		FunctionRegistration keyUp) {
    	//TODO do not allow registration of a key twice
    	if (emptySlot < REG_TABLE_SIZE) {
    		keyDownCallbackTable[emptySlot] = keyDown;
    		keyUpCallbackTable[emptySlot] = keyUp;
    		keyValueTable[emptySlot] = key;
    		/*if (emptySlot == 0) {
    			canvasFocusWidget.addKeyDownHandler(new UserKeyHandler());
    		}*/
    		emptySlot = emptySlot + 1;
    		
    	} 
    	else {
    		assert(false);
    	}
    }
    
    public void registerMouse(MouseRegistration func) {
    	if (mouseCallback == null) {
    		mouseCallback = func;
    		//canvasFocusWidget.addMouseMoveHandler(new UserMouseHandler());
    	} else {
    		assert(false);
    	}
    	
    }

	

}
