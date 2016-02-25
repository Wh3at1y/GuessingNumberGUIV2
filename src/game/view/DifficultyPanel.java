package game.view;

import java.awt.event.*;
import java.awt.*;

import game.controller.GameController;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JButton easyButton;
		private JButton normalButton;
		private JButton hardButton;
		private JButton extremeButton;
		private JButton impossibleButton;

		public DifficultyPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();

				easyButton = new JButton("Easy");
				normalButton = new JButton("Normal");
				hardButton = new JButton("Hard");
				extremeButton = new JButton("Extreme");
				impossibleButton = new JButton("Impossible.");
				
				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(187, 243, 185));
				setLayout(baseLayout);
				
				add(easyButton);
				add(normalButton);
				add(hardButton);
				add(extremeButton);
				add(impossibleButton);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, easyButton, 10, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, easyButton, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, easyButton, -10, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, easyButton, -480, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, normalButton, 0, SpringLayout.NORTH, easyButton);
				baseLayout.putConstraint(SpringLayout.WEST, normalButton, 6, SpringLayout.EAST, easyButton);
				baseLayout.putConstraint(SpringLayout.SOUTH, normalButton, 0, SpringLayout.SOUTH, easyButton);
				baseLayout.putConstraint(SpringLayout.EAST, normalButton, -364, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.WEST, hardButton, 6, SpringLayout.EAST, normalButton);
				baseLayout.putConstraint(SpringLayout.EAST, hardButton, -242, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, hardButton, 0, SpringLayout.SOUTH, easyButton);
				baseLayout.putConstraint(SpringLayout.NORTH, hardButton, 0, SpringLayout.NORTH, easyButton);
				baseLayout.putConstraint(SpringLayout.NORTH, extremeButton, 0, SpringLayout.NORTH, easyButton);
				baseLayout.putConstraint(SpringLayout.WEST, extremeButton, 6, SpringLayout.EAST, hardButton);
				baseLayout.putConstraint(SpringLayout.SOUTH, extremeButton, 0, SpringLayout.SOUTH, easyButton);
				baseLayout.putConstraint(SpringLayout.WEST, impossibleButton, 480, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.EAST, extremeButton, -6, SpringLayout.WEST, impossibleButton);
				baseLayout.putConstraint(SpringLayout.NORTH, impossibleButton, 0, SpringLayout.NORTH, easyButton);
				baseLayout.putConstraint(SpringLayout.SOUTH, impossibleButton, 0, SpringLayout.SOUTH, easyButton);
				baseLayout.putConstraint(SpringLayout.EAST, impossibleButton, -10, SpringLayout.EAST, this);
			}

		private void buildListeners()
			{
				easyButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							
						}
					});
			}
	}
