// convertir nio a usd
Algoritmo convertirNioAUSD
	Definir nio, tasaDeCambio, resultado Como Real;
	tasaDeCambio <- 36.80;
	Escribir 'Introduce tu cantidad a convertir en C$: ';
	Leer nio;
	resultado <- nio/tasaDeCambio;
	Escribir 'Tu monto en $ es: ', resultado;
FinAlgoritmo
