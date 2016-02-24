package game.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import game.controller.GameController;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private SpringLayout baseLayout;

		public DifficultyPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();

				buildPanel();
				buildWindow();
				//buildListeners();
			}

		private void buildPanel()
			{
				setBackground(Color.RED);
				setLayout(baseLayout);
			}

		private void buildWindow()
			{

			}

		private void buildListeners()
			{
				tempAdd.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							
						}
					});
			}
	}
