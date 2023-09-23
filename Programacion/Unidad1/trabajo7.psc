// ACTIVIDAD: realizar una funcion que
// resuleva la formula general

funcion formulaGeneral(a, b, c)
	definir x1, x2, sqrt Como Real;
	x1 <- 0; x2 <- 0;
	
	sqrt <- (b^2) -4 * a * c;
	
	si sqrt < 1 Entonces
		Escribir "No hay solucion :(";
	SiNo
		x1 = (-b + raiz( sqrt ) ) / 2*a;
		x2 = (-b - raiz( sqrt ) ) / 2*a;
	FinSi
	
	Escribir "X1 = ",x1;
	Escribir "X2 = ",x2;
FinFuncion

Proceso main
	Definir A, B, C Como Entero;
	Escribir "FORMULA GENERAL";
	
	Escribir "Ingrese a: " Sin Saltar;
	Leer A;
	Escribir "Ingrese b: " Sin Saltar;
	Leer B;
	Escribir "Ingrese c: " Sin Saltar;
	Leer C;
	
	formulaGeneral(A, B, C);
FinProceso
