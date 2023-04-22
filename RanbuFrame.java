import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class RanbuFrame extends JFrame{

		RanbuPanel panel;

		RanbuFrame() {
			panel = new RanbuPanel();
			
			this.add(panel);
			this.setIconImage(kagura1.getImage());
			this.setTitle("Ranbu Pong");
			this.setResizable(false);
			this.setBackground(Color.black);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
			this.setVisible(true);
			this.setLocationRelativeTo(null);	
		}
	}

