package model; 

public final class Human extends Mammal{

	public Human(String name, double weight, double height, int age) {
		super(name, weight, height, age); 
	}

	
	public String communication(){
		String msj = " HUMAN \n \n"+
		" NAME   : "+name+"\n"+
		" WEIGHT : "+super.getWeight()+"\n"+
		" HEIGHT : "+height+"\n"+
		" AGE    : "+age;
		return msj;
	}

	public String test(){
		String msj = "\n EMPANADA CON QUESO, SIN PAPA";
		return msj;
	}


}