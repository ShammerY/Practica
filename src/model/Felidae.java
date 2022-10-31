package model;

public final class Felidae extends Mammal{

	public Felidae(String name,double weight, double height, int age){
		super(name, weight, height, age);
	}


	public String communication(){
		String msj = " KITTY \n \n"+
		" NAME   : "+name+"\n"+
		" WEIGHT : "+this.getWeight()+"\n"+
		" HEIGHT : "+height+"\n"+
		" AGE    : "+age;

		return msj;
	}
}