import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Paddle extends Rectangle {


		
		int id;
		int yVelocity;
		int speed = 10;
		
		Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
			super(x,y,PADDLE_WIDTH, PADDLE_HEIGHT);
			this.id=id;
			
		}
		public void keyPressed(KeyEvent e) {
			switch(id) {
			case 1: 
				if(e.getKeyCode()==KeyEvent.VK_W) {
					setYDirection(-speed);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_S) {
					setYDirection(speed);
					move();
				}
				break;
			case 2:
				if(e.getKeyCode()==KeyEvent.VK_R) {
					setYDirection(-speed);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_F) {
					setYDirection(speed);
					move();
				}
				break;
			}
				
		}
		public void keyReleased(KeyEvent e) {
			switch(id) {
			case 1: 
				if(e.getKeyCode()==KeyEvent.VK_W) {
					setYDirection(0);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_S) {
					setYDirection(0);
					move();
				}
				break;
			case 2:
				if(e.getKeyCode()==KeyEvent.VK_R) {
					setYDirection(0);
					move();
				}
				if(e.getKeyCode()==KeyEvent.VK_F) {
					setYDirection(0);
					move();
				}
				break;
			}
				
		}
		public void setYDirection(int yDirection) {
			yVelocity = yDirection;

		}
		public void move() {
			y = y + yVelocity;
		}
		public void draw(Graphics g) {
			
			if(id==1)
				g.setColor(new Color(0x84c8cf));
			else 
				g.setColor(new Color(0x9734ff));
			g.fillRect(x, y, width, height);
		}
	}
