# Ejercicio 3: Agregar personajes a una lista

# Creamos una lista que contiene diccionarios con los personajes
personajes = [
    {"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dúnadan del norte"},
    {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"},
    {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
]

# Mostramos los personajes
print("Lista de personajes del Señor de los Anillos:\n")
for personaje in personajes:
    print(f"Nombre: {personaje['Nombre']}, Clase: {personaje['Clase']}, Raza: {personaje['Raza']}")