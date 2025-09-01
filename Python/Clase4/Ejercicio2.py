# Ejercicio 2: Operaciones de conjuntos con listas

# Definimos dos listas de ejemplo
lista1 = ["manzana", "pera", "uva", "banana", "kiwi"]
lista2 = ["pera", "kiwi", "melon", "sandia", "banana"]

print("Lista 1:", lista1)
print("Lista 2:", lista2)

# Convertimos las listas en conjuntos para evitar duplicados
conjunto1 = set(lista1)
conjunto2 = set(lista2)

# 1. Lista de palabras que aparecen en las listas (union)
lista_union = list(conjunto1 | conjunto2)
print("\n1) Palabras en ambas listas:", lista_union)

# 2. Palabras que aparecen en la primera lista, pero no en la segunda (diferencia)
solo_primera = list(conjunto1 - conjunto2)
print("2) Palabras solo en la primera lista:", solo_primera)

# 3. Palabras que aparecen en la segunda lista, pero no en la primera (diferencia)
solo_segunda = list(conjunto2 - conjunto1)
print("3) Palabras solo en la segunda lista:", solo_segunda)

# 4. Palabras que aparecen en ambas listas (intersección)
en_ambas = list(conjunto1 & conjunto2)
print("4) Palabras en ambas listas:", en_ambas)