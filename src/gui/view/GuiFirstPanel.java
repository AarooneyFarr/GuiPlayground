package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiFirstPanel extends JPanel
{
	private GuiController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;

	public GuiFirstPanel(GuiController baseController)
	{
		super();
		this.baseController = baseController;

		colorButton = new JButton("color");
		randomButton = new JButton("random");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, -200, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, -184, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 200, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -171, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -108, SpringLayout.EAST, this);
		
	
		
		setupListeners();
		setupPanel();
		setupLayout();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(colorButton);
		this.add(randomButton);

	}

	private void setupLayout()
	{
		
		
	}
	
	private void randomBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.BLUE);
			}
		});

		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				randomBackground();
			}
		});
	}

}
