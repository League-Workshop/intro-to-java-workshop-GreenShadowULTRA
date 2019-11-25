package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ree=new Robot();
		ree.hide();
		ree.penDown();
		ree.setPenWidth(500);
		ree.setPenColor(10,255,100);
		ree.setSpeed(200);
		
		for(int i=0;i<4;i++) {
			
			ree.move(200);
			ree.turn(90);
		}
	}
}
