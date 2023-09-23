Algoritmo Problema2
	definir base, altura, hipotenusa, perimetro Como Real;
	
	Escribir  "Ingrese la base: ";
	Leer base;
	Escribir "Ingrese la altura: ";
	Leer altura;
	
	hipotenusa = raiz( (base^2) + (altura^2) )
	
	Escribir "La hip mide ", hipotenusa, " unidades";
	
	perimetro = base + altura + hipotenusa;
	
	Escribir "El perimetro es de ", perimetro, " unidades";
	
FinAlgoritmo
