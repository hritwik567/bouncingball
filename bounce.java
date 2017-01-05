package bouncingball;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*; 
import java.awt.event.*;

public class bounce extends GraphicsProgram{
	private GFace ball;
	private static final double diameter=30;
	private static final double rest=0.9;
	private double yvel=0;
	private double xvel=x_vel;
	private double xcor = 20;
	private double ycor = diameter/2;
	private static final double x_vel=5.0;
	private static final double gravity=1.5;
	private static final double delay=41.6666667;
	public void init(){
		addMouseListeners();
		
	}
	public void mouseClicked(MouseEvent e){
		strt();
	}
	private void strt() {
		setup();
		while(ball.getX()<getWidth()){
			moveforward();
			checkforcollision();
			pause(delay );
		}
	}
	private void setup(){
		ball = new GFace(diameter,diameter);
		add(ball,xcor,ycor);
	}
	private void moveforward(){
		yvel+=gravity;
		ball.move(xvel,yvel);
	}
	private void checkforcollision() {
		if(ball.getY()>getHeight()-diameter){
			yvel=-yvel*rest;
			double diff=ball.getY()-(getHeight()-diameter);
			ball.move(0, -2*diff);
		}
		
	}
	
}
