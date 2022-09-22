class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.clearScreen();
		
		System.out.println("Hello world!");
		final int X = 4;
		final int Y = 8;
		int sum, prod, div, sust;

		menu.fancyPrint("El valor de x es: " + X);
		menu.fancyPrint("El valor de y es: " + Y);

		sum = X + Y;
		prod = X * Y;
		div = X / Y;
		sust = X - Y;

		String sa[] = {
			"El resultado de la Suma es: "+sum,
			"El resultado de la Resta es: "+sust,
			"El resultado de la Multiplicación es: "+prod,
			"El resultado de la División es: "+div
		};
		menu.multifancyPrint(sa);
	}
}