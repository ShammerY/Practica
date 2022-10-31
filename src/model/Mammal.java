package model; 

public abstract class Mammal extends Animal{

	protected String name;

	public Mammal(String name,double weight, double height, int age) {
		super(weight, height, age); 
		this.name = name;
	}

	public String getName(){
		return this.name; 
	}


}