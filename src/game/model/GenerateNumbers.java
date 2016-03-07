package game.model;

public class GenerateNumbers
	{
		private int generatedNumber;
		
		public int generateEasy()
		{
			generatedNumber = 0;
			generatedNumber = (int) (Math.random() * 51);
			return generatedNumber;
		}
	}
