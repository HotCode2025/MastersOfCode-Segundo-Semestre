# Ejercicio 10: No repetir caracteres

# Pedir una cadena por teclado
cadena = input("Ingresa una cadena: ")

# Crear una lista vacía
lista_sin_repetidos = []

# Recorrer cada caracter de la cadena
for caracter in cadena:
    if caracter not in lista_sin_repetidos:
        lista_sin_repetidos.append(caracter)

# Mostrar la lista resultante
print("Lista de caracteres sin repetir:", lista_sin_repetidos)