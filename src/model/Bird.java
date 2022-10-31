package model;

public abstract class Bird extends Animal{

	protected double wingSpan;
	public Bird(double weight, double height, int age, double wingSpan){
		super(weight, height, age);
		this.wingSpan = wingSpan;
	}
	public double wingSpan(){
		return wingSpan;
	}

}