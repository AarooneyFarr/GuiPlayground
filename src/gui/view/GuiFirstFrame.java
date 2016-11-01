package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
import java.awt.Dimension;

public class GuiFirstFrame extends JFrame
{
	private GuiController baseController;
	private GuiFirstPanel appPanel;
	
	public GuiFirstFrame(GuiController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new GuiFirstPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("WOW A Window!");
		this.setSize(new Dimension(400,400));
		this.setVisible(true);
		
	}
}
