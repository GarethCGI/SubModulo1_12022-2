class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.clearScreen();

		float a,b;
		menu.printHeader();
		menu.fancyPrint(" Ingresa un valor decimal ");
		a = menu.getFloat();
		menu.fancyPrint(" Ingresa otro valor decimal ");
		b = menu.getFloat();

		String sa[] = {
			"El resultado de la suma es: " + (a+b),
			"El resultado de la resta es: " + (a-b),
			"El resultado de la multiplicación es: " + (a*b),
			"El resultado de la división es: " + (a/b)
		};

		menu.multifancyPrint(sa);
	}
}