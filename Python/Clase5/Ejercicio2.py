# Ejercicio 11: Agenda telefónica

def menu():
    print("\n--- AGENDA TELEFÓNICA ---")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

# Diccionario para guardar contactos
agenda = {}

while True:
    menu()
    opcion = input("Elige una opción: ")

    if opcion == "1":
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el número de teléfono: ")
        agenda[nombre] = telefono
        print(f"Contacto {nombre} agregado.")

    elif opcion == "2":
        nombre = input("Ingrese el nombre del contacto a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print(f"Contacto {nombre} eliminado.")
        else:
            print("El contacto no existe.")

    elif opcion == "3":
        if agenda:
            print("\n--- Contactos ---")
            for nombre, telefono in agenda.items():
                print(f"{nombre}: {telefono}")
        else:
            print("La agenda está vacía.")

    elif opcion == "4":
        print("Saliendo de la agenda. ¡Hasta luego!")
        break

    else:
        print("Opción inválida, intenta de nuevo.")