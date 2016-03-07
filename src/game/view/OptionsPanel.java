package game.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import game.controller.GameController;
import javax.swing.*;

public class OptionsPanel extends JPanel
	{
		private GameController baseController;

		private SpringLayout baseLayout;
		private GUIFonts font;

		private JCheckBox showHintBox;
		private JCheckBox limitGuessesBox;
		private JCheckBox hideGuessesBox;
		private JCheckBox showCounter;

		public OptionsPanel(GameController baseController)
			{
				this.baseController = baseController;

				baseLayout = new SpringLayout();
				font = new GUIFonts();

				showHintBox = new JCheckBox("Show Guess Helper");
				showHintBox.setFont(font.slimFont());
				showHintBox.setSelected(true);

				limitGuessesBox = new JCheckBox("Limit Guesses");
				limitGuessesBox.setFont(font.slimFont());
				limitGuessesBox.setSelected(false);

				hideGuessesBox = new JCheckBox("Show Your Guesses");
				hideGuessesBox.setFont(font.slimFont());
				hideGuessesBox.setSelected(true);

				showCounter = new JCheckBox("Show the Guess Counter");
				showCounter.setFont(font.slimFont());
				showCounter.setSelected(true);

				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setBackground(new Color(198, 253, 255));
				setLayout(baseLayout);

				add(showHintBox);
				add(limitGuessesBox);
				add(hideGuessesBox);
				add(showCounter);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.WEST, limitGuessesBox, 5, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.WEST, showHintBox, 0, SpringLayout.WEST, limitGuessesBox);
				baseLayout.putConstraint(SpringLayout.SOUTH, showHintBox, -6, SpringLayout.NORTH, limitGuessesBox);
				baseLayout.putConstraint(SpringLayout.WEST, hideGuessesBox, 5, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, limitGuessesBox, -6, SpringLayout.NORTH, hideGuessesBox);
				baseLayout.putConstraint(SpringLayout.NORTH, showCounter, 103, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, showCounter, 5, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, hideGuessesBox, -6, SpringLayout.NORTH, showCounter);
			}

		private void buildListeners()
			{
				showHintBox.addItemListener(new ItemListener()
					{
						public void itemStateChanged(ItemEvent checked)
							{
								if (showHintBox.isSelected())
									baseController.getUpdateUserPanel().getUpdateUserText().setVisible(true);
								else
									baseController.getUpdateUserPanel().getUpdateUserText().setVisible(false);
							}
					});

				showCounter.addItemListener(new ItemListener()
					{
						public void itemStateChanged(ItemEvent checked)
							{
								if (showCounter.isSelected())
									baseController.getUpdateUserPanel().getGuessCounterText().setVisible(true);
								else
									baseController.getUpdateUserPanel().getGuessCounterText().setVisible(false);
							}
					});

				hideGuessesBox.addItemListener(new ItemListener()
					{
						public void itemStateChanged(ItemEvent checked)
							{
								if (hideGuessesBox.isSelected())
									baseController.getUserGuessPanel().getShowGuessArea().setVisible(true);
								else
									baseController.getUserGuessPanel().getShowGuessArea().setVisible(false);
							}
					});

				limitGuessesBox.addItemListener(new ItemListener()
					{
						public void itemStateChanged(ItemEvent checked)
							{
								if (limitGuessesBox.isSelected())
									baseController.getDisplayInfoPanel().getLimitText().setVisible(true);
								else
									baseController.getDisplayInfoPanel().getLimitText().setVisible(false);
							}
					});
			}

		public JCheckBox getShowHintBox()
			{
				return showHintBox;
			}

		public JCheckBox getLimitGuessesBox()
			{
				return limitGuessesBox;
			}

		public JCheckBox getHideGuessesBox()
			{
				return hideGuessesBox;
			}

		public JCheckBox getShowCounter()
			{
				return showCounter;
			}

	}
