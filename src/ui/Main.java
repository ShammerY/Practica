package ui; 

import model.*; 
import java.util.Scanner;


public class Main{

	public static final int TOTAL_ANIMAL = 10;
	private Scanner reader;
	private Human[] humans;
	private Felidae[] cats;
	private Duck[] ducks;
	private Chicken[] chickens;
	public Main(){
		reader = new Scanner(System.in);
		humans = new Human[TOTAL_ANIMAL];
		cats  = new Felidae[TOTAL_ANIMAL];
		ducks = new Duck[TOTAL_ANIMAL];
		chickens = new Chicken[TOTAL_ANIMAL];
	}

	public static void main(String[] args) {
		Main main = new Main();
		String option = "";
		do{
			option = main.showMenu();
			main.executeOption(option);
		}while(option.equals("0")==false);
		

	}
	public void print(String text){
		System.out.println(text);
	}
	public String showMenu(){
		String option = "";
		print("\n----------------------------------------------\n"+
			"             ANIMAL REGISTRATION              \n"+
			"----------------------------------------------\n"+
			"(1)  Register HUMAN \n"+
			"(2)  Register CAT  \n"+
			"(3)  Register CHICKEN \n"+
			"(4)  Register DUCK \n"+
			"(0)  Exit Program");
		option = reader.next();
		return option;
	}
	public void executeOption(String option){
		String msj = "";
		int pos = -1;

		String animalName = "";
		double animalWeight = 0;
		double animalHeight = 0;
		int animalAge = 0;

		switch(option){
			case "1":
				pos = searchHumanEmptyPos();
				humans[pos] = new Human("Samuel", 70, 185, 19);
				msj = humans[pos].communication();
				print(msj);
				msj = humans[pos].test();
				print(msj);
				break;
			case "2":
				pos = searchCatEmptyPos();
				cats[pos] = new Felidae("Orion", 14, 18, 1);
				msj = cats[pos].communication();
				print(msj);
				
				break;
			case "3":
				pos = searchChickenEmptyPos();
				chickens[pos] = new Chicken(8, 24, 3,20);
				msj = chickens[pos].communication();
				print(msj);
				break;
			case "4":
				pos = searchDuckEmptyPos();
				ducks[pos] = new Duck(12, 32, 5432, 45);
				msj = ducks[pos].communication();
				print(msj);
				break;
			case "0":
				print("\n SEE YOU NEXT TIME :)");
		}
	}
	public int searchHumanEmptyPos(){
		int pos = -1;
		boolean isFound = false;
		for(int i = 0; i<TOTAL_ANIMAL; i++){
			if(humans[i] == null && isFound==false){
				pos = i;
				isFound = true;
			}
		}
		return pos;
	}
	public int searchCatEmptyPos(){
		int pos = -1;
		boolean isFound = false;
		for(int i = 0; i<TOTAL_ANIMAL; i++){
			if(cats[i] == null && isFound==false){
				pos = i;
				isFound = true;
			}
		}
		return pos;
	}
	public int searchChickenEmptyPos(){
		int pos = -1;
		boolean isFound = false;
		for(int i = 0; i<TOTAL_ANIMAL; i++){
			if(chickens[i] == null && isFound==false){
				pos = i;
				isFound = true;
			}
		}
		return pos;
	}
	public int searchDuckEmptyPos(){
		int pos = -1;
		boolean isFound = false;
		for(int i = 0; i<TOTAL_ANIMAL; i++){
			if(ducks[i] == null && isFound==false){
				pos = i;
				isFound = true;
			}
		}
		return pos;
	}

}