package DAO;

import entity.Pet;

public interface PetShelter {
		boolean addPet(Pet pet);
		boolean removePet(int petId);
		int listAvailablePets();
}
