#lista = ariel, liliana, natalia, osvaldo

nombres = ['Naty','Osvaldo','Lily','Ariel']
print(nombres)
print(nombres[0:2]) #solo nos muestra le indice 0, 1 pero no el indice 2
#ir al inicio de la lista al indice (sin incluirlo)
print(nombres[0:3])#indices a mostrar 0, 1, 2
#desde el indice indicado hasta el final

print(nombres[1: ])
#modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'

print(nombres)
#iterar una lista

for nombre in nombres: #nombre es singular, la lista es plural 
    print(nombre)
else:
    print('se acabaron los elementos de la lista')


#preguntamos cuantos elementos tiene
print(len(nombres))#le pasamos como parametro la lista

#agregamos un elemento
nombres.append('Marcelo')
print(nombres)

#insertar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)

nombres.insert(3, 'Debora')
print(nombres)


#Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres)

#eliminar un indice especifico
del nombres[2] #del significa delete
print(nombres)

#Eliminar, borrar o limpiar todos los elementos

nombres.clear()
print(nombres)

#eliminar la lista
del nombres
#print(nombres)

#definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

#acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
#mostrar de manera inversa
print(cocina[-1])

#acceder a un rango
print(cocina[0:2])

#ejemplo
verduras = ('papa',) #una tupla necesita aunque sea un elemento: la coma
#de lo contrario solo seria un tipo str cadena
#recorremos los elementos de la tupla 
for cocinar in cocina: #print esta usando \n para saltos de lineas
    print(cocinar,end='')#usamos end= para eliminar los saltos de lineas

cocinaLista = list(cocina)
cocinaLista[0]='plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

#del cocina esto es para eliminar una tupla

