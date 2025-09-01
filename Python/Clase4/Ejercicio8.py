# Ejercicio 5: Factorial de un número positivo

num = int(input("Introduce un número positivo: "))

if num < 0:
    print("El número debe ser positivo.")
else:
    factorial = 1
    for i in range(1, num + 1):
        factorial *= i
    
    print(f"El factorial de {num} es: {factorial}")