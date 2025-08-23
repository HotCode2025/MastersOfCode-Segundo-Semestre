# Tipo set
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas))

# Revisar si un elemento existe dentro de set
print('Júpiter' in planetas)

# Agregar un elemento
planetas.add('Tierra')
print(planetas)

# puede arrojar un error si el elemento no existe
planetas.remove('Júpiter')
print(planetas)
planetas.discard('Tierra')
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
print(planetas)