class Persona: #Creamos una clase
    def __init__(self, nombre, apellido, edad): # Se lo llama metodo Init Dunder
        self .nombre = nombre
        self .apellido = apellido
        self .edad = edad

persona1 = Persona('Ariel', 'Bentacud', '40') # Necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona('Osvaldo', 'Giordanini', '45')
print('El objeto2 de la clase de persona: {persona2.nombre} {persona2.apellido} Su edad es:{persona2.edad} ')