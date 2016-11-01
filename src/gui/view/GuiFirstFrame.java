package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class GuiFirstFrame extends JFrame
{
	private GuiController baseController;
	
	public GuiFirstFrame(GuiController baseController)
	{
		super();
		this.baseController = baseController;
	}
}
