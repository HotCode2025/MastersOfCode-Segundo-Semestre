# Ejercicio 3: Funcion Recursiva
# Tarea: que el numero lo ingrese el usuario
# Imprimir números de manera descendente

def imprimir_descendente(n):
    if n <= 0:  # Caso base: cuando n llega a 0 o menor, se detiene
        return
    print(n)
    imprimir_descendente(n - 1)

# Pedir al usuario que ingrese un número positivo
numero = int(input("Ingrese un número positivo: "))

if numero > 0:
    imprimir_descendente(numero)
else:
    print("Número inválido. Debe ser un número positivo.")
