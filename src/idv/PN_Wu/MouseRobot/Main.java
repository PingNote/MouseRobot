package idv.PN_Wu.MouseRobot;

public class Main {

	static int SwitchCmd(String arg) {
		String[] cmd = new String[] { "Help", "MouseClick", "MouseDoubleClick",
				"MousePress", "MouseRelease", "MouseMove", "MouseMoveTo",
				"MouseDrag", "MouseDragTo" };
		arg = arg.toLowerCase();
		for (int i = 0; i < cmd.length; i++) {
			if (cmd[i].toLowerCase().equals(arg)) {
				return i;
			}
		}
		return 0; // cmd_Help
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cmd;
		switch (args.length) {
		case 0: // Default: Help
			cmd_Help();
			break;
		case 1: // cmd : no parameter
			cmd = SwitchCmd(args[0]);
			switch (cmd) {
			default:
				cmd_Help();
				break;
			case 1:
				idv.PN_Wu.Robot.mouseClick();
				break;
			case 2:
				idv.PN_Wu.Robot.mouseDoubleClick();
				break;
			case 3:
				idv.PN_Wu.Robot.mousePress();
				break;
			case 4:
				idv.PN_Wu.Robot.mouseRelease();
				break;
			case 5: // MouseMove
			case 6: // MouseMoveTo
			case 7: // MouseDrag
			case 8: // MouseDragTo
				cmd_Help(cmd);
				break;
			}
			break;
		default:
			cmd = SwitchCmd(args[0]);
			switch (cmd) {
			default:
				cmd_Help(args);
				break;
			case 1:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseClick(Integer.parseInt(args[1]));
				else
					cmd_Help(cmd);
				break;
			case 2:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseDoubleClick();
				else
					cmd_Help(cmd);
				break;
			case 3:
				if (args.length == 3)
					idv.PN_Wu.Robot.mousePress(Integer.parseInt(args[1]));
				else
					cmd_Help(cmd);
				break;
			case 4:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseRelease(Integer.parseInt(args[1]));
				else
					cmd_Help(cmd);
				break;
			case 5:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseMove(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]));
				else
					cmd_Help(cmd);
				break;
			case 6:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseMoveTo(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]));
				else
					cmd_Help(cmd);
				break;
			case 7:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseDrag(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]));
				else if (args.length == 4)
					idv.PN_Wu.Robot.mouseDrag(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]),
							Integer.parseInt(args[3]));
				else
					cmd_Help(cmd);
				break;
			case 8:
				if (args.length == 3)
					idv.PN_Wu.Robot.mouseDragTo(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]));
				else if (args.length == 4)
					idv.PN_Wu.Robot.mouseDragTo(Integer.parseInt(args[1]),
							Integer.parseInt(args[2]),
							Integer.parseInt(args[3]));
				else
					cmd_Help(cmd);
				break;
			}
			break;
		}
	}

	static void cmd_Help() { // cmd_Help : no parameter
		/*
			http://docs.oracle.com/javase/7/docs/api/java/awt/Dimension.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/DisplayMode.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/GraphicsConfiguration.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/GraphicsDevice.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/GraphicsEnvironment.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/MouseInfo.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/Point.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/PointerInfo.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/Toolkit.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/event/InputEvent.html
			http://docs.oracle.com/javase/7/docs/api/java/awt/event/MouseEvent.html

			http://www.cjsdn.net/Doc/JDK60/
		*/
	}

	static void cmd_Help(String[] args) {

	}

	static void cmd_Help(int cmd) {
		switch (cmd) {
		default:
			cmd_Help();
			break;
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		}
	}
}
