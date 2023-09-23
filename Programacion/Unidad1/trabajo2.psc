Algoritmo Ejercicio2_equipo6
	Definir linea Como Caracter;
	Definir num, contador Como Entero;
	
	linea = "";
	
	Escribir "Ingrese un numero:";
	Leer num;
	
	Para contador <- 0 Hasta num Con Paso 1 Hacer
		linea = linea + "*";
		Escribir linea;
	Fin Para
FinAlgoritmo
