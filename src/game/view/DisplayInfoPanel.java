package game.view;

import java.awt.Color;
import game.controller.GameController;
import javax.swing.*;

public class DisplayInfoPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private GUIFonts font;

		private JLabel spacerLabel;
		private JLabel difficultyText;
		private JLabel guessBetweenText;

		public DisplayInfoPanel(GameController baseController)
			{
				font = new GUIFonts();
				baseLayout = new SpringLayout();

				spacerLabel = new JLabel("Game-Information");
				spacerLabel.setFont(font.boldFont());
				
				difficultyText = new JLabel("First choose a difficulty!");
				difficultyText.setFont(font.slimFont());
				
				guessBetweenText = new JLabel("Numbers to guess between");
				guessBetweenText.setFont(font.slimFont());
				

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setBackground(new Color(198, 253, 255));
				setLayout(baseLayout);

				add(spacerLabel);
				add(difficultyText);
				add(guessBetweenText);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, spacerLabel, 10, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, spacerLabel, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, difficultyText, 15, SpringLayout.SOUTH, spacerLabel);
				baseLayout.putConstraint(SpringLayout.WEST, difficultyText, 0, SpringLayout.WEST, spacerLabel);
				baseLayout.putConstraint(SpringLayout.NORTH, guessBetweenText, 15, SpringLayout.SOUTH, difficultyText);
				baseLayout.putConstraint(SpringLayout.WEST, guessBetweenText, 10, SpringLayout.WEST, this);
			}

		public void setGameInfotext( String difficultyText, String guessBetweenText)
			{
				this.difficultyText.setText("Difficulty: " + difficultyText);
				this.guessBetweenText.setText("Guess Between: " + guessBetweenText);
			}
	}
