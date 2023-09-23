Algoritmo Problema5
	definir vendido, comision, taza, total, paga Como Entero;
	paga = 1000;
	
	Escribir "Ingrese lo que se vendio en un mes: ";
	Leer vendido;
	
	si vendido >= 20000 Entonces
		taza = 20;
		comision = vendido * 0.20;
	SiNo
		si vendido < 20000 y vendido > 10000 Entonces
			taza = 15;
			comision = vendido * 0.15;
		SiNo
			taza = 0;
			comision = 0;
		FinSi
	FinSi
	
	total = (paga * 4) + comision;
	
	Escribir "Vendido: $", vendido;
	Escribir "Taza: ", taza, "%";
	Escribir "Comision: $", comision;
	Escribir "Paga semanal: $", paga;
	Escribir "Total en un mes: $", total;
FinAlgoritmo
