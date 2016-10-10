package test;

import org.junit.Test;

import factory.AnimalFactory;

public class TestAnimal {

	@Test
	public void testAnimalFactory(){
		AnimalFactory animalFactory= new AnimalFactory();
		
		animalFactory.getAnimal("dog").talk();
		animalFactory.getDog().talk();
		
		animalFactory.getAnimal("cat").talk();
		animalFactory.getCat().talk();
	}
}
