// Name: James Moise
// UFL ID: 5441-9893
// Section: 0398
// Project Number: 4
// Brief description of file contents: Using arrays and objects to create a Pokedex program
public class Pokedex {
	
	private static Pokemon[] pokemon;
	private static int numberOfPokemon;
	
	//Create a constructor that initializes a Pokedex object based on input from the main method in the Project4 class
	Pokedex(int size) {
		pokemon = new Pokemon[size];
		numberOfPokemon = 0;
	}
	
	//Method returns an array of Strings containing the names of every Pokemon stored in the Pokedex
	public String[] listPokemon() {

		// Make a variable that counts how many pokemon objects are in the
		// pokemon array
		int count = 0;

		// Make a for loop that determines how many pokemon objects are in the
		// pokemon array
		for (int i = 0; i < pokemon.length; i++) {

			// If the value of pokemon[i] is not equal to null, then count++
			if (pokemon[i] != null) {
				count++;
				continue;
			}
			// When pokemon[i] is equal to null, the for loop will end
			else {
				break;
			}

		}
		
		//If count is equal to 0, then that means that the pokemon array is empty
		if (count == 0) {
			return null;
		} 
		else {
			/*
			 * Create an array of Strings that has the appropriate length equal
			 * to the length of the pokemon array with reference variables of objects that do not have
			 * a value of null
			 */
			String[] newList = new String[count];

			/* Assign each index newList[i] in the array newList to the species data field referenced by pokemon[i]*/
			for (int i = 0; i < newList.length; i++) {
				newList[i] = pokemon[i].getSpecies();
			}

			// Returns the array newList
			return newList;
		}
	}
	
	public boolean addPokemon(String species) {
		
		//If numberOfPokemon is equal to the length of the pokemon array, then the pokemon array is full
		if (numberOfPokemon == pokemon.length){
			System.out.println("Max");
			return false;
		}
		
		/*The for loop checks to see if the string that is given is the same as any of 
		the strings contained by the species data fields of the objects in the pokemon array*/
		for(int i = 0; i < pokemon.length; i++) {
			
			//If the reference variable does not equal null
			if (pokemon[i] != null) {
				
				// If this is true for any value i, then "Duplicate" will be
				// printed and the return value will be false
				if (species.toLowerCase().equals(pokemon[i].getSpecies().toLowerCase())) {
					System.out.println("Duplicate");
					return false;
				}
			}
		}
		
		/*The value of the numberOfPokemon data field gets added by one, 
		 * pokemon[numberOfPokemon-1] points to a new initialized object, 
		and the return value is true if conditions are met*/
		numberOfPokemon++;
		pokemon[numberOfPokemon-1] = new Pokemon(species);
		return true;
	}
	
	public int[] checkStats(String species) {
		
		/*Make a variable that will contain the index of the reference variable in the pokemon array that references the species 
		data field with the same String as the parameter variable species*/
		int index = 0;
		
		//Make a for loop
		for(int i = 0; i < pokemon.length; i++) {
			
			if (pokemon[i] != null) {
				
				//The index variable will equal the value of i when species and pokemon[i].species contain the same String
				if (species.equals(pokemon[i].species)) {
					index = i;
					
					/*Initialize an array called stats that contains the values of the attack, defense, and speed data fields 
					of the Pokemon object that has the data field (species) that contains the same String as the 
					paramater variable species*/
					int[] stats = {pokemon[index].attack, pokemon[index].defense, pokemon[index].speed};
					
					//The array of integers called stats is returned
					return stats;
					}
				}
		}
		
		//The value null is returned if species.equals(pokemon[i].species) is never true
		return null;
	}
	
	public void sortPokemon() {
		
		// Make a variable that counts how many pokemon objects are in the
		// pokemon array
		int count = 0;

		// Make a for loop that determines how many pokemon objects are in the
		// pokemon array
		for (int k = 0; k < pokemon.length; k++) {

			// If the value of pokemon[k] is not equal to null, then count++
			if (pokemon[k] != null) {
				count++;
				continue;
			}
			// When pokemon[k] is equal to null, the for loop will end
			else {
				break;
			}

		}
		
		//Make a for loop to sort the pokemon array
		for(int i = 0; i < count-1; i++) {
			
			//Create a reference variable of Pokemon type that references the Pokemon object pokemon[i] 
			Pokemon min = pokemon[i];
			
			//Create an integer variable that will keep track of the index of the object with the String of minimum Unicode value
			int minIndex = i;
			
			
			//Make another for loop to compare object pokemon[i] with other elements of the pokemon array
			for(int j = i + 1; j < count; j++) {
				
				/*If the species data field of min (Pokemon object reference variable) has a String unicode value greater than
				the String unicode value of the species data field of pokemon[j], then min will reference pokemon[j] and
				minIndex will equal the int value held by j*/
				if(min.species.compareToIgnoreCase(pokemon[j].species) > 0) {
					
					min = pokemon[j];
					
					minIndex = j;
				}
			}
			
			/*If minIndex does not have the same value as i, then that means that there is an element (pokemon[minIndex]) in
			the pokemon array that has a species data field with a String unicode value less than the String unicode value 
			contained by the species data field of the element pokemon[i], so the two indexes in the pokemon array will
			switch places*/
			if(minIndex != i) {
				
				pokemon[minIndex] = pokemon[i];
				
				pokemon[i] = min;
			}
		}
	}
}
