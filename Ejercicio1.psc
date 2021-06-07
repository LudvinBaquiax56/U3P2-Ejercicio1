Algoritmo Ejercicio1
	Definir numero1 Como Entero
	Definir pares Como Entero
	Definir impares Como Entero
	Escribir 'Ingrese la cantidad de numeros que desa generar'
	Leer numero1
	Definir matriz Como Entero
	Dimension matriz(numero1)
	Escribir 'Los numeros que se generaron son: '
	Para i<-1 Hasta numero1 Con Paso 1 Hacer
		matriz(i) = Aleatorio(1,100)
		Escribir matriz(i)
	Fin Para
	Para i<-1 Hasta numero1 Con Paso 1 Hacer
		si matriz(i) mod 2 = 0
			pares = pares + 1
		SiNo
			impares = impares + 1
		FinSi
	FinPara
	Escribir 'La cantidad de numeros pares es ' pares
	Escribir 'La cantidad de numeros impares es ' impares
FinAlgoritmo
