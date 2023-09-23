Algoritmo Problema2_Solucion2
	definir horas, minutos, seg, input_secons Como Entero;
	
	Escribir "Ingrese los segundos: ";
	Leer input_secons;
	
	horas <- Trunc(input_secons / 3600);
	minutos <- Trunc(input_secons / 60) MOD 60;
	seg <- input_secons MOD 60;
	
	Escribir horas," : ",minutos," : ",seg;
FinAlgoritmo
