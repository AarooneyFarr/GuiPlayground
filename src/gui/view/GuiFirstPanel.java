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
		
		setupPanel();
		setupLayout();
		setupListeners();

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
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 0, SpringLayout.NORTH, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 45, SpringLayout.EAST, randomButton);

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
				setBackground(Color.RED);
			}
		});
	}

}
