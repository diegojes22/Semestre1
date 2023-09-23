funcion resultado <- suma(n1, n2)
	definir resultado Como Entero;
	resultado <- n1 + n2;
FinFuncion

funcion resultado <- resta(n1, n2)
	definir resultado Como Entero;
	resultado <- n1 - n2;
FinFuncion

funcion resultado <- multiplicacion(n1, n2)
	definir resultado Como Entero;
	resultado <- n1 * n2;
FinFuncion

funcion resultado <- division(n1, n2)
	definir resultado Como Entero;
	resultado <- n1 / n2;
FinFuncion

proceso main
	Definir opcion_, num1, num2 Como Entero;
	
	repetir
		Escribir "(1) Sumar dos numeros";
		Escribir "(2) Restar dos numeros";
		Escribir "(3) Multiplicar dos numeros";
		Escribir "(4) Dividir dos numeros";
		Escribir "(5) Salir";
		
		Escribir ">_ ";
		Leer opcion_;
		
		segun opcion_ Hacer
			caso 1: 
				Escribir "Ingrese numero 1: ";
				Leer num1;
				Escribir "Ingrese numero 2: ";
				Leer num2;
				
				Escribir "Resultado: " Sin Saltar;
				Escribir suma(num1, num2);
			caso 2:
				Escribir "Ingrese numero 1: ";
				Leer num1;
				Escribir "Ingrese numero 2: ";
				Leer num2;
				
				Escribir "Resultado: " Sin Saltar;
				Escribir resta(num1, num2);
			caso 3:
				Escribir "Ingrese numero 1: ";
				Leer num1;
				Escribir "Ingrese numero 2: ";
				Leer num2;
				
				Escribir "Resultado: " Sin Saltar;
				Escribir multiplicacion(num1, num2);
			caso 4:
				Escribir "Ingrese numero 1: ";
				Leer num1;
				Escribir "Ingrese numero 2: ";
				Leer num2;
				
				Escribir "Resultado: " Sin Saltar;
				Escribir division(num1, num2);
		FinSegun
		
		Escribir "Pulse una tecla para continuar...";
		Esperar Tecla;
		Limpiar Pantalla;
	Hasta Que opcion_ == 5;
FinProceso
	