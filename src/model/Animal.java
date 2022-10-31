package model;

public abstract class Animal{
	
	private double weight;
	protected double height;
	protected int age; 

	public Animal(double weight, double height, int age) {
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}
	public int getAge(){
		return age;
	}



	

}