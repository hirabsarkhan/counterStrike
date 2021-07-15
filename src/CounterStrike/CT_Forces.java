package CounterStrike;

public class CT_Forces extends bots{

	
	//has a relationship , 
		private String name;
		private String botnamePrefix;
		private int appearance;
		
		//eencapsulation : the private variables can only be accesssed by public getter settter methods
		public String getName() {
		 	return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBotnamePrefix() {
			return botnamePrefix;
		}

		public void setBotnamePrefix(String botnamePrefix) {
			this.botnamePrefix = botnamePrefix;
		}

		public int getAppearance() {
			return appearance;
		}

		public void setAppearance(int appearance) {
			this.appearance = appearance;
		}
	@Override
	void bomb() {
		System.out.println("difuse the bomb");
		
	}

	@Override
	void useWeapon() {
		System.out.println("kill counter terrosists");
		
	}

	@Override
	void getsKilled() {
		System.out.println("health decrease and dies");
		//the score of the opponent team/ terrorists increases
		ScoreBoard.tforces_score = ScoreBoard.tforces_score + 1; 
		
	}

}
