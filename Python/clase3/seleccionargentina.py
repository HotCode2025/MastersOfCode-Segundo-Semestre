seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 38, 'Altura': 1.70, 'Precio': '18 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Giovani Lo Celso', 'Edad': 27, 'Altura': 1.77, 'Precio': '16 Millones', 'Posicion': 'Mediocentro Ofensivo'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 30, 'Altura': 1.77, 'Precio': '25 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 35, 'Altura': 1.83, 'Precio': '1.5 Millones', 'Posicion': 'Defensa Central'},
    1:  {'Nombre': 'Emiliano Martinez', 'Edad': 31, 'Altura': 1.95, 'Precio': '28 Millones', 'Posicion': 'Portero'},
    9:  {'Nombre': 'Julian Alvarez', 'Edad': 23, 'Altura': 1.70, 'Precio': '90 millones', 'posicion': 'Delantero Central'},
    22: {'Nombre': 'Lautaro Martinez', 'Edad': 26, 'Altura': 1.74, 'Precio': '110 millones', 'Posicion': 'Delantero Central'},
    17: {'Nombre': 'Alejandro Garnacho', 'Edad': 19, 'Altura': 1.80, 'Precio': '30 millones', 'Posicion': 'Extremo izquierdo'},
    8:  {'Nombre': 'Enzo Fernandez', 'Edad': 22, 'Altura': 1.78, 'Precio': '80 millones', 'Posicion': 'Mediocentro' }
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print('tenemos cargados en el diccionario la cantidad de jugadores: ', end='')
print(len(seleccionArgentina))
