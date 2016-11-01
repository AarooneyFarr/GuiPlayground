package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
import java.awt.Dimension;

public class GuiFirstFrame extends JFrame
{
	private GuiController baseController;
	
	public GuiFirstFrame(GuiController baseController)
	{
		super();
		this.baseController = baseController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(new Dimension(400,400));
		this.setVisible(true);
	}
}
