# Ejercicio 7: Juego adivina el número

import random

numero_secreto = random.randint(1, 100)  # Número aleatorio entre 1 y 100
intentos = 0
adivinado = False

print(" ¡Adivina el número entre 1 y 100!")

while not adivinado:
    intento = int(input("Introduce tu número: "))
    intentos += 1

    if intento == numero_secreto:
        adivinado = True
        print(f" ¡Felicidades! Adivinaste el número {numero_secreto} en {intentos} intentos.")
    elif intento < numero_secreto:
        print(" El número secreto es mayor.")
    else:
        print(" El número secreto es menor.")