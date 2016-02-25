package game.view;

import java.awt.Color;
import java.awt.event.*;

import game.controller.GameController;

import javax.swing.*;

public class OptionsPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JCheckBox showHintBox;
		private JCheckBox limitGuessesBox;
		private JCheckBox hideGuessesBox;
		private JCheckBox showCounter;

		public OptionsPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();

				showHintBox = new JCheckBox("Show Higher/Lower Hints");
				limitGuessesBox = new JCheckBox("Limit Guesses");
				hideGuessesBox = new JCheckBox("Hide Your Guesses");
				showCounter = new JCheckBox("Hide the Guess Counter");
				
				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(198, 253, 255));
				setLayout(baseLayout);
				
				add(showHintBox);
				add(limitGuessesBox);
				add(hideGuessesBox);
				add(showCounter);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.WEST, limitGuessesBox, 5, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.WEST, showHintBox, 0, SpringLayout.WEST, limitGuessesBox);
				baseLayout.putConstraint(SpringLayout.SOUTH, showHintBox, -6, SpringLayout.NORTH, limitGuessesBox);
				baseLayout.putConstraint(SpringLayout.WEST, hideGuessesBox, 5, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, limitGuessesBox, -6, SpringLayout.NORTH, hideGuessesBox);
				baseLayout.putConstraint(SpringLayout.NORTH, showCounter, 103, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, showCounter, 5, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, hideGuessesBox, -6, SpringLayout.NORTH, showCounter);
			}

		private void buildListeners()
			{
				
			}
	}
