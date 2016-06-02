package game.model;

public class GenerateNumbers
	{
		private int generatedNumber;
		
		private void generateEasy()
		{
			generatedNumber = 0;
			generatedNumber = (int) (Math.random() * 51);
		}
		
		public int getEasyNum()
		{
			generateEasy();
			return generatedNumber;
		}
	}
