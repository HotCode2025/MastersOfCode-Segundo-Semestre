# Ejercicio 2: Modificar los elementos de una lista

# Creamos la lista con los números del 1 al 10
numeros = list(range(1, 11))

print("Lista original:", numeros)

# Pedimos al usuario un número para multiplicar
multiplicador = int(input("Ingrese un número para multiplicar los elementos de la lista: "))

# Modificamos los elementos de la lista
for i in range(len(numeros)):
    numeros[i] *= multiplicador  # Multiplicamos cada elemento

print("Lista modificada:", numeros)