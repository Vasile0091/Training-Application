package mainPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RunningWindow extends WindowCreator{

	public RunningWindow() {
		
		super("Running");
	}

	void createMainPanel() {
		// TODO Auto-generated method stub
		
	}

	void setMainFrameProperties() {
		// TODO Auto-generated method stub
		mainFrame.setSize(600, 400);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(new GridLayout(3, 1,50,35));
	}

	void createHeaderPanel() {
		// TODO Auto-generated method stub
		headerPanel.add(new JLabel("Set your running plan:",JLabel.LEFT));
	}

	void createBottomPanel() {
		// TODO Auto-generated method stub
		
		JButton cancelButton = new JButton("Cancel");
		JButton saveButton = new JButton("Save");
		
		/*Set action for buttons*/
		cancelButton.setActionCommand("cancel");
		saveButton.setActionCommand("saveWorkout");

		/*Add listeners for this buttons */
		//TODO 
		
		/*Add buttons to the panel*/
		bottomPanel.add(cancelButton);
		bottomPanel.add(saveButton);
	}



	
}
