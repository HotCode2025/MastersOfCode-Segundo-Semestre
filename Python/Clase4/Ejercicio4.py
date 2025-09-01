# Ejercicio 1: Llenar una lista con los números del 1 al 50

# Creamos la lista vacía
numeros = []

# Llenamos la lista con los números del 1 al 50 usando un bucle for
for i in range(1, 51):
    numeros.append(i)

# Mostramos la lista en el formato pedido
# Convertimos cada número a string y los unimos con "-"
resultado = "-".join(str(num) for num in numeros)

print(resultado)