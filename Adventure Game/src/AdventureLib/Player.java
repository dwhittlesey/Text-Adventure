package AdventureLib;

import java.util.Date;

public class Player {
	
	Date dateCreated  = new Date();
	private String Name = "";
	private int Health = 100;
	private int Stamina = 10;
	private int Perception = 10;
	private int Endurance = 10;
	private int Charisma = 10;
	private int Speed = 10;
	private int Encumberance = 0;
	private int Strength = 10;
	private int Saiety = 100;
	
	
	
	
	
	int getHealth() {
		return Health;
	}
	void setHealth(int health) {
		Health = health;
	}
	int getSaiety() {
		return Saiety;
	}
	void setSaiety(int saiety) {
		Saiety = saiety;
	}
	int getStrength() {
		return Strength;
	}
	void setStrength(int strength) {
		this.Strength = strength;
	}
	int getEncumberance() {
		return Encumberance;
	}
	void setEncumberance(int encumberance) {
		Encumberance = encumberance;
	}
	int getSpeed() {
		return Speed;
	}
	void setSpeed(int speed) {
		Speed = speed;
	}
	int getCharisma() {
		return Charisma;
	}
	void setCharisma(int charisma) {
		Charisma = charisma;
	}
	int getEndurance() {
		return Endurance;
	}
	void setEndurance(int endurance) {
		Endurance = endurance;
	}
	int getPerception() {
		return Perception;
	}
	void setPerception(int perception) {
		Perception = perception;
	}
	int getStamina() {
		return Stamina;
	}
	void setStamina(int stamina) {
		Stamina = stamina;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	
	
	
	

}
