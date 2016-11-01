package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;


public class GuiFirstPanel extends JPanel
{
	private GuiController baseController;
	
	public GuiFirstPanel(GuiController baseController)
	{
		super();
		this.baseController = baseController;
		
	}
}
