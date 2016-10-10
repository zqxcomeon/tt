package factory;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class AnimalFactory {
	final String DOG = "dog";
	final String CAT = "cat";
	Animal animal;
	
	public Animal getAnimal(String type) {
		if (type.equals(DOG)) {
			animal = new Dog();
		} else if (type.equals(CAT)) {
			animal = new Cat();
		} else {
			animal = null;
		}
		
		return animal;
	}
	
	public Animal getDog(){
		return new Dog();
	}
	
	public Animal getCat() {
		return new Cat();
	}
}
