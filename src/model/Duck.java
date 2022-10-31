package model;

public final class Duck extends Bird{

	public Duck(double weight, double height, int age, double wingSpan){
		super(weight, height, age, wingSpan);
	}


	public String communication(){
		String msj = "\n   DUCK  \n"+
		"\n    WEIGHT : "+ this.getWeight()+ " kg"+
		"\n    HEIGHT : "+ height+ " cm"+
		"\n       AGE : "+ age+ " years"+
		"\n WING SPAN : "+ wingSpan+" cm"; 
		return msj;
	}
}