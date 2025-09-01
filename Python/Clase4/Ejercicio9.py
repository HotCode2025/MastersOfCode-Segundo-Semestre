# Ejercicio 6: Tabla de multiplicar

num = int(input("Introduce un número: "))

tabla = []

for i in range(1, 11):  # Del 1 al 10
    tabla.append(num * i)

print(f"La tabla de multiplicar de {num} es:")
print(tabla)