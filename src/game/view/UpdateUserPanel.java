package game.view;

import java.awt.Color;
import game.controller.GameController;
import javax.swing.*;

public class UpdateUserPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private GUIFonts font;
		
		private JLabel updateUserText;
		private JLabel showGuessCounterText;

		public UpdateUserPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();
				font = new GUIFonts();
				
				updateUserText = new JLabel("I am your guess helper!");
				updateUserText.setFont(font.impossibleFont());
				
				showGuessCounterText = new JLabel("Amount of Guesses: 0");
				showGuessCounterText.setFont(font.impossibleFont());
				
				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setBackground(new Color(198, 253, 255));
				setLayout(baseLayout);
				
				add(updateUserText);
				add(showGuessCounterText);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, updateUserText, 10, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, updateUserText, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, showGuessCounterText, 6, SpringLayout.SOUTH, updateUserText);
				baseLayout.putConstraint(SpringLayout.WEST, showGuessCounterText, 10, SpringLayout.WEST, this);
			}
		
		public JLabel getUpdateUserText()
		{
			return updateUserText;
		}
		
		public JLabel getGuessCounterText()
			{
				return showGuessCounterText;
			}
	}
