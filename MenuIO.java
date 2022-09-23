import java.util.ArrayList;
import java.util.Scanner;

class MenuIO {
	private Scanner keyboard = new Scanner(System.in);
	private String[] options;

	// Setting values
	public void setOptions(String[] o) {
		this.options = o;
	}

	// MenuIO
	public int getOption(Boolean allowOverflow, Boolean allowInvalid) {
		this.printMenu();
		int option = this.getInt(allowInvalid);
		if (option > options.length && !allowOverflow) {
			this.fancyPrint(" Invalid option selected ");
			return this.getOption(allowInvalid, allowOverflow);
		}
		return option;
	}

	// Request Integers
	public int getInt(Boolean allowInvalid) {
		int inputN;
		try {
			inputN = keyboard.nextInt();
			if (!allowInvalid && (inputN <= 0)) {
				this.fancyPrint(" Invalid Number ");
				return this.getInt(allowInvalid);
			} else {
				return inputN;
			}
		} catch (Exception e) {
			this.fancyPrint(" That's not a number ");
			keyboard.nextLine();
			return this.getInt(allowInvalid);
		}
	}

	public Integer[] getIntList(int qtty, Boolean allowInvalid) {
		ArrayList<Integer> dynList = new ArrayList<Integer>();
		for (int i = 0; i < qtty; i++) {
			dynList.add(this.getInt(allowInvalid));
		}
		return dynList.toArray(new Integer[0]);
	}

	// Request Floats
	public float getFloat(Boolean allowInvalid) {
		float inputN;
		try {
			inputN = keyboard.nextFloat();
			if (!allowInvalid && (inputN <= 0)) {
				this.fancyPrint(" Invalid Number ");
				return this.getInt(allowInvalid);
			} else {
				return inputN;
			}
		} catch (Exception e) {
			this.fancyPrint(" That's not a decimal number ");
			keyboard.nextLine();
			return this.getFloat(allowInvalid);
		}
	}

	public Float[] getFloatList(int qtty, Boolean allowInvalid) {
		ArrayList<Float> dynList = new ArrayList<Float>();
		for (int i = 0; i < qtty; i++) {
			dynList.add(this.getFloat(allowInvalid));
		}
		return dynList.toArray(new Float[0]);
	}

	// Printing
	public void printMenu() {
		System.out.println("-----------------");
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + ".-" + options[i]);
		}
		System.out.println("-----------------");
	}

	public void printHeader() {
		System.out.println("----------------->>------------------");
		System.out.println("- Contreras González Gareth Esaú	-");
		System.out.println("- 3APV								-");
		System.out.println("- Submódulo 1: Metodología espiral	-");
		System.out.println("- para dessarrollo de software		-");
		System.out.println("----------------->>------------------");
	}

	public void fancyPrint(String s) {
		System.out.println("-----------------");
		System.out.println(s);
		System.out.println("-----------------");
	}

	public void multifancyPrint(String[] sa) {
		System.out.println("-----------------");
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
		System.out.println("-----------------");
	}

	public void clearScreen() {
		try {
			new ProcessBuilder("clear").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println("|| Couldn't clear Screen");
		}
	}
}
/*
 * Class created by ContrerasGonz
 * Do not copy
 * Please
 * Please...
 */