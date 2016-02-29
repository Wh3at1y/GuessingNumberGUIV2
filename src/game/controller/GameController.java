package game.controller;

import game.view.DifficultyPanel;
import game.view.DisplayInfoPanel;
import game.view.GameFrame;
import game.view.OptionsPanel;
import game.view.UpdateUserPanel;
import game.view.UserGuessPanel;
import game.view.UserInputPanel;

public class GameController
	{
		private GameFrame baseFrame;
		
		public GameController()
		{
			baseFrame = new GameFrame(this);
		}
		public void start()
		{
		}
		
		public DifficultyPanel getDiffPanel()
		{
			return baseFrame.getBasePanel().getDiffPanel();
		}
		
		public DisplayInfoPanel getDisplayInfoPanel()
		{
			return baseFrame.getBasePanel().getDisplayInfoPanel();
		}
		
		public OptionsPanel getOptionsPanel()
			{
				return baseFrame.getBasePanel().getOptionsPanel();
			}
		
		public UpdateUserPanel getUpdateUserPanel()
			{
				return baseFrame.getBasePanel().getUpdateUserPanel();
			}
		
		public UserGuessPanel getUserGuessPanel()
			{
				return baseFrame.getBasePanel().getUserGuessesPanel();
			}
		
		public UserInputPanel getUserInputPanel()
			{
				return baseFrame.getBasePanel().getUserInputPanel();
			}
	}
