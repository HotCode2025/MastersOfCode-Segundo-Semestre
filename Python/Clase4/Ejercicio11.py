# Ejercicio 8: Menú interactivo - Cajero automático

saldo = 1000  # saldo inicial

while True:
    print("\n===== Cajero Automático =====")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    
    opcion = input("Elige una opción (1-4): ")
    
    if opcion == "1":
        cantidad = float(input("¿Cuánto dinero deseas ingresar? $"))
        saldo += cantidad
        print(f" Has ingresado ${cantidad}. Saldo actual: ${saldo}")
    
    elif opcion == "2":
        cantidad = float(input("¿Cuánto dinero deseas retirar? $"))
        if cantidad > saldo:
            print(" No tienes suficiente saldo.")
        else:
            saldo -= cantidad
            print(f" Has retirado ${cantidad}. Saldo actual: ${saldo}")
    
    elif opcion == "3":
        print(f" Tu saldo actual es: ${saldo}")
    
    elif opcion == "4":
        print(" Gracias por usar el cajero automático. ¡Hasta luego!")
        break
    
    else:
        print(" Opción no válida. Intenta de nuevo.")