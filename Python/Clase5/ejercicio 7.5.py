#Ejercicio 3: Funcion Recursiva
# Imprimir numeros  de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo

def imprimir_descendente(n):
    if n == 0:
        return
    print(n)
    imprimir_descendente(n - 1)

imprimir_descendente(7)

