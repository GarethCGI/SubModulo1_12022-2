class Main {
	public static void main(String[] args) {
		MenuIO io = new MenuIO();
		io.clearScreen();
		final String RESET = IOColor.RESET.label;
		/* 8
		* [7]
		* Imprimir las tablas de multiplicar
		* Usa ciclo for
		* UserInput de la tabla a calcular (10 resultados)
		*
		* Usar While y do-while
		* Con Color
		*/
		io.fancyPrint(IOColor.GREEN.label + " Introduce un número " + RESET);
		int multiplier = io.getInt(false);
		String sa[] = new String[10];
		int i = 0;
		int max = 10;
		while (i < max) {
			String color = IOColor.random(0,10);
			sa[i] = color + "" + (i + 1) + " × " + multiplier + " = " + (multiplier * (i + 1)) + RESET;
			i++;
		}
		io.fancyPrint(IOColor.CYAN.label + "La tabla del número " + multiplier + RESET);
		io.multifancyPrint(sa);
		i = 0;
		io.fancyPrint(IOColor.GREEN.label + " Introduce otro número " + RESET);
		multiplier = io.getInt(false);
		do{
			String color = IOColor.random(0, 10);
			sa[i] = color + "" + (i + 1) + " × " + multiplier + " = " + (multiplier * (i + 1)) + RESET;
			i++;
		} while (i < max);
		io.fancyPrint(IOColor.PURPLE.label + "La tabla del número " + multiplier + RESET);
		io.multifancyPrint(sa);
	}
}