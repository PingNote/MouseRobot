package idv.PN_Wu;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;

public class Robot {

	static final int DefaultDelay = 10;

	static java.awt.Robot robot;
	static final int BUTTON1_MASK, BUTTON2_MASK, BUTTON3_MASK;
	static int ms = DefaultDelay;
	static {
		try {
			robot = new java.awt.Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BUTTON1_MASK = InputEvent.getMaskForButton(1);
		BUTTON2_MASK = InputEvent.getMaskForButton(2);
		BUTTON3_MASK = InputEvent.getMaskForButton(3);
	}

	public static void mousePress() {
		mousePress(BUTTON1_MASK);
		robot.delay(ms);
	}

	public static void mousePress(int buttons) {
		buttons = mouseSwitchButton(buttons);
		robot.mousePress(buttons);
		robot.delay(ms);
	}

	public static void mouseRelease() {
		mouseRelease(BUTTON1_MASK);
		robot.delay(ms);
	}

	public static void mouseRelease(int buttons) {
		buttons = mouseSwitchButton(buttons);
		robot.mouseRelease(buttons);
		robot.delay(ms);
	}

	public static void mouseClick() {
		mousePress();
		mouseRelease();
	}

	public static void mouseClick(int buttons) {
		buttons = mouseSwitchButton(buttons);
		mousePress(buttons);
		mouseRelease(buttons);
	}

	public static void mouseDoubleClick() {
		mouseClick();
		mouseClick();
	}

	public static void mouseDoubleClick(int buttons) {
		buttons = mouseSwitchButton(buttons);
		mouseClick(buttons);
		mouseClick(buttons);
	}

	public static void mouseMoveTo(int x, int y) {
		robot.mouseMove(x, y);
		robot.delay(ms);
	}

	public static void mouseMove(int x, int y) {
		Point point = MouseInfo.getPointerInfo().getLocation();
		x += point.x;
		y += point.y;
		mouseMoveTo(x, y);
	}

	public static void mouseDragTo(int x, int y) {
		mousePress();
		mouseMoveTo(x, y);
		mouseRelease();
	}

	public static void mouseDragTo(int buttons, int x, int y) {
		buttons = mouseSwitchButton(buttons);
		mousePress(buttons);
		mouseMoveTo(x, y);
		mouseRelease(buttons);
	}

	public static void mouseDrag(int x, int y) {
		mousePress();
		mouseMove(x, y);
		mouseRelease();
	}

	public static void mouseDrag(int buttons, int x, int y) {
		buttons = mouseSwitchButton(buttons);
		mousePress(buttons);
		mouseMove(x, y);
		mouseRelease(buttons);
	}

	public static Color getPixelColor() {
		Point point = MouseInfo.getPointerInfo().getLocation();
		return getPixelColor(point.x, point.y);
	}

	public static Color getPixelColor(int x, int y) {
		return robot.getPixelColor(x, y);
	}

	public static void AutoDelay() {
		ms = robot.getAutoDelay();
	}

	public static int mouseSwitchButton(int buttons) {
		switch (buttons) {
		case 1:
			return BUTTON1_MASK;
		case 2:
			return BUTTON2_MASK;
		case 3:
			return BUTTON3_MASK;
		default:
			return buttons;
		}

	}
}
