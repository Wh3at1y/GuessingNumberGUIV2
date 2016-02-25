package game.view;

import java.awt.Color;
import java.awt.event.*;

import game.controller.GameController;

import javax.swing.*;

public class UserInputPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JButton enterAnswer;
		private JTextField userInputField;

		public UserInputPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();
				
				enterAnswer = new JButton("Enter Guess");
				
				userInputField = new JTextField(2);
				

				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(156, 246, 210));
				setLayout(baseLayout);
				
				add(enterAnswer);
				add(userInputField);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.SOUTH, userInputField, -6, SpringLayout.NORTH, enterAnswer);
				baseLayout.putConstraint(SpringLayout.WEST, enterAnswer, 0, SpringLayout.WEST, userInputField);
				baseLayout.putConstraint(SpringLayout.EAST, enterAnswer, 0, SpringLayout.EAST, userInputField);
				baseLayout.putConstraint(SpringLayout.WEST, userInputField, 143, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.EAST, userInputField, -115, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, enterAnswer, 39, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, enterAnswer, 0, SpringLayout.SOUTH, this);
			}

		private void buildListeners()
			{
				enterAnswer.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							
						}
					});
			}
	}
