import java.util.ArrayList;
import java.util.Scanner;
class Menu {
	private Scanner keyboard = new Scanner(System.in);
	private String[] options;
	// Setting values
	public void setOptions(String[] o){
		this.options = o;
	}
	// Request Integers
	public int getInt(Boolean allowZero){
		int inputN;
		try{
			inputN = keyboard.nextInt();
			if( !allowZero && (inputN <= 0)){
				this.fancyPrint(" Invalid Number ");
				return this.getInt(allowZero);
			}
			else{
				return inputN;
			}
		}catch(Exception e){
			this.fancyPrint(" That's not a number ");
			keyboard.nextLine();
			return this.getInt(allowZero);
		}
	}
	public Integer[] getIntList(int qtty, Boolean allowZero){
		ArrayList<Integer> dynList = new ArrayList<Integer>();
		for (int i =0; i < qtty;i++){
			dynList.add(this.getInt(allowZero));
		}
		return dynList.toArray(new Integer[0]);
	}
	// Request Floats
	public float getFloat(Boolean allowZero){
		float inputN;
		try{
			inputN = keyboard.nextFloat();
			if( !allowZero && (inputN <= 0)){
				this.fancyPrint(" Invalid Number ");
				return this.getInt(allowZero);
			}
			else{
				return inputN;
			}
		}catch(Exception e){
			this.fancyPrint(" That's not a decimal number ");
			keyboard.nextLine();
			return this.getFloat(allowZero);
		}
	}
	public Float[] getFloatList(int qtty, Boolean allowZero){
		ArrayList<Float> dynList = new ArrayList<Float>();
		for (int i =0; i < qtty;i++){
			dynList.add(this.getFloat(allowZero));
		}
		return dynList.toArray(new Float[0]);
	}
	// Printing
	public void printMenu(){
		System.out.println("-----------------");
		for (int i =0; i < options.length;i++){
			System.out.println(options[i]);
		}
		System.out.println("-----------------");
	}
	public void printHeader(){
		System.out.println("----------------->>------------------");
		System.out.println("- Contreras González Gareth Esaú	-");
		System.out.println("- 3APV								-");
		System.out.println("- Submódulo 1: Metodología espiral	-");
		System.out.println("- para dessarrollo de software		-");
		System.out.println("----------------->>------------------");
	}
	public void fancyPrint(String s){
		System.out.println("-----------------");
		System.out.println(s);
		System.out.println("-----------------");
	}
	public void multifancyPrint(String[] sa){
		System.out.println("-----------------");
		for (int i =0; i < sa.length;i++){
			System.out.println(sa[i]);
		}
		System.out.println("-----------------");
	}
	public void clearScreen(){
		try {
			new ProcessBuilder("clear").inheritIO().start().waitFor();
		} catch(Exception e) {
			System.out.println("Couldn't clear Screen");
		}
	}
}
/*	Class created by GarethCG
 *	Do not copy
 *	Please
 *	Please...
*/