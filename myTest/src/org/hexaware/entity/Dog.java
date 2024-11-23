package org.hexaware.entity;

public class Dog extends Pet{
	 private String dogBreed;

	public Dog(String name, int age, String type,int availableForAdoption,String dogBreed) {
		super(name, age, type,availableForAdoption);
		this.dogBreed=dogBreed;
		}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	@Override
	public String toString() {
		return super.toString() + ", DogBreed=" + dogBreed + "]";
	}
	
	 
}
