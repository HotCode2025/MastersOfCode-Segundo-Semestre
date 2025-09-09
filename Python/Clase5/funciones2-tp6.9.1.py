# Ejercicio 1: Crear una función para sumar los valores recibidos de tipo
#numéricos, utilizando argumentos variables *args como parametros de la
#Función y agregar como resultado la suma de todos los valores pasados
#como argumentos.

def suma(*args):
    total =0
    for num in args:
        total += num
    return total

print(suma(1,2,3,4,5))#salida 15
print(suma(1,2))# salida 3
print(suma(1,2,1,1))# salida 5
