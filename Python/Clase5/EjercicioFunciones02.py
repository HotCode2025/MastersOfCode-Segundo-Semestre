# Ejercicio 2:

def multiplicar(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

print(multiplicar(2, 3, 4))      # Resultado: 24
print(multiplicar(5, 10))        # Resultado: 50
print(multiplicar(1, 2, 3, 4))   # Resultado: 24
