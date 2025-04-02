// convertir usd a nio
Algoritmo convertirUsdANio
	Definir usd, tasaDeCambio, resultado Como Real;
	tasaDeCambio <- 36.80;
	Escribir ' Introduce tu cantidad en $: ';
	Leer usd;
	resultado <- usd*tasaDeCambio;
	Escribir 'Tu monto en C$ es : ', resultado;
FinAlgoritmo
