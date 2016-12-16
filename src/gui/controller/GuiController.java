package gui.controller;

import gui.view.GuiFirstFrame;

public class GuiController
{
	private GuiFirstFrame appFrame;
	private GuiController baseController;
	
	public GuiController()
	{
		appFrame = new GuiFirstFrame(this);
		baseController = this;
	}
	public void start(){
		
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}
}
