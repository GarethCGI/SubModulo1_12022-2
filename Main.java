import static java.lang.Math.sqrt;

class Main {
	public static void main(String[] args) {
		MenuIO io = new MenuIO();
		io.clearScreen();
		final String RESET = IOColor.RESET.label;
		/* 9
		*	Imprimir Figuritas
		*/
		io.fancyPrint(IOColor.PURPLE.label + " Introduce un tamaño " + RESET);
		int length = io.getInt(false);
		// Inv pyramid
		for (int i = 0; i <= length; i++) {
			for (int j = length; j > i; j--) {
				io.printRandColor("~");
			}
			io.println("~");
		}
		// Circle
		double dist;
		for (int i = 0; i <= 2 * length; i++) {
			for (int j = 0; j <= 2 * length; j++) {
				dist = sqrt((i - length) * (i - length) + (j - length) * (j - length));
				if (dist > length - 0.5 && dist < length + 0.5)
					io.printRandColor("~");
				else
					io.printRandColor(" ");
			}
			io.println("");
		}
		// Box
		int x = length, y = length;
		for (int i = 0; i < y; i++) {
			io.printRandColor("~");
		}
		io.println("");
		for (int i = 0; i < x - 2; i++) {
			io.printRandColor("~");
			for (int j = 0; j < y - 2; j++) {
				io.printRandColor(" ");
			}
			io.println("~");
		}
		for (int i = 0; i < y; i++) {
			io.printRandColor("~");
		}
		io.println("");
		
	}
}