package game.view;

import java.awt.event.*;
import java.awt.*;

import game.controller.GameController;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private GameController baseController;
		private SpringLayout baseLayout;
		private GUIFonts font;
		
		private JButton easyButton;
		private JButton normalButton;
		private JButton hardButton;
		private JButton extremeButton;
		private JButton impossibleButton;

		public DifficultyPanel(GameController baseController)
			{
				this.baseController = baseController;
				
				baseLayout = new SpringLayout();
				font = new GUIFonts();
				
				easyButton = new JButton("Easy");
				easyButton.setFont(font.slimFont());
				
				normalButton = new JButton("Normal");
				normalButton.setFont(font.slimFont());
				
				hardButton = new JButton("Hard");
				hardButton.setFont(font.slimFont());
				
				extremeButton = new JButton("Extreme");
				extremeButton.setFont(font.slimFont());
				
				impossibleButton = new JButton("Impossible.");
				impossibleButton.setFont(font.impossibleFont());
				
				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(190, 234, 249));
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
							baseController.getDisplayInfoPanel().setGameInfotext("Easy", "1-50");
						}
					});
			}
	}
