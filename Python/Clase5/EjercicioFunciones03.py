# Ejercicio 3: Funcion Recursiva
# Imprimir numeros  de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo

def imprimir_descendente(n):
    if n == 0:
        return
    print(n)
    imprimir_descendente(n - 1)

imprimir_descendente(5)


# Tarea: que el numero lo ingrese el usuario
# Pedir al usuario que ingrese un número positivo
numero = int(input("Ingrese un número positivo: "))

if numero > 0:
    imprimir_descendente(numero)
else:
    print("Número inválido. Debe ser un número positivo.")

