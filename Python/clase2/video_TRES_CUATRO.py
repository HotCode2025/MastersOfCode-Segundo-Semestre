diccionario = {
    'IDE' : 'Integrated Development Environment',
    'POO' : 'Programación Orientada a Objetos',
    'SABD' : 'Sistema de Administración de Base de Datos'
}


print(len(diccionario))
print(diccionario)


print(diccionario['IDE'])


print(diccionario.get('POO'))
print(diccionario.get('SABD'))

diccionario['IDE'] = 'entorno de desarrollo integrado'
print(diccionario)

for termino in diccionario:
    print(diccionario)

    for termino, valor in diccionario.items():
        print(termino, valor)

        for termino in diccionario.keys():
            print(termino)

            for valor in diccionario.values():
                print (valor)

                print ('IDE' in diccionario)

                # Agregar
                diccionario['PK'] = 'Primary key'
                print(diccionario)

                # Eliminar elemento
                diccionario.pop('SABD')
                print(diccionario)

                # Vaciar
                diccionario.clear()
                print(diccionario)

                # Eliminar
                del diccionario