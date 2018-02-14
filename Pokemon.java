// Name: James Moise
// UFL ID: 5441-9893
// Section: 0398
// Project Number: 4
// Brief description of file contents: Using arrays and objects to create a Pokedex program
public class Pokemon {
	
	//The data fields for a Pokemon object
	String species;
	int attack;
	int defense;
	int speed;
	
	//Constructor that initializes all 4 fields of a Pokemon object
	public Pokemon(String spc) {
		species = spc;
		attack = (spc.length() * 4) + 2;
		defense = (spc.length() * 2) + 7;
		speed = (spc.length() * 3) + 5;
	}
	
	//Modifier method that increases attack
	public void grow(int boost) {
		attack += boost;
	}
	
	//Modifier method that increases defense
	public void harden(int boost) {
		defense += boost;
	}
	
	//Modifier method that increases speed
	public void haste(int boost) {
		speed += boost;
	}
	
	//Returns the String contained by the species data field
	public String getSpecies() {
		return species;
	}
	
	//Sets the species data field to a String passed into the setSpecies method
	public void setSpecies(String spc) {
		species = spc;
	}
	
	//Returns the integer value contained by the attack data field
	public int getAttack() {
		return attack;
	}
	
	//Sets the attack data field to an integer value passed into the setAttack method
	public void setAttack(int atk) {
		attack = atk;
	}
	
	//Returns the integer value contained by the defense data field
	public int getDefense() {
		return defense;
	}
	
	//Sets the defense data field to an integer value passed into the setDefense method
	public void setDefense(int def) {
		defense = def;
	}
	
	//Returns the integer value contained by the speed data field
	public int getSpeed() {
		return speed;
	}
	
	//Sets the speed data field to an integer value passed into the setSpeed method
	public void setSpeed(int spd) {
		speed = spd;
	}
}
