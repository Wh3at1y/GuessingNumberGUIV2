package game.controller;

import game.model.*;
import game.view.*;

public class GameController
	{
		private GameFrame baseFrame;
		private GenerateNumbers genNumber;
		private Easy easyDiff;

		public GameController()
			{
				baseFrame = new GameFrame(this);
				genNumber = new GenerateNumbers();
				easyDiff = new Easy();
			}

		public void start()
			{
			}

		public void checkDifficulty()
			{
				String difficulty = this.getDiffPanel().getDifficulty();

				if (difficulty.equals("easy"))
					{
						easyDiff.updateSettings();
					}
				else if (difficulty.equals("normal"))
					{

					}
				else if (difficulty.equals("hard"))
					{

					}
				else if (difficulty.equals("extreme"))
					{

					}
				else
					{

					}
			}

		public GenerateNumbers getGenNumbers()
			{
				return genNumber;
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
