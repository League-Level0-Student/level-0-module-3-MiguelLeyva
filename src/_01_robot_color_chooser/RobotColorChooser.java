//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot r2d2 = new Robot();
		r2d2.setPenWidth(10);
		for (int i = 0; i < 10; i++) {
			
		
		String color = JOptionPane.showInputDialog("what color do you want... blue, green, or red?");
		
		if(color.equals("blue")){
			r2d2.setPenColor(Color.BLUE);
		}
		else if(color.equals("green")) {
			r2d2.setPenColor(Color.GREEN);
		}
		else if(color.equals("red")) {
			r2d2.setPenColor(Color.RED);
		}
		else {
			r2d2.setRandomPenColor();
		}
		
		r2d2.setSpeed(200);
		r2d2.turn(180);
		r2d2.move(270);
		r2d2.penDown();
		r2d2.turn(90);
		r2d2.move(440);
		r2d2.turn(90);
		r2d2.move(560);
		r2d2.turn(90);
		r2d2.move(580);
		r2d2.turn(90);
		r2d2.move(520);
		r2d2.turn(90);
		r2d2.move(520);
		r2d2.turn(90);
		r2d2.move(490);
		r2d2.turn(90);
		r2d2.move(480);
		r2d2.turn(90);
		r2d2.move(460);
		r2d2.turn(90);
		r2d2.move(430);
		r2d2.turn(90);
		r2d2.move(430);
		r2d2.turn(90);
		r2d2.move(400);
		r2d2.turn(90);
		r2d2.move(390);
		r2d2.turn(90);
		r2d2.move(380);
		r2d2.turn(90);
		r2d2.move(350);
		r2d2.turn(90);
		r2d2.move(330);
		}
		//1. Create a new Robot
		
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
