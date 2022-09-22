
class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.clearScreen();

		// Calcular el area de un triángulo, cuadrado, rectángulo y círculo 
		// Con datos introducidos por el usuario
		// Modificar el programa 4 y aplicar estructuras condicionales simples
		String[] o = {
			"1.- 			Calcular Triángulo",
			"2.- 			Calcular Cuadrado",
			"3.- 			Calcular Rectángulo",
			"4.- 			Calcular Circulo",
			"Otro Número.-	Cancelar",
		};
		menu.setOptions(o);

		menu.printMenu();
		int option = menu.getInt(true);
		double result = 0;
		if(option == 1){
			menu.fancyPrint(" Introduzca la base y altura de su triángulo ");
			Float[] trianglev = menu.getFloatList(2, false);
			result = (trianglev[0] * trianglev[1] / 2 );
		}
		else if(option==2){
			menu.fancyPrint(" Introduzca la longitud de los lados de su cuadrado ");
			float squarev = menu.getFloat(false);
			result = ( squarev * squarev );
		}
		else if(option==3){
			menu.fancyPrint(" Introduzca el ancho y alto de su rectángulo ");
			Float[] rectanglev = menu.getFloatList(2, false);
			result = (rectanglev[0] * rectanglev[1] );
		}
		else if(option==4){
			double PI = 3.1415926535 ;
			menu.fancyPrint(" Introduzca el radio de su círculo ");
			float circlev = menu.getFloat(false);
			result = ( PI * (circlev * circlev) );
		}
		else{
			menu.fancyPrint(" Bye! ");
			System.exit(0);
		}

		menu.fancyPrint(" El area de su figura es: " + result);
	}
}