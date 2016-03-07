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
							System.out.println(baseController.getGenNumbers().generateEasy());
							baseController.getDisplayInfoPanel().setGameInfotext("Easy", "0-50");
							baseController.getDisplayInfoPanel().getLimitText().setText("Guess Limit: 30");
							setGameSettings(true, false, true, true);
						}
					});
				
				normalButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							baseController.getDisplayInfoPanel().setGameInfotext("Normal", "0-100");
							baseController.getDisplayInfoPanel().getLimitText().setText("Guess Limit: 25");
							setGameSettings(true, false, true, true);
						}
					});
				
				hardButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							baseController.getDisplayInfoPanel().setGameInfotext("Hard", "0-300");
							baseController.getDisplayInfoPanel().getLimitText().setText("Guess Limit: 20");
							setGameSettings(false, false, true, true);
						}
					});
				
				extremeButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							baseController.getDisplayInfoPanel().setGameInfotext("Extreme", "0-1,000");
							baseController.getDisplayInfoPanel().getLimitText().setText("Guess Limit: 30");
							setGameSettings(false, true, true, false);
						}
					});
				
				impossibleButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							baseController.getDisplayInfoPanel().setGameInfotext("IMPOSSIBLE", "0-10,000");
							baseController.getDisplayInfoPanel().getLimitText().setText("Guess Limit: 50");
							setGameSettings(false, true, false, false);
						}
					});
			}
		
		/**
		 * 
		 * @param guessBox : Show Guess Helper
		 * @param limitGuesses : Limit Guesses
		 * @param showGuesses : Show Your Guesses
		 * @param showGuessCounter : Show Guess Counter
		 */
		private void setGameSettings(boolean guessBox, boolean limitGuesses, boolean showGuesses, boolean showGuessCounter)
		{
			baseController.getOptionsPanel().getShowHintBox().setSelected(guessBox);
			baseController.getOptionsPanel().getLimitGuessesBox().setSelected(limitGuesses);
			baseController.getOptionsPanel().getHideGuessesBox().setSelected(showGuesses);
			baseController.getOptionsPanel().getShowCounter().setSelected(showGuessCounter);
		}
	}
