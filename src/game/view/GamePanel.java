package game.view;

import java.awt.event.*;
import game.controller.GameController;
import javax.swing.*;

public class GamePanel extends JPanel
	{
		//Base Layout
		private SpringLayout baseLayout;
		
		//Imported Classes
		private DifficultyPanel diffPanel;
		private UserInputPanel userInputPanel;
		private UserGuessPanel userGuessesPanel;
		private DisplayInfoPanel displayInfoPanel;
		private OptionsPanel optionsPanel;
		private UpdateUserPanel updateUserPanel;

		public GamePanel(GameController baseController)
			{
				baseLayout = new SpringLayout();
				
				diffPanel = new DifficultyPanel(baseController);
				baseLayout.putConstraint(SpringLayout.NORTH, diffPanel, 0, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, diffPanel, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, diffPanel, 100, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, diffPanel, 0, SpringLayout.EAST, this);
				userInputPanel = new UserInputPanel(baseController);
				userGuessesPanel = new UserGuessPanel(baseController);
				displayInfoPanel = new DisplayInfoPanel(baseController);
				optionsPanel = new OptionsPanel(baseController);
				updateUserPanel = new UpdateUserPanel(baseController);

				buildPanel();
				buildWindow();
				//buildListeners();
			}

		private void buildPanel()
			{
				setLayout(baseLayout);
				add(diffPanel);
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
