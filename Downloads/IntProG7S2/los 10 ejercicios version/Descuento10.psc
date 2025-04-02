// Descuento de un 10 MOD 
Algoritmo Descuebto10
	Definir total, valorDeProducto, cantidad, descuento, resultado Como Real; //  MOD 
	Escribir 'Dime el valor del producto en $: ';
	Leer valorDeProducto;
	Escribir 'Dime la cantidad que llevaras: ';
	Leer cantidad;
	total <- valorDeProducto*cantidad;
	descuento <- total*0.1;
	resultado <- total-descuento;
	Escribir 'El total de tus productos o producto con un descuento del 10% aplicado es: ', '$', resultado;
FinAlgoritmo
