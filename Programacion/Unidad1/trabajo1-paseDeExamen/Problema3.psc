Algoritmo Problema3
	Definir inputSeg, loop, seg, min, hour Como Entero;
	
	seg = 0; min = 0; hour = 0; loop = 0;
	
	Escribir "Ingrese los sengundos: ";
	Leer inputSeg;

	Repetir
		seg = seg + 1;
		
		si seg >= 60 Entonces
			seg = 0;
			min = min + 1;
		FinSi
		
		si min >= 60 Entonces
			min = 0
			hour = hour + 1
		FinSi
		
		loop = loop + 1;
	Hasta Que loop >= inputSeg;
	
	Escribir "Horas: ", hour;
	Escribir "Minutos: ", min;
	Escribir "Segundos: ", seg;
	
FinAlgoritmo
