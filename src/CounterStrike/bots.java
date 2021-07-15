package CounterStrike;

abstract class bots  {  ///can have both abstract methods and concrete methods
	
	
	String weapon ; //has a relations ship with bots
	public void jump() {
		System.out.println("the player jumps");
	}
	public void speak() {	 //concrete method		
		System.out.println("the player speaks");
	}
	public void run() {	 //concrete method		
		System.out.println("the player runs");
	}
	public void sit() {	
		System.out.println("the players sits");
	}
	public void stands() {	
		System.out.println("the players stands");
	}

	public void hide() {
		System.out.println("the players hides");
	}
	public void decreasedhealth() {
		System.out.println("the health the of the bot decreases when shot at once");
	}
	
	abstract void getsKilled();
	
	abstract void bomb();  //abstract methods//inplemented according tho the child class
	
	abstract void useWeapon();//inplemented according tho the child class
	
	
}

