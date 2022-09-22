
class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.clearScreen();

		// Calcular el area de un triángulo, cuadrado, rectángulo y círculo 
		// Con datos introducidos por el usuario
		double PI = 3.1415926535 ;
		menu.fancyPrint(" Introduzca la base y altura de su triángulo ");
		Float[] trianglev = menu.getFloatList(2);
		menu.fancyPrint(" Introduzca la longitud de los lados de su cuadrado ");
		float squarev = menu.getFloat();
		menu.fancyPrint(" Introduzca el ancho y alto de su rectángulo ");
		Float[] rectanglev = menu.getFloatList(2);
		menu.fancyPrint(" Introduzca el radio de su círculo ");
		float circlev = menu.getFloat();

		String[] sa = {
			"El área del triángulo es de: " + (trianglev[0] * trianglev[1] / 2 ),
			"El área del cuadrado es de: " + ( squarev * squarev ),
			"El área del rectángulo es de: " + (rectanglev[0] * rectanglev[1] ),
			"El área del círculo es de: " + ( PI * (circlev * circlev) )
		};

		menu.multifancyPrint(sa);
	}
}