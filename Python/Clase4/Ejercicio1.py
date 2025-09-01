# Ejercicio 1: Eliminar duplicados de una lista
# Creamos una lista con elementos repetidos
lista = [1, 2, 2, 3, 4, 4, 5, 1, 6, 3, 7]

print("Lista original:", lista)

# Convertimos la lista en un conjunto para eliminar duplicados
lista_sin_duplicados = list(set(lista))

print("Lista sin duplicados:", lista_sin_duplicados)