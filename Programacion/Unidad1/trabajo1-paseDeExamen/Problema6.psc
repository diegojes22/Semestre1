Algoritmo Problema6
	Definir num1, num2, num3 Como Entero;
	Definir promedio como Real;
	
	Escribir "Ingrese 3 numeros enteros:";
	Leer num1;
	Leer num2;
	Leer num3;
	
	promedio = (num1 + num2 + num3) / 3;
	
	Escribir "El promedio es de :", promedio;
	
	si num1 > promedio y num1 > num2 y num1 > num3 Entonces
		Escribir "El mayor es ",num1;
		
	SiNo
		si num2 > promedio y num2 > num1 y num2 > num3 Entonces
			Escribir "El mayor es ",num2;
		SiNo
			si num3 > promedio y num3 > num2 y num3 > num1 Entonces
				Escribir "El mayor es ",num3;
			FinSi
		FinSi
	FinSi

FinAlgoritmo
