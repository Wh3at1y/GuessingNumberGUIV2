package game.view;

import java.awt.Color;
import java.awt.event.*;

import game.controller.GameController;

import javax.swing.*;

public class UpdateUserPanel extends JPanel
	{
		private SpringLayout baseLayout;

		public UpdateUserPanel(GameController baseController)
			{
				baseLayout = new SpringLayout();

				buildPanel();
				buildWindow();
				//buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(198, 253, 255));
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
