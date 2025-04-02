Algoritmo sin_titulo
	definir nombre, apellido, nombre_completo Como Caracter
	definir edad, edad_dias Como Entero
	definir peso, peso_kg Como Real
	
	escribir "Ingresa los siguientes datos:"
	Escribir "nombre"
	Leer nombre
	Escribir "apellido"
	leer apellido
	Escribir "Edad"
	leer edad
	Escribir "peso: "
	Leer peso
	nombre_completo = concatenar(apellido , nombre)
	edad_dias = edad * 365
	peso_kg = peso * 0.4536
	Escribir "********************************************"
	Escribir "Nombre completo: " nombre_completo
	Escribir "Edad en dias: " edad_dias
	Escribir "Peso Kg: " peso_kg
	Escribir "********************************************"
	
	
	
FinAlgoritmo
