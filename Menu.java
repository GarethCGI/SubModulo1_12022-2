import java.util.ArrayList;
import java.util.Scanner;
class Menu {
	private Scanner keyboard = new Scanner(System.in);
	// Request Integers
	public int getInt(){
		try{
			return keyboard.nextInt();
		}catch(Exception e){
			this.fancyPrint(" That's not a number ");
			keyboard.nextLine();
			return this.getInt();
		}
	}
	public Integer[] getIntList(){
		ArrayList<Integer> dynList = new ArrayList<Integer>();
		dynList.add(this.getInt());
		return dynList.toArray(new Integer[0]);
	}
	// Request Floats
	public float getFloat(){
		try{
			return keyboard.nextFloat();
		}catch(Exception e){
			this.fancyPrint(" That's not a decimal number ");
			keyboard.nextLine();
			return this.getFloat();
		}
	}
	public Float[] getFloatList(){
		ArrayList<Float> dynList = new ArrayList<Float>();
		dynList.add(this.getFloat());
		return dynList.toArray(new Float[0]);
	}
	// Printing
	public void printMenu(){
		System.out.println("-----------------");
		System.out.println("-     Menu      -");
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