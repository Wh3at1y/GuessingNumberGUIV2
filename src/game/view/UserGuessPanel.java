package game.view;

import java.awt.Color;
import java.awt.event.*;

import game.controller.GameController;

import javax.swing.*;

public class UserGuessPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private GUIFonts font;

		private JTextArea showGuessArea;
		private JScrollPane scrollPane;
		private JButton clearGuesses;
		
		public UserGuessPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();
				font = new GUIFonts();
				
				showGuessArea = new JTextArea();
				showGuessArea.setText("Your Guesses:");
				showGuessArea.setEditable(false);
				showGuessArea.setFont(font.boldFont());
				scrollPane = new JScrollPane(showGuessArea);
				
				clearGuesses = new JButton("Clear Guesses");
				clearGuesses.setFont(font.slimFont());
				
				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(198, 253, 255));
				setLayout(baseLayout);
				
				add(scrollPane);
				add(clearGuesses);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.NORTH, clearGuesses);
				baseLayout.putConstraint(SpringLayout.EAST, clearGuesses, -10, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.WEST, clearGuesses, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, clearGuesses, -10, SpringLayout.SOUTH, this);
			}

		private void buildListeners()
			{
				clearGuesses.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							showGuessArea.setText("Your Guesses: ");
						}
					});
			}
		
		public JTextArea getShowGuessArea()
		{
			return showGuessArea;
		}
	}
