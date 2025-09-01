# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud

frase = input("Introduce una frase: ")

# Eliminar los espacios
frase_sin_espacios = frase.replace(" ", "")

# Contar caracteres sin espacios
longitud = len(frase_sin_espacios)

print(f"Frase final: {frase_sin_espacios}")
print(f"N° de caracteres (sin espacios): {longitud}")