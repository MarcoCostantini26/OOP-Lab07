/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	BASKET(Place.OUTDOOR, 5, "Basket"), 
	VOLLEY(Place.INDOOR, 6, "Volley"),
	TENNIS(Place.OUTDOOR, 1, "Tennis"),
	BIKE(Place.OUTDOOR, 1, "Bike"),
	F1(Place.OUTDOOR, 1, "F1"),
	MOTOGP(Place.OUTDOOR, 1, "MotoGP"),
	SOCCER(Place.OUTDOOR, 11, "Soccer");
	
	private int numberOfMembers;
	private String nameOfSport;
	private Place place;
	
	Sport(final Place place, final int numberOfMembers, String name){
		this.numberOfMembers = numberOfMembers;
		this.nameOfSport = name;
		this.place = place;
	}
	
	public boolean isIndividualSport() {
		return this.getNumberOfMembers() == 1;
	}
	
	public boolean isIndoorSport() {
		return this.getPlace() == Place.INDOOR;
	}
	
	public String toString() {
		return "Name: " + this.getNameOfSport() + "Members: " + this.getNumberOfMembers() + "Place: " + this.getPlace();
	}
	
	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public String getNameOfSport() {
		return nameOfSport;
	}

	public void setNameOfSport(String nameOfSport) {
		this.nameOfSport = nameOfSport;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
}
