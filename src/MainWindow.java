package mainPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends WindowCreator{
	
	public MainWindow(){
		
		super("Training application");
	}

	
	void createMainPanel() {
		// TODO Auto-generated method stub
		
		/*Create buttons*/
		JButton workoutButton = new JButton("Workout");
		JButton runningButton = new JButton("Running");
		JButton cyclingButton = new JButton("Cycling");
		
		/*Set action for buttons*/
		workoutButton.setActionCommand("workout");
		runningButton.setActionCommand("running");
		cyclingButton.setActionCommand("cycling");
		
		/*Add listeners for this buttons */
		workoutButton.addActionListener(new ButtonListener());
		runningButton.addActionListener(new ButtonListener());
		cyclingButton.addActionListener(new ButtonListener());		
		
		/*Add buttons to the panel*/
		mainPanel.add(workoutButton);
		mainPanel.add(runningButton);
		mainPanel.add(cyclingButton);
	}

	void setMainFrameProperties() {
		// TODO Auto-generated method stub
		mainFrame.setSize(500, 200);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(new GridLayout(3, 1,50,35));
	}


	void createHeaderPanel() {
		// TODO Auto-generated method stub
		headerPanel.add(new JLabel("Choose your training session:",JLabel.LEFT));
		
	}


	void createBottomPanel() {
		// TODO Auto-generated method stub
		bottomPanel.add(new JLabel("Version 1.0",JLabel.RIGHT));
		
	}
	
	
}
