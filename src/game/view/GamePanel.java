package game.view;

import java.awt.event.*;
import game.controller.GameController;
import javax.swing.*;

public class GamePanel extends JPanel
	{
		// Base Layout
		private SpringLayout baseLayout;

		// Imported Classes
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
				userInputPanel = new UserInputPanel(baseController);
				userGuessesPanel = new UserGuessPanel(baseController);
				displayInfoPanel = new DisplayInfoPanel(baseController);
				optionsPanel = new OptionsPanel(baseController);
				updateUserPanel = new UpdateUserPanel(baseController);

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setLayout(baseLayout);
				add(diffPanel);
				add(userInputPanel);
				add(userGuessesPanel);
				add(displayInfoPanel);
				add(optionsPanel);
				add(updateUserPanel);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, diffPanel, 0, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, diffPanel, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, diffPanel, 100, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, diffPanel, 0, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, userInputPanel, 0, SpringLayout.SOUTH, diffPanel);
				baseLayout.putConstraint(SpringLayout.WEST, userInputPanel, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, userInputPanel, -300, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, userInputPanel, 0, SpringLayout.EAST, diffPanel);
				baseLayout.putConstraint(SpringLayout.NORTH, userGuessesPanel, 0, SpringLayout.SOUTH, userInputPanel);
				baseLayout.putConstraint(SpringLayout.WEST, userGuessesPanel, 400, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, userGuessesPanel, 0, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, userGuessesPanel, 0, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, displayInfoPanel, 0, SpringLayout.SOUTH, userInputPanel);
				baseLayout.putConstraint(SpringLayout.WEST, displayInfoPanel, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, displayInfoPanel, 0, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, displayInfoPanel, 0, SpringLayout.WEST, optionsPanel);
				baseLayout.putConstraint(SpringLayout.NORTH, optionsPanel, 150, SpringLayout.SOUTH, userInputPanel);
				baseLayout.putConstraint(SpringLayout.WEST, optionsPanel, 200, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, optionsPanel, 0, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, optionsPanel, 0, SpringLayout.WEST, userGuessesPanel);
				baseLayout.putConstraint(SpringLayout.NORTH, updateUserPanel, 0, SpringLayout.SOUTH, userInputPanel);
				baseLayout.putConstraint(SpringLayout.WEST, updateUserPanel, 0, SpringLayout.WEST, optionsPanel);
				baseLayout.putConstraint(SpringLayout.SOUTH, updateUserPanel, 0, SpringLayout.NORTH, optionsPanel);
				baseLayout.putConstraint(SpringLayout.EAST, updateUserPanel, 0, SpringLayout.WEST, userGuessesPanel);

			}
	}
