package idv.PN_Wu;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class Display {

	static Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
	static GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment
			.getLocalGraphicsEnvironment();

	static {

	}

	public static GraphicsDevice getScreenDevice() {
		return graphicsEnvironment.getDefaultScreenDevice();
	}

	public static GraphicsDevice getScreenDevice(int index) {
		if (--index > -1 && index < getScreenDeviceNumber())
			return getScreenDevices()[index];
		return null;
	}

	public static GraphicsDevice[] getScreenDevices() {
		return graphicsEnvironment.getScreenDevices();
	}

	public static int getScreenDeviceNumber() {
		return getScreenDevices().length;
	}

	public static int getScreenDeviceWidth() {
		return getScreenDevice().getDisplayMode().getWidth();
	}

	public static int getScreenDeviceHeight() {
		return getScreenDevice().getDisplayMode().getHeight();
	}

	public static int getScreenDeviceWidth(int index) {
		if (--index > -1 && index++ < getScreenDeviceNumber())
			return getScreenDevice(index).getDisplayMode().getWidth();
		return 0;
	}

	public static int getScreenDeviceHeight(int index) {
		if (--index > -1 && index++ < getScreenDeviceNumber())
			return getScreenDevice(index).getDisplayMode().getHeight();
		return 0;
	}
}
