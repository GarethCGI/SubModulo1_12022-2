class Main {
	public static void main(String[] args) {
		MenuIO menu = new MenuIO();
		menu.clearScreen();

		// 6.1
		// Elabora el código para un restaurant que ofrece comida variada
		// todos los dias de la semana
		// Ofreciendo entrada, plato fuerte, postre y bebida
		// Con su costo
		// Menú con opciones 7 por tipo de comida con costo

		// 6.2
		// Cine que ofrece funciones diferentes todos los días de la semana
		// Así como un combo
		// Anotar como resultado, titulo de la película, genero, horario y el combo
		// recomendado
		// Describiendo que tiene ese combo
		String[] daysArr = {
				"Lunes",
				"Martes",
				"Miercoles",
				"Jueves",
				"Viernes",
				"Sabado",
				"Domingo",
		};
		String[] dayMenu = new String[4];
		menu.printHeader();
		menu.fancyPrint(" Seleccione el día de hoy ");
		menu.setOptions(daysArr);
		int day = menu.getOption(false, false);
		switch (day) {
			case 1: {
				dayMenu[0] = "Arroz Rojo";
				dayMenu[1] = "Pechuga de pollo con ensalada";
				dayMenu[2] = "Helado";
				dayMenu[3] = "Agua de Limón";
				break;
			}
			case 2: {
				dayMenu[0] = "Spaghetti";
				dayMenu[1] = "Albondigas";
				dayMenu[2] = "Gelatina";
				dayMenu[3] = "Agua de Piña";
				break;
			}
			case 3: {
				dayMenu[0] = "Arroz Blanco";
				dayMenu[1] = "Pollo en caldo con verduras";
				dayMenu[2] = "Helado de Yogurt";
				dayMenu[3] = "Agua de Horchata";
				break;
			}
			case 4: {
				dayMenu[0] = "Sopa Aguada";
				dayMenu[1] = "Enchiladas";
				dayMenu[2] = "Flan";
				dayMenu[3] = "Agua de Jamaica";
				break;
			}
			case 5: {
				dayMenu[0] = "Arroz Verde";
				dayMenu[1] = "Pollo en Mole";
				dayMenu[2] = "Pastel de chocolate";
				dayMenu[3] = "Agua de Naranja";
				break;
			}
			case 6: {
				dayMenu[0] = "Sopa de Tornillo";
				dayMenu[1] = "Pollo frito a la Kentucky";
				dayMenu[2] = "Brownies";
				dayMenu[3] = "Agua de Limón";
				break;
			}
			case 7: {
				dayMenu[0] = "Sopa de Codito";
				dayMenu[1] = "Pollo Adobado";
				dayMenu[2] = "Ensalada de Fruta";
				dayMenu[3] = "Agua Simple";
				break;
			}
		}
		String[] sa = {
			" --	El menú del dia de hoy [ " + daysArr[day-1] + " ] es --",
			"	Entrada: " + dayMenu[0] + "	$30",
			"	Plato Fuerte: " + dayMenu[1] + "	$40",
			"	Postre: " + dayMenu[2] + "	$15",
			"	Bebida: " + dayMenu[3] + "	$10",
		};
		menu.multifancyPrint(sa);
	}
}