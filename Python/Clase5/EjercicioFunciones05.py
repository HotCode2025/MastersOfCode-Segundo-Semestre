# Ejercicio 5: Convertidor de temperaturas con menú

def celsius_a_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

def menu():
    print("\n--- CONVERTIDOR DE TEMPERATURAS ---")
    print("1. Convertir de Celsius a Fahrenheit")
    print("2. Convertir de Fahrenheit a Celsius")
    print("3. Salir")

while True:
    menu()
    opcion = input("Elige una opción: ")

    if opcion == "1":
        c = float(input("Ingrese la temperatura en Celsius: "))
        print(f"{c}°C = {celsius_a_fahrenheit(c):.2f}°F")

    elif opcion == "2":
        f = float(input("Ingrese la temperatura en Fahrenheit: "))
        print(f"{f}°F = {fahrenheit_a_celsius(f):.2f}°C")

    elif opcion == "3":
        print("Saliendo del convertidor. ¡Hasta luego!")
        break

    else:
        print("Opción inválida, intenta de nuevo.")