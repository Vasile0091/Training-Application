package mainPackage;

/*import java.awt.*;
import java.awt.event.*;*/
import javax.swing.*;

public abstract class  WindowCreator {

	public JFrame mainFrame;
	public JPanel headerPanel;
	public JPanel mainPanel;
	public JPanel bottomPanel;
	
	/*Constructor*/
	public WindowCreator(String windowName){
		
		mainFrame 	= new JFrame(windowName);
		headerPanel = new JPanel();
		mainPanel 	= new JPanel();
		bottomPanel = new JPanel();
		
		createWindow();
	}
	
	/*Create all the window design*/
	void createWindow(){
		
		setMainFrameProperties();
		
		createHeaderPanel();
		createMainPanel();
		createBottomPanel();
		
		mainFrame.add(headerPanel);
		mainFrame.add(mainPanel);
		mainFrame.add(bottomPanel);
	}
	
	/*Create the header label*/
	abstract void createHeaderPanel();
	
	/*Create the main panel*/
	abstract void createMainPanel();
	
	/*Create the bottom label*/
	abstract void createBottomPanel();
	
	/*Set the main window/frame properties*/
	abstract void setMainFrameProperties();
	
	void showWindow() {
		mainFrame.setVisible(true);
	};

	void closeWindow() {
		mainFrame.setVisible(false);
	}
	
}
