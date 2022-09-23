class Main {
	public static void main(String[] args) {
		MenuIO io = new MenuIO();
		io.clearScreen();

		// 7
		// Imprimir las tablas de multiplicar
		// Usa ciclo for
		// UserInput de la tabla a calcular
		io.fancyPrint(" Introduce un número ");
		int multiplier = io.getInt(false);
		String sa[] = new String[10];
		for (int i = 0; i < 10; i++) {
			sa[i] = (i + 1) + " × " + multiplier + " = " + (multiplier * (i + 1));
		}
		io.fancyPrint("La tabla del número " + multiplier);
		io.multifancyPrint(sa);
	}
}