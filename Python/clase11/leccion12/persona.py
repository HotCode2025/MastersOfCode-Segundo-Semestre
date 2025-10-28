class Persona:
    def __init__(self,nombre,edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return f'{self.nombre} {other.nombre}'
    def __sub__(self, other):
        return f'{self.edad} {other.edad}'

persona1 = Persona(nombre='joaquin', edad=20)
persona2 = Persona(nombre='navea', edad=21)

#persona1.__add__(persona2) sintaxis interna y automatica

print(persona1 + persona2)
print(persona1 - persona2)