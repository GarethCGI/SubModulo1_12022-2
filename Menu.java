import java.util.ArrayList;
import java.util.Scanner;
class Menu {
	private Scanner keyboard = new Scanner(System.in);
	// Request Integers
	public Integer[] getIntList(){
		ArrayList<Integer> dynList = new ArrayList<Integer>();
		dynList.add(this.getSingleInt());
		return dynList.toArray(new Integer[0]);
	}
	public int getSingleInt(){
		try{
			return keyboard.nextInt();
		}catch(Exception e){
			this.fancyPrint(" That's not a number ");
			keyboard.nextLine();
			return this.getSingleInt();
		}
	}
	// Request Floats
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