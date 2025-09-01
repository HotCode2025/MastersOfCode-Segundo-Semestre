# Ejercicio 3: Insertar elementos y ordenarlos

numeros = []  # Lista vacía para guardar los números

while True:
    num = int(input("Introduce un número (0 para terminar): "))
    if num == 0:
        break  # Si el usuario introduce 0, terminamos el bucle
    numeros.append(num)  # Agregamos el número a la lista

# Ordenamos la lista
numeros.sort()

# Mostramos los números ordenados
print("Números ordenados de menor a mayor:")
print(numeros)