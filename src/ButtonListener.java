package mainPackage;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class ButtonListener implements ActionListener{

	public void actionPerformed(ActionEvent event) {
		
		String command = event.getActionCommand();
		
		if (command.equals("workout")){
			
			WorkoutWindow workoutWindow = new WorkoutWindow();
			workoutWindow.showWindow();
			
		}else if (command.equals("running")){
			
			RunningWindow runningWindow = new RunningWindow();
			runningWindow.showWindow();
			
		}else if(command.equals("cycling")){
			
			CyclingWindow cyclingWindow = new CyclingWindow();
			cyclingWindow.showWindow();
			
		}else {}
	}

}
