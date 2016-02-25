package game.view;

import java.awt.Color;
import java.awt.event.*;

import game.controller.GameController;

import javax.swing.*;

public class DisplayInfoPanel extends JPanel
	{
		private SpringLayout baseLayout;

		private JLabel spacerLabel;
		private JLabel difficultyText;
		private JLabel guessBetweenText;

		public DisplayInfoPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();
				
				spacerLabel = new JLabel("Game-Information");
				baseLayout.putConstraint(SpringLayout.NORTH, spacerLabel, 10, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, spacerLabel, 10, SpringLayout.WEST, this);
				difficultyText = new JLabel("First choose a difficulty!");
				baseLayout.putConstraint(SpringLayout.NORTH, difficultyText, 15, SpringLayout.SOUTH, spacerLabel);
				baseLayout.putConstraint(SpringLayout.WEST, difficultyText, 0, SpringLayout.WEST, spacerLabel);
				guessBetweenText = new JLabel("Numbers to guess between");
				baseLayout.putConstraint(SpringLayout.NORTH, guessBetweenText, 15, SpringLayout.SOUTH, difficultyText);
				baseLayout.putConstraint(SpringLayout.WEST, guessBetweenText, 10, SpringLayout.WEST, this);

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setBackground(new Color(162,255,255));
				setLayout(baseLayout);
				
				add(spacerLabel);
				add(difficultyText);
				add(guessBetweenText);
			}

		private void buildWindow()
			{

			}
	}
