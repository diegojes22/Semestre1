funcion resultado <- suma(num1, num2)
	definir resultado Como Entero;
	resultado <- num1 + num2;
FinFuncion

Proceso main
	definir n1, n2, opc Como Entero;
	
	Escribir "Ingresa el numero 1: ";
	Leer n1;
	Escribir "Ingresa el numero 2: ";
	leer n2;
	
	Escribir "Resultado: ", suma(n1, n2);
	
	// test
	opc <- suma(5,6) + 1000;
	Escribir opc;
FinProceso