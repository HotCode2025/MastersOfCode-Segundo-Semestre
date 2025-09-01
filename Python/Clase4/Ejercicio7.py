# Ejercicio 4: Sumar números pares dentro de un rango

# Pedimos los límites del rango
inicio = int(input("Introduce el número inicial del rango: "))
fin = int(input("Introduce el número final del rango: "))

suma = 0

for i in range(inicio, fin + 1):  # Recorremos el rango (incluyendo el final)
    if i % 2 == 0:  # Verificamos si es par
        suma += i

print(f"La suma de los números pares de {inicio} a {fin} es: {suma}")