//---=== Funciones ====---//

// calcular el factorial de un numero.
// El factorial es el 'numero' multiplicado
// por los numeros anteriores
funcion factorial(num)
	definir resultado, contador Como Entero;
	
	contador <- 1;
	resultado <- 1;
	
	Repetir // realizar el calculo del factorial
		resultado <- contador * resultado;
		contador <- contador + 1;
	Hasta Que contador > num;
	
	Escribir resultado;
FinFuncion

// calcular la potencia de X^Y.
// funcion inesesaria pero la pongo
// cumplir con los requisitos
funcion exponencial(base, expo)
	definir resultado Como Entero;
	resultado <- base ^ expo;
	
	Escribir resultado;
FinFuncion

// Esta funcion muestra la susecion de Fibonacci
funcion fibonacci(long)
	definir i, a, b Como Entero;
	a <- 1;
	b <- 0;
	
	Para i <- 0 Hasta long Con Paso 1 Hacer
		Escribir b,", ",a,", " Sin Saltar;
		b = a + b;
		
		a = trunc(a + b);
	Fin Para
	
	Escribir "";
FinFuncion

// Esta funcion limpia la pantalla hasta
// que el usuario presione una tecla.
// Muy util para el programa que se esta
// desarrollando
funcion wait(null)
	lines(0);
	Escribir "Presione una tecla para continuar...";
	
	Esperar Tecla;
	Limpiar Pantalla;
FinFuncion

// Imprimir una linea larga para
// darle una mejor estetica en la consola
funcion lines(nul)
	Definir long Como Entero;
	long = 0;
	
	mientras long < 40 Hacer
		Escribir "-" Sin Saltar;
		long = long + 1;
	FinMientras
	
	Escribir "";
FinFuncion

//---===[ Main ]===---*/
Proceso main
	Definir numero, opcion, base, exponente Como Entero;
	
	Repetir // mainloop
		// Imprimir opciones
		lines(0);
		Escribir "[1] Calcular el factorial de un numero";
		Escribir "[2] Calcular potencia";
		Escribir "[3] Serie de fibonacci";
		Escribir "[4] Salir";
		
		Leer opcion;
		lines(0);
		
		// menus
		segun opcion Hacer
			caso 1:
				Escribir "Numero a factorizar " Sin Saltar;
				Leer numero;
				
				factorial(numero);
			caso 2:
				Escribir "Base: " Sin Saltar;
				Leer base;
				Escribir "Exponente: " Sin Saltar;
				Leer exponente;
				
				exponencial(base, exponente);
			caso 3:
				Escribir "Susecion de Fibonacci";
				fibonacci(20);
		FinSegun
		
		wait(0)
		
	Hasta Que opcion == 4;
FinProceso
