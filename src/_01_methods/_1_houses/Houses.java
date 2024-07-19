package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();

	Random bob = new Random();
	public void run() {
		rob.hide();
		rob.setSpeed(100);
		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		for (int i = 0; i < 10; i++) {
			drawHouse("large");
		}
	}

	void drawHouse(int height) {
		rob.move(height);
		drawPointRoof();
		rob.move(height);
		rob.setPenColor(Color.green.darker().darker());
		rob.turn(-90);
		rob.move(10);
		rob.turn(-90);
		rob.setPenColor(Color.black);
	}
	void drawHouse(String height) {
		if(height.equals("small")){
			drawHouse(60);
		}
		if(height.equals("medium")){
			drawHouse(120);
		}
		if(height.equals("large")){
			drawHouse(250);
		}
		
	}
	void drawFlatRoof() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
	void drawPointRoof() {
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
	}
}
