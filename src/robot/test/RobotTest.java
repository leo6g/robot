package robot.test;

public class RobotTest {

	public static void main(String[] args) {
//		MyRobot.move("D:\\robot\\robot\\inputMark.png",20,20);
		
//		MyRobot.click("D:\\robot\\robot\\HardWareId1.png",256,13);
		
		ClipboardUtil.setSysClipboardText("06E1FA-1575AD-EC2A2D-E1BCFA");
		MyRobot.click(328, 363);
		MyRobot.paste(0);
//		MyRobot.click("D:\\robot\\robot\\Generate.png",108,182);
//		MyRobot.click("D:\\robot\\robot\\copy.png");
//		MyRobot.move(0, 0);
		String aText =ClipboardUtil.getSysClipboardText();
		System.out.println(aText);
		//WAIT_IMG("D:\\inputMark1.png");
		//CLICK("D:\\inputMark1.png",227,81);
		//DO("D:\\paste.xml");
		//CLICK("D:\\inputMark1.png",232,138);

//		MyRobot.click(404,446);
//		MyRobot.selectAll();
//		MyRobot.copy();
//		MyRobot.click(404,446);
//		MyRobot.paste();
//		MyRobot.selectAll();
//		MyRobot.del(2);
	}

}
