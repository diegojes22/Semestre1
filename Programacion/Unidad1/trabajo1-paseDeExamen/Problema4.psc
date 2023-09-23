Algoritmo Problema4
	Definir radio, altura, area, circunferencia Como Real;
	
	Escribir "Ingrese el radio: ";
	Leer radio;
	Escribir "Ingrese la altura: ";
	Leer altura;
	
	area = (2 * pi * radio * altura) + ( 2 * pi * radio^2);
	circunferencia = 2 * pi * radio;
	
	Escribir "Area = ", area;
	Escribir "Circunferencia = ", circunferencia;
FinAlgoritmo
